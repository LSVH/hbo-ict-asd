package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

import java.util.ArrayList;

public class WebcamRepository implements WebcamRepositoryInterface {
    private ArrayList<WebcamVideo> store;

    public WebcamVideo getWebcam(WebcamVideoId webcamId) {
        return new WebcamVideo(webcamId);
    }
}