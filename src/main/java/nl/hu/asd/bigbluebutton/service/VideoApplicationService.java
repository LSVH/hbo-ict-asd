package nl.hu.asd.bigbluebutton.service;

import nl.hu.asd.bigbluebutton.adapter.VideoPublishServiceInterface;
import nl.hu.asd.bigbluebutton.factory.VideoStreamFactory;
import nl.hu.asd.bigbluebutton.model.*;
import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;
import nl.hu.asd.bigbluebutton.repository.VideoRepositoryInterface;
import nl.hu.asd.bigbluebutton.repository.WebcamRepositoryInterface;

public class VideoApplicationService {
    private VideoRepositoryInterface videoRepository;
    private WebcamRepositoryInterface webcamRepository;
    private VideoPublishServiceInterface videoPublishService;

    public VideoApplicationService(VideoRepositoryInterface videoRepository, WebcamRepositoryInterface webcamRepository, VideoPublishServiceInterface videoPublishService) {
        this.videoRepository = videoRepository;
        this.webcamRepository = webcamRepository;
        this.videoPublishService = videoPublishService;
    }

    public void ActivateWebcam(WebcamVideoId webcamVideoId, VideoEncoding videoEncoding) {
        WebcamVideo webcam = webcamRepository.getWebcam(webcamVideoId);

        webcam.setEncoding(videoEncoding);

        videoRepository.storeWebcamVideo(webcam);
    }

    public void PublishVideoStream(SenderId senderId, WebcamVideoId webcamVideoId, MeetingId meetingId, VideoQuality videoQuality) {
        WebcamVideo webcamVideo = videoRepository.getWebcamVideo(webcamVideoId);
        VideoStream videoStream = new VideoStreamFactory().buildVideoStream(webcamVideo, senderId, meetingId, videoQuality);

        videoPublishService.PublishStream(videoStream);
    }

    public VideoRepositoryInterface getVideoRepository() {
        return videoRepository;
    }

    public VideoPublishServiceInterface getVideoPublishService() {
        return videoPublishService;
    }
}