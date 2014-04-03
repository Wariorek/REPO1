package ApletyAplikacje;
import  sun.audio.*;
import  java.io.*;
import java.applet.AudioClip;

/**
 * Created by War on 17.03.14.
 */
public class MyAudioClip implements AudioClip {
    AudioStream as;
    public MyAudioClip(){

        try{
            InputStream in = new FileInputStream("D:\\[Sailor Moon R Movie] 14 Fukkatsu no Serenade.wav");
            as = new AudioStream(in);
        }
        catch(IOException e){
             System.out.println("BLad wejscia wyjscia");
        }

    }
    public void play() {
      AudioPlayer.player.start(as);
    }


    public void loop() {

    }


    public void stop() {
        AudioPlayer.player.stop(as);
    }
}
