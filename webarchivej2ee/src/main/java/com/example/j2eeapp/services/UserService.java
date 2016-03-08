package com.example.j2eeapp.services;

import javax.faces.event.AjaxBehaviorEvent;

import com.example.j2eeapp.domain.UserEntity;

/*
 * Service providing methods to get user data
 * 
 */

public interface UserService {
/*
 * 
 * create user-persist to database
 * 
 * 
 */
	
	boolean createUser(UserEntity userEntity);
	
	
	boolean checkAvailable(AjaxBehaviorEvent event);
	
	
	
	UserEntity loadUserEntityByUsername(String userName);
}
