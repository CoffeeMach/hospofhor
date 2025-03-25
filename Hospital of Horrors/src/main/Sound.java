package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    
    private Clip clip;
    URL soundURL[] = new URL[30]; //30 file path
    
    public Sound() {

        soundURL[0] = getClass().getClassLoader().getResource("res/sound/Theme.wav");
        soundURL[1] = getClass().getClassLoader().getResource("res/sound/SecondTheme.wav");
        soundURL[2] = getClass().getClassLoader().getResource("res/sound/ThirdTheme.wav");
        soundURL[3] = getClass().getClassLoader().getResource("res/sound/FourthTheme.wav");
        soundURL[4] = getClass().getClassLoader().getResource("res/sound/Water.wav");
        soundURL[5] = getClass().getClassLoader().getResource("res/sound/PickUp.wav");
        soundURL[6] = getClass().getClassLoader().getResource("res/sound/Blood.wav");
        soundURL[7] = getClass().getClassLoader().getResource("res/sound/Glass.wav");
        soundURL[8] = getClass().getClassLoader().getResource("res/sound/AcidDrop.wav");
        soundURL[9] = getClass().getClassLoader().getResource("res/sound/Wood.wav");
        soundURL[10] = getClass().getClassLoader().getResource("res/sound/Tree.wav");
        soundURL[11] = getClass().getClassLoader().getResource("res/sound/MixTheme.wav");
        soundURL[12] = getClass().getClassLoader().getResource("res/sound/ThemeLull.wav");
        soundURL[13] = getClass().getClassLoader().getResource("res/sound/Scream.wav");
        soundURL[14] = getClass().getClassLoader().getResource("res/sound/girl1.wav");
        soundURL[15] = getClass().getClassLoader().getResource("res/sound/RightWalk.wav");
        soundURL[16] = getClass().getClassLoader().getResource("res/sound/UpWalk.wav");
        soundURL[17] = getClass().getClassLoader().getResource("res/sound/LeftWalk.wav");
        soundURL[18] = getClass().getClassLoader().getResource("res/sound/DownWalk.wav");
        soundURL[19] = getClass().getClassLoader().getResource("res/sound/girl2.wav");
        soundURL[20] = getClass().getClassLoader().getResource("res/sound/girl3.wav");
        soundURL[21] = getClass().getClassLoader().getResource("res/sound/male1.wav");
        soundURL[22] = getClass().getClassLoader().getResource("res/sound/male2.wav");
        soundURL[23] = getClass().getClassLoader().getResource("res/sound/male3.wav");
        soundURL[24] = getClass().getClassLoader().getResource("res/sound/intercom.wav");
        soundURL[25] = getClass().getClassLoader().getResource("res/sound/sleepingMonster.wav");
        soundURL[26] = getClass().getClassLoader().getResource("res/sound/Click.wav");
        soundURL[27] = getClass().getClassLoader().getResource("res/sound/musicBox.wav");
    }

    public void setFile(int i) {

        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch(Exception e) {

        }
    }

    public void play() {

        clip.start();
    }

    public void loop() {

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}