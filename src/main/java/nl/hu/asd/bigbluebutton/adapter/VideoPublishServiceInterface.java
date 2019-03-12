package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.VideoStream;

import java.util.ArrayList;

public interface VideoPublishServiceInterface {
    void PublishStream(VideoStream videoStream);

    ArrayList<VideoStream> getStore();
}
