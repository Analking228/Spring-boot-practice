package cjani.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music{
    private Genre genre = Genre.ROCK;
    private List<String> musicList = new ArrayList<>(Arrays.asList("War", "My Way", "Behind the Blue Eyes"));

    private RockMusic(){}

    public static RockMusic    getRockMusic() {return new RockMusic();}

    @Override
    public Genre    getGenre() {return genre;}

    @Override
    public List<String> getMusicList() {
        return musicList;
    }
}
