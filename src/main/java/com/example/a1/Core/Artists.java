package com.example.a1.Core;
import com.example.a1.Implementation.Artist;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class Artists {

    private ConcurrentMap<String, Artist> artists;

    public Artists() {
        artists = new ConcurrentHashMap<String, Artist>();
    }

    public void addArtist(Artist artist, String nickname) {
        artist.setNickname(nickname);
        artists.put(nickname,artist);
    }

    public Artist getArtist(String nickname) {
        return artists.get(nickname);

    }

    public Artist removeArtist(String nickname) {
        return artists.remove(nickname);

    }

    public Artist[] getArtists() {
        Artist[] artistList = (Artist[]) artists.values().toArray();
        Arrays.sort(artistList);
        return artistList;
    }


}
