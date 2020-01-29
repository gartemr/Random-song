package com.tema.springtest1;

import com.tema.springtest1.Genre.ClassicalMusic;
import com.tema.springtest1.Genre.RapMusic;
import com.tema.springtest1.Genre.RockMusic;
import org.springframework.beans.factory.annotation.Value;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> genreList;
    @Value("${musicPlayer.model}")
    private String model;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {return model; }

    public int getVolue() {
        return volume;
    }

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    //Воспроизведение рандомной песни рандомного жанра
    public void playMusic() {
        Random random = new Random();
        int randomGenre = random.nextInt(genreList.size());
        int randomSong = random.nextInt(3);
        System.out.println("Playing: " + "\n" +
                genreList.get(randomGenre).getSong().get(randomSong) + "\n" +
                "with volume " + this.volume + "\n" +
                "model:" + this.model);
    }

}
