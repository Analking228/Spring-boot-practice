package cjani.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusic();

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer2.playMusic();

        context.close();
    }
}
