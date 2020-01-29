package com.tema.springtest1.Genre;

import com.tema.springtest1.Music;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> songList = new ArrayList<>();

    {
        songList.add("Rap God");
        songList.add("50 cent");
        songList.add("Gorod pod podoshvoi");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
