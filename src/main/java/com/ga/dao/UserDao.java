package com.ga.dao;

import java.util.List;

import com.ga.entity.Song;
import com.ga.entity.User;

public interface UserDao {
	
	public List<User> listUsers();
	
	public User signup(User user);
	
	public User login(User user);
	
	public User updateUser(User user, Long userId);
	
	public User getUserByUsername(String username);
	
//	public User addSong(String username, int songId);
	
	public List<Song> listUserSongs(String username);
	
	public User addSong(String username, Long songId);

	public Long deleteSong(String username, Long songId);

}