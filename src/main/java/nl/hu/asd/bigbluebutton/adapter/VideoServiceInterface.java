package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

public interface VideoServiceInterface {
    void ActivateWebcam(WebcamVideoId webcamVideoId, VideoEncoding videoEncoding);
    void PublishVideoStream(SenderId senderId, WebcamVideoId webcamVideoId, MeetingId meetingId, VideoQuality videoQuality);
}
