package com.tema.springtest1.Genre;

import com.tema.springtest1.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    private List<String> songList = new ArrayList<>();

    {
        songList.add("Canon Rock");
        songList.add("21 guns");
        songList.add("Duality");
    }

    @Override
        public List<String> getSong() {
        return songList;
    }
}
