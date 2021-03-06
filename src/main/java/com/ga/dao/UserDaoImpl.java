package com.ga.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ga.entity.Song;
import com.ga.entity.User;
import com.ga.entity.UserRole;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	UserRoleDao userRoleDao;
	
	
	@Override
	public List<User> listUsers() {
		List<User> allUsers = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();		
			allUsers = session.createQuery("FROM User").getResultList();
		} finally {
			session.close();
		}
		
		return allUsers;
		
	}
	

	@Override
	public User signup(User user) {
		String roleName = user.getUserRole().getName();
		
		UserRole userRole = userRoleDao.getRole(roleName);
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			user.setUserRole(userRole);
			session.save(user);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		return user;
	}

	@Override
	public User login(User user) {
		User savedUser = null;
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			savedUser = (User)session.createQuery("FROM User u WHERE u.username = '" + 
					user.getUsername() + "'").getSingleResult();
		} finally {
			session.close();
		}
		
		return savedUser;
	}
	
	@Override
	public User updateUser(User user, Long userId) {
		User savedUser = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			savedUser = session.get(User.class, userId);
			savedUser.setPassword(user.getPassword());
			
			session.update(savedUser);
			
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		
		return savedUser;
	}
	
	@Override
	public User getUserByUsername(String username) {
		User user = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			user = (User)session.createQuery("FROM User u WHERE u.username = '" + 
				username + "'").uniqueResult();
		} finally {
			session.close();
		}
		
		return user;
	}	
	
	@Override
    public User addSong(String username, Long songId) {
    		Song song = null;
        	User user = null;

		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			user = (User)session.createQuery("FROM User u WHERE u.username = '" + 
				username + "'").uniqueResult();
			song = session.get(Song.class, songId);
			user.addSong(song);
			
			session.update(user);
			
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		
		return user;
    }

	@Override
	public List<Song> listUserSongs(String username) {
		List<Song> userSongs = null;
		User user = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();	
			
			
			user = (User)session.createQuery("FROM User u WHERE u.username = '" +
                    username + "'").uniqueResult();
			userSongs = user.getSongs();
		} finally {
			session.close();
		}
		
		return userSongs;
		
		
	}

	@Override
	public Long deleteSong(String username, Long songId) {
		User user = null;
		Song song = null;
		
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			user = (User)session.createQuery("From User u where u.username = '" + username + "'").uniqueResult();
			song = session.get(Song.class, songId);
			user.deleteSong(song);
			session.update(user);
			session.getTransaction().commit();
		} finally {
			session.close();
		}
		return null;
	}

}