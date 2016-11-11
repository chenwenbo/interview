package com.interview.java8;

/**
 * 曲目
 * chen wenbo
 * Created by apple on 2016/11/11 17:31.
 */
public class Track {

    /**
     * name of track
     */
    private String name;

    /**
     * length of track
     */
    private int length;

    public Track() {
    }

    public Track(String name, int length) {

        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
