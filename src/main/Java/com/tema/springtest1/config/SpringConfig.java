package com.tema.springtest1.config;

import com.tema.springtest1.Genre.ClassicalMusic;
import com.tema.springtest1.Genre.RapMusic;
import com.tema.springtest1.Genre.RockMusic;
import com.tema.springtest1.Music;
import com.tema.springtest1.MusicPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.tema.springtest1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public List<Music> genreList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genreList());
    }

}
