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
    private List<Music>   genreList;

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        Random random = new Random();
        Music music = genreList.get(random.nextInt(3));
        System.out.println("Now playing: " + music.getMusicList().get(random.nextInt(3)));
    }
}
