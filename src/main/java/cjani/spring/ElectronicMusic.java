package cjani.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ElectronicMusic implements Music{
    List<String> musicList = new ArrayList<String>(Arrays.asList("Avaritia", "Fn Pig", "Pomegranade"));

    @Override
    public List<String> getMusicList() {
        return musicList;
    }
}
