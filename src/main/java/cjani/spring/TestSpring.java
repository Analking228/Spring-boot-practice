package cjani.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.playMusic();

//        System.out.println("Name: " + musicPlayer1.getName() + ", volume: " + musicPlayer1.getVolume());

        System.out.println(musicPlayer1 == musicPlayer2);

        System.out.println(musicPlayer1 + " " + musicPlayer2);

        context.close();
    }
}
