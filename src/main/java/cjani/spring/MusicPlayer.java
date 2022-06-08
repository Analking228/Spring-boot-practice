package cjani.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String  name;
    @Value("${musicPlayer.volume}")
    private int     volume;
    private Music   classical;
    private Music   electronic;

    public MusicPlayer(@Qualifier("classicalMusic") Music classical,
                       @Qualifier("electronicMusic") Music electronic) {
        this.classical = classical;
        this.electronic = electronic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        switch (genre){
            case CLASSICAL:
                System.out.println("Playing: " + classical.getMusicList().get(random.nextInt(3)) + "with volume: " + volume);
                break;
            case ELECTRONIC:
                System.out.println("Playing: " + electronic.getMusicList().get(random.nextInt(3)));
                break;
            default:
                System.out.println("Unknown music has been set");
                break;
        }
    }
}
