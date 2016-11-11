package com.interview.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * chen wenbo
 * Created by apple on 2016/11/11 17:40.
 */
public class AlbumTest {

    private Album album = new Album();

    @Test
    public void fing_long_tracks_test() throws Exception {
        List<Album> albums = Arrays.asList(new Album("test", Arrays.asList(new Track("aaa", 1), new Track("bbb", 68))), new Album("test1", Arrays.asList(new Track("ccc", 45), new Track("ddd", 90))));
        Set<String> result = album.findLongTracks(albums);
        assertEquals(2, result.size());
    }
}
