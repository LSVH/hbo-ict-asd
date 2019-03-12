package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.WebcamVideoId;

public class VideoRepository implements VideoRepositoryInterface {
    public WebcamVideo getWebcamVideo(WebcamVideoId vid) {
        return new WebcamVideo();
    }
}
