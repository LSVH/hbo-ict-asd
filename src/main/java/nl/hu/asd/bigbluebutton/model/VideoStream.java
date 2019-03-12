package nl.hu.asd.bigbluebutton.model;

import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.VideoStreamId;

public class VideoStream {
    private VideoStreamId videoStreamId;
    private SenderId senderId;
    private MeetingId meetingId;
    private VideoQuality videoQuality;
    private WebcamVideo webcamVideo;

    public VideoStream(VideoStreamId videoStreamId, SenderId senderId, MeetingId meetingId, VideoQuality videoQuality, WebcamVideo webcamVideo) {
        this.videoStreamId = videoStreamId;
        this.senderId = senderId;
        this.meetingId = meetingId;
        this.videoQuality = videoQuality;
        this.webcamVideo = webcamVideo;
    }

    public VideoQuality getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }
}