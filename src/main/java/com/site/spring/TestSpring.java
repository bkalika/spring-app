package com.site.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");

//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
//		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		
//		boolean comparison = firstMusicPlayer == secondMusicPlayer;
////		musicPlayer.playMusic();
////		System.out.println(musicPlayer.getName());
////		System.out.println(musicPlayer.getVolume());
//		System.out.println(comparison);
//		System.out.println(firstMusicPlayer);
//		System.out.println(secondMusicPlayer);
//		
//		firstMusicPlayer.setVolume(10);
//		
//		System.out.println(firstMusicPlayer.getVolume());
//		System.out.println(secondMusicPlayer.getVolume());
		
//		ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//		System.out.println(classicalMusic.getSong());
		
//		Music music = context.getBean("musicBean", Music.class);
//		Music music = context.getBean("rockMusic", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
//		musicPlayer.playMusic();
		
//		Music music2 = context.getBean("classicalMusic", Music.class);
		
//		MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//		classicalMusicPlayer.playMusic();
		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();
		
//		Computer computer = context.getBean("computer", Computer.class);
//		System.out.println(computer);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());

		ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//		ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
		
//		System.out.println(classicalMusic1 == classicalMusic2);

		context.close();
	}
}
