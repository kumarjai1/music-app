package com.ga.service;

import java.util.List;

import com.ga.entity.Song;

public interface SongService {

	public Song createSong(Song song);

    	public List<Song> listSongs();
}