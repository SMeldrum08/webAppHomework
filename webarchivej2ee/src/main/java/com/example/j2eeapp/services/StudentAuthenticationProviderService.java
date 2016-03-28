package com.example.j2eeapp.services;

import com.example.j2eeapp.domain.StudentEntity;

/*
 * service to authenticate user I think
 */

public interface StudentAuthenticationProviderService {
	
	boolean processStudentAuthentication(StudentEntity student);

}
