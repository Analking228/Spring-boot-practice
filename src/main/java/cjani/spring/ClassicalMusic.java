package cjani.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> musicList = new ArrayList<String>(Arrays.asList("Hungarian Rhapsody", "Requiem", "Seasons"));

    private     ClassicalMusic() {}

    public static ClassicalMusic    getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public List<String> getMusicList() {
        return musicList;
    }
}
