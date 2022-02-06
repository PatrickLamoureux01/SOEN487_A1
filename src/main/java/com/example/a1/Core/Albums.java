package com.example.a1.Core;
import com.example.a1.Implementation.Album;
import com.example.a1.Implementation.Artist;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Albums {

    private ConcurrentMap<String, Album> albums;

    public Albums() {
        albums = new ConcurrentHashMap<String, Album>();
    }

    public void addAlbum(Album album, String isrc) {
        album.setIsrc(isrc);
        albums.put(isrc,album);
    }

    public Album getAlbum(String isrc) {
        return albums.get(isrc);
    }

    public Album removeAlbum(String isrc) {
        return albums.remove(isrc);
    }

    public Album[] getAlbums() {
        Album[] albumList = (Album[]) albums.values().toArray();
        Arrays.sort(albumList);
        return albumList;

    }
}
