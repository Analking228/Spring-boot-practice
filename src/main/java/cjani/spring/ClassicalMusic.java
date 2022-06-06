package cjani.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    private List<String> musicList = new ArrayList<String>(Arrays.asList("Hungarian Rhapsody", "Requiem", "Seasons"));

    private     ClassicalMusic() {}

    @Override
    public List<String> getMusicList() {
        return musicList;
    }

    public static ClassicalMusic    getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    private void doMyInit() {
        System.out.println("am gay!");
    }
}
