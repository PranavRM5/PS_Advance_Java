/*

4. Media Player with Multiple Formats
Problem:
Create an interface MediaPlayer with methods play() and stop(). Implement two classes MP3Player and VideoPlayer that play and stop media in their respective formats (audio and video). Each class should print whether it's playing or stopping an audio or video file.

 */
interface MediaPlayers{
    void play();
    void stop();
}

class MP3Player implements MediaPlayers{
    @Override
    public void play() {
        System.out.println("Audio Player On...");
    }

    @Override
    public void stop() {
        System.out.println("Audio Player Stop.");
    }
}

class VideoPlayer implements MediaPlayers{
    @Override
    public void play() {
        System.out.println("Video Player On...");
    }

    @Override
    public void stop() {
        System.out.println("Video Player Stop.");
    }
}


public class MediaPlayer {
    public static void main(String[] args) {
        //MP3Player object
        System.out.println("************** MP3Player ***************");
        MP3Player mp = new MP3Player();
        mp.play();
        mp.stop();

        //VideoPlayer object
        System.out.println("*************** VideoPlayer ***************");
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.stop();
    }
}
