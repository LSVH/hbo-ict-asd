package nl.hu.asd.bigbluebutton.service;

import nl.hu.asd.bigbluebutton.model.*;
import nl.hu.asd.bigbluebutton.adapter.VideoServiceInterface;
import nl.hu.asd.bigbluebutton.repository.VideoRepositoryInterface;
import nl.hu.asd.bigbluebutton.repository.WebcamRepositoryInterface;

public class VideoApplicationService implements VideoServiceInterface {
    private VideoRepositoryInterface videoRepository;
    private WebcamRepositoryInterface webcamRepository;

    public VideoApplicationService(VideoRepositoryInterface videoRepository, WebcamRepositoryInterface webcamRepository) {
        this.videoRepository = videoRepository;
        this.webcamRepository = webcamRepository;
    }

    public void ActivateWebcam(WebcamVideoId webcamVideoId, VideoEncoding videoEncoding) {
        WebcamVideo webcam = webcamRepository.getWebcam(webcamVideoId);

        webcam.setEncoding(videoEncoding);
    }

    public void PublishVideoStream(SenderId senderId, WebcamVideoId webcamVideoId, MeetingId meetingId, VideoQuality videoQuality) {
        WebcamVideo webcamVideo = videoRepository.getWebcamVideo(webcamVideoId);
    }
}