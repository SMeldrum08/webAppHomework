package com.example.j2eeapp.services.impl;


import com.example.j2eeapp.dao.StudentDao;
import com.example.j2eeapp.domain.StudentEntity;
import com.example.j2eeapp.services.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;

	public boolean createStudent(StudentEntity studentEntity) {
//		if(!studentDao.checkAvailable(studentEntity.getUserName())){
//
//			
//			return false;
//		}
//		
		try {
			studentEntity.setUserName();
			studentEntity.setPassword();
			studentEntity.setCreatorName("temp");
			studentDao.save(studentEntity);
			return true;
		} catch(Exception e) {
	
			
			return false;
		}
		
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}


