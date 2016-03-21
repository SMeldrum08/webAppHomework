package com.example.j2eeapp.services;

import javax.faces.event.AjaxBehaviorEvent;

import com.example.j2eeapp.domain.StudentEntity;

/*
 * Service providing methods to save and use user data
 * 
 */

public interface StudentService {
/*
 * 
 * create a student and have it persist to database
 * 
 * 
 */
	
	boolean createStudent(StudentEntity studentEntity, String teacherName);
	
	
	//boolean checkAvailable(AjaxBehaviorEvent event);
	
	
	
	StudentEntity loadUserEntityByUsername(String userName);
}

