package cjani.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic  classicalMusic;
    private ElectronicMusic electronicMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, ElectronicMusic electronicMusic) {
        this.classicalMusic = classicalMusic;
        this.electronicMusic = electronicMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + ", then: " + electronicMusic.getSong();
    }
}
