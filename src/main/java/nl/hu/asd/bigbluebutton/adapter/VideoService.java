package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.*;
import nl.hu.asd.bigbluebutton.service.VideoApplicationService;

public class VideoService {
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
}