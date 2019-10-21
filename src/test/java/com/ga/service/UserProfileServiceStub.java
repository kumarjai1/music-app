package com.ga.service;

import com.ga.entity.UserProfile;

public class UserProfileServiceStub implements UserProfileService {

    @Override
    public UserProfile createUserProfile(String username, UserProfile newProfile) {
       UserProfile profile = new UserProfile();
   	   profile.setEmail("batman@superhero.com");
   	   
   	   return profile;
    }
   
    @Override
	public UserProfile getUserProfile(String username) {
		UserProfile userProfile = new UserProfile();

		userProfile.setEmail("batman@superhero.com");

		return userProfile;
	}
    
}