package nl.hu.asd.bigbluebutton.model;

import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

public class WebcamVideo {

    private VideoEncoding encoding;
    private WebcamVideoId webcamVideoId;

    public WebcamVideo(WebcamVideoId webcamVideoId) {
        this.webcamVideoId = webcamVideoId;
    }

    public VideoEncoding getEncoding() {
        return encoding;
    }

    public void setEncoding(VideoEncoding encoding) {
        this.encoding = encoding;
    }
}