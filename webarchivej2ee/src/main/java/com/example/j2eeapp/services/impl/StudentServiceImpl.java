package com.example.j2eeapp.services.impl;


import com.example.j2eeapp.dao.StudentDao;
import com.example.j2eeapp.domain.StudentEntity;
import com.example.j2eeapp.services.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	

	public boolean createStudent(StudentEntity studentEntity, String teacherName) {

		int check = 0;
		int n = 1;
		studentEntity.setPassword();
		studentEntity.setCreatorName(teacherName);
	
		while(check != 1){
			studentEntity.setUserName(n);
			if(studentDao.checkAvailable(studentEntity.getUserName())){
				studentDao.save(studentEntity);
				return true;
			}
			else{
				n++;
				if(n > 100){
					return false;
				}
				
			}
		}
		return false;
		

	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}


