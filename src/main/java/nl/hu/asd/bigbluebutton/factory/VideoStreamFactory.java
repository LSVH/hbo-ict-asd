package nl.hu.asd.bigbluebutton.factory;

import nl.hu.asd.bigbluebutton.model.VideoStream;
import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.VideoStreamId;

public class VideoStreamFactory {


    public VideoStream buildVideoStream(WebcamVideo webcamVideo, SenderId senderId, MeetingId meetingId, VideoQuality videoQuality) {
        return new VideoStream(new VideoStreamId(senderId.getId() + meetingId.getId()), senderId, meetingId, videoQuality, webcamVideo);
    }
}
