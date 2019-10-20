package com.ga.dao;

import com.ga.entity.UserProfile;


public class UserProfileDaoStub implements UserProfileDao {

	@Override
    public UserProfile createUserProfile(String username, UserProfile newProfile) {        
        UserProfile userProfile = new UserProfile();
        
        userProfile.setEmail("batman@superhero.com");

        return userProfile;
        
	}

    @Override
    public UserProfile getUserProfile(String username) {
    	UserProfile userProfile = new UserProfile();

		userProfile.setEmail("batman@superhero.com");

		return userProfile;
    }
    
    

}