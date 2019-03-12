package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.WebcamVideoId;

public interface WebcamRepositoryInterface {
    WebcamVideo getWebcam(WebcamVideoId camId);
}