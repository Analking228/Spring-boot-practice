package cjani.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music{
    private Genre genre = Genre.CLASSICAL;
    private List<String> musicList = new ArrayList<>(Arrays.asList("Hungarian Rhapsody", "Requiem", "Seasons"));

    private     ClassicalMusic() {}

    @Override
    public List<String> getMusicList() {
        return musicList;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }

    public static ClassicalMusic    getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    private void doMyInit() {
        System.out.println("am gay!");
    }
}
