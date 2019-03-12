package nl.hu.asd.bigbluebutton.repository;

import nl.hu.asd.bigbluebutton.model.WebcamVideo;
import nl.hu.asd.bigbluebutton.model.WebcamVideoId;

public interface VideoRepositoryInterface {
    WebcamVideo getWebcamVideo(WebcamVideoId vid);
}
