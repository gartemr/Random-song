package com.tema.springtest1.Genre;

import com.tema.springtest1.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {
    private List<String> songList = new ArrayList<>();

    {
        songList.add("A Village Romeo and Juliet");
        songList.add("Porgi, amor");
        songList.add("Chi il bel sogno di Doretta ");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
