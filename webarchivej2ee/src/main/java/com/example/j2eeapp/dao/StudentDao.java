package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.StudentEntity;

public interface StudentDao extends GenericDao<StudentEntity,Long> {
	
	/*
	 * Queries database for username availability
	 */
	boolean checkAvailable(String studentName);
	
	/*
	 * Queries database to output user info
	 */
	
	StudentEntity loadUserByUsername(String studentName);

}
