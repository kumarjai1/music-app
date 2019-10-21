package com.ga.dao;

import java.util.List;

import com.ga.entity.Song;

public interface SongDao {
	
	public Song createSong(Song song);

    	public List<Song> listSongs();
//    	public Long deleteSong(long songId);

}