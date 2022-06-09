package cjani.spring;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }

    @Bean
    public ElectronicMusic electronicMusic() {
        return ElectronicMusic.getElectronicMusic();
    }

    @Bean
    public RockMusic rockMusic() { return RockMusic.getRockMusic(); }

    @Bean
    public List<Music> genreList() { return new ArrayList<>(Arrays.asList(classicalMusic(), electronicMusic(), rockMusic()));
    }

    @Bean
    public MusicPlayer  musicPlayer() {
        return new MusicPlayer(genreList());
    }
}
