package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.*;

public interface VideoServiceInterface {
    void ActivateWebcam(WebcamVideoId webcamVideoId, VideoEncoding videoEncoding);
    void PublishVideoStream(SenderId senderId, WebcamVideoId webcamVideoId, MeetingId meetingId, VideoQuality videoQuality);
}
