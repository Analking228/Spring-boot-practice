package cjani.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music   classical;
    private Music   electronic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classical, @Qualifier("electronicMusic") Music electronic) {
        this.classical = classical;
        this.electronic = electronic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();

        switch (genre){
            case CLASSICAL:
                System.out.println("Playing: " + classical.getMusicList().get(random.nextInt(3)));
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
