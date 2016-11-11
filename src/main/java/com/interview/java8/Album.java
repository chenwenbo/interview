package com.interview.java8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 专辑
 * chen wenbo
 * Created by apple on 2016/11/11 17:30.
 */
public class Album {

    /**
     * name of album
     */
    private String name;

    /**
     * tracks of album
     */
    private List<Track> tracks;

    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        albums.forEach(album -> {
            album.getTracks().forEach(track -> {
                if (track.getLength() > 60) {
                    trackNames.add(track.getName());
                }
            });
        });
        return trackNames;
    }

    public Album() {
    }

    public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
