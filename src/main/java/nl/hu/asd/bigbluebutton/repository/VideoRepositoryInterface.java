package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

public interface VideoRepositoryInterface {
    WebcamVideo getWebcamVideo(WebcamVideoId vid);
    void storeWebcamVideo(WebcamVideo webcamVideo);
}
