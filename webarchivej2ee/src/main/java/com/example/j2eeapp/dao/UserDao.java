package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.UserEntity;

/*
 * 
 * 
 */

public interface UserDao extends GenericDao<UserEntity,Long> {
	
	/*
	 * Queries database for username availability
	 */
	boolean checkAvailable(String userName);
	
	/*
	 * Queries database to output user info
	 */
	
	UserEntity loadUserByUsername(String userName);

}
