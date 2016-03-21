package com.example.j2eeapp.services.impl;


import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.j2eeapp.dao.StudentDao;
import com.example.j2eeapp.domain.StudentEntity;
import com.example.j2eeapp.services.StudentService;

public class StudentServiceImpl implements StudentService, UserDetailsService {
	
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
	
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		StudentEntity student = studentDao.loadUserByUsername(userName);
		
		if (student == null) {
			//throw new UsernameNotFoundException(String.format(String.format(getMessageBundle().getString("badCredentials"), userName)));
		}
		
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		User userDetails = new User(student.getUserName(), student.getPassword(), authorities);
		
		return userDetails;
	}

	public StudentEntity loadUserEntityByUsername(String userName) {
		return studentDao.loadUserByUsername(userName);
	}
	
}


