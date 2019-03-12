package nl.hu.asd.bigbluebutton;

import nl.hu.asd.bigbluebutton.adapter.VideoPublishService;
import nl.hu.asd.bigbluebutton.adapter.VideoPublishServiceInterface;
import nl.hu.asd.bigbluebutton.adapter.VideoService;
import nl.hu.asd.bigbluebutton.adapter.VideoServiceInterface;
import nl.hu.asd.bigbluebutton.model.enums.VideoEncoding;
import nl.hu.asd.bigbluebutton.model.enums.VideoQuality;
import nl.hu.asd.bigbluebutton.model.values.MeetingId;
import nl.hu.asd.bigbluebutton.model.values.SenderId;
import nl.hu.asd.bigbluebutton.model.values.WebcamVideoId;
import nl.hu.asd.bigbluebutton.repository.VideoRepository;
import nl.hu.asd.bigbluebutton.repository.VideoRepositoryInterface;
import nl.hu.asd.bigbluebutton.repository.WebcamRepository;
import nl.hu.asd.bigbluebutton.repository.WebcamRepositoryInterface;
import nl.hu.asd.bigbluebutton.service.VideoApplicationService;

public class App
{
    public static void main( String[] args )
    {
        VideoServiceInterface videoService = getVideoService();

        WebcamVideoId webcamVideoId = new WebcamVideoId();
        SenderId senderId = new SenderId();
        MeetingId meetingId = new MeetingId();


        videoService.ActivateWebcam(webcamVideoId, VideoEncoding.H263);
        videoService.PublishVideoStream(senderId, webcamVideoId, meetingId, VideoQuality.good);

    }

    public static VideoService getVideoService() {

        VideoRepositoryInterface videoRepository = new VideoRepository();
        WebcamRepositoryInterface webcamRepository = new WebcamRepository();
        VideoPublishServiceInterface videoPublishService = new VideoPublishService();
        VideoApplicationService videoApplicationService = new VideoApplicationService(videoRepository, webcamRepository, videoPublishService);

        return new VideoService(videoApplicationService);
    }
}
