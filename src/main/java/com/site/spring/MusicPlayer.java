package com.site.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//	private Music music;
//	private String name;
//	private int volume;
	
//	@Autowired
//	private Music music;
	
	
//	private ClassicalMusic classicalMusic;
//	private RockMusic rockMusic;
	
//	@Autowired
//	@Qualifier("classicalMusic")
	private Music music1;
	private Music music2;
	
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}

//	@Autowired
//	public MusicPlayer(Music music) {
//		this.music = music;
//		
//	}
	
//	// IoC
//	public MusicPlayer(Music music) {
//		this.music = music;
//	}
	
//	@Autowired
//	public void setMusic(Music music) {
//		this.music = music;
//	}
	

//	@Autowired
//	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//		super();
//		this.classicalMusic = classicalMusic;
//		this.rockMusic = rockMusic;
//	}
//	
//	public String playMusic() {
////		System.out.println("Playing: " + classicalMusic.getSong());
////		System.out.println("Playing: " + rockMusic.getSong());
//		return "Playing: " + classicalMusic.getSong();
//	}


	@Autowired
	public MusicPlayer(@Qualifier("rockMusic") Music music1,
			@Qualifier("classicalMusic") Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}
	
	public String playMusic() {
		return "Playing: " + music1.getSong() + ", " + music2.getSong();
	}

}
