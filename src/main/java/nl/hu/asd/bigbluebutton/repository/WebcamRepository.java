package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.WebcamVideoId;

public class WebcamRepository implements WebcamRepositoryInterface{
    public WebcamVideo getWebcam(WebcamVideoId camId) {
        return new WebcamVideo();
    }
}