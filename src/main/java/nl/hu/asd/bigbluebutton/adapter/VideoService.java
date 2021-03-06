package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;
import nl.hu.asd.bigbluebutton.repository.VideoRepositoryInterface;
import nl.hu.asd.bigbluebutton.service.VideoApplicationService;

public class VideoService implements VideoServiceInterface {
    private VideoApplicationService videoApplicationService;

    public VideoService(VideoApplicationService videoApplicationService) {
        this.videoApplicationService = videoApplicationService;
    }

    public void ActivateWebcam(WebcamVideoId webcamVideoId, VideoEncoding videoEncoding) {
        videoApplicationService.ActivateWebcam(webcamVideoId, videoEncoding);
    }

    public void PublishVideoStream(SenderId senderId, WebcamVideoId webcamVideoId, MeetingId meetingId, VideoQuality videoQuality) {
        videoApplicationService.PublishVideoStream(senderId, webcamVideoId, meetingId, videoQuality);
    }


    public VideoRepositoryInterface getVideoRepository() {
        return videoApplicationService.getVideoRepository();
    }

    public VideoPublishServiceInterface getVideoPublishService() {
        return videoApplicationService.getVideoPublishService();
    }
}