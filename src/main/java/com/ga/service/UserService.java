package com.ga.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ga.entity.User;

public interface UserService extends UserDetailsService {

	public List<User> listUsers();
	public String signup(User user);
	public String login(User user);
	public User updateUser(User user, Long userId);
	public User addCourse(String username, int courseId);
		
}