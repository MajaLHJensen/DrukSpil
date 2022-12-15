import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class InputsSound {
    public static void RunMusic(String path){
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(0);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}