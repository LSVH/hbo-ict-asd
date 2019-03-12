package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

import java.util.ArrayList;

public class VideoRepository implements VideoRepositoryInterface {
    private ArrayList<WebcamVideo> store;

    public VideoRepository() {
        this.store = new ArrayList<WebcamVideo>();
    }

    public WebcamVideo getWebcamVideo(WebcamVideoId webcamVideoId) {
        return new WebcamVideo(webcamVideoId);
    }

    public void storeWebcamVideo(WebcamVideo webcamVideo) {
        store.add(webcamVideo);
    }

    public ArrayList<WebcamVideo> getStore() {
        return store;
    }
}
