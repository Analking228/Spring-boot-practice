package cjani.spring;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    public MusicPlayer  musicPlayer() {
        return new MusicPlayer(classicalMusic(), electronicMusic());
    }
}
