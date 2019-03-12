package nl.hu.asd.bigbluebutton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import nl.hu.asd.bigbluebutton.adapter.VideoServiceInterface;
import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;

public class AppTest extends TestCase {
    private VideoServiceInterface videoService;

    public AppTest(String testName )
    {
        super( testName );
        this.videoService = App.getVideoService();
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testActivateWebcam()
    {
        videoService.ActivateWebcam(new WebcamVideoId(), VideoEncoding.H263);

        assertEquals(1, videoService.getVideoRepository().getStore().size());
    }

    public void testPublishVideoStream()
    {
        videoService.PublishVideoStream(new SenderId(), new WebcamVideoId(), new MeetingId(), VideoQuality.good);

        assertEquals(1, videoService.getVideoPublishService().getStore().size());
    }
}
