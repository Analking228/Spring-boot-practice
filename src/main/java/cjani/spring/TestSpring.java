package cjani.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.playMusic();
        Computer    computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
