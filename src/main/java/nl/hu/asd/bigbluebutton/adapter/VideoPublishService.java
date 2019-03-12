package nl.hu.asd.bigbluebutton.adapter;

import nl.hu.asd.bigbluebutton.model.VideoStream;

import java.util.ArrayList;

public class VideoPublishService  implements VideoPublishServiceInterface{
    ArrayList<VideoStream> store = new ArrayList<VideoStream>();

    public void PublishStream(VideoStream videoStream) {
        store.add(videoStream);

        // Passes on the video stream to the meeting domain.
    }

    public ArrayList<VideoStream> getStore() {
        return store;
    }
}
