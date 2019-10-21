package com.ga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.dao.SongDao;
import com.ga.entity.Song;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	SongDao songDao;

	@Override
	public Song createSong(Song song) {
		return songDao.createSong(song);
	}

	@Override
	public List<Song> listSongs() {
		return songDao.listSongs();
	}
	
}
