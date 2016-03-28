package com.example.j2eeapp.services.impl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.example.j2eeapp.domain.StudentEntity;
import com.example.j2eeapp.services.StudentAuthenticationProviderService;

public class StudentAuthenticationProviderServiceImpl implements StudentAuthenticationProviderService{
	
	private AuthenticationManager authenticationManager2;



	public boolean processStudentAuthentication(StudentEntity student) {
		try{
		Authentication request = new UsernamePasswordAuthenticationToken(student.getUserName(), student.getPassword());
		Authentication result = authenticationManager2.authenticate(request);
		SecurityContextHolder.getContext().setAuthentication(result);
		return true;
		} catch (AuthenticationException e){
			FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "problem with student authentication"));
			return false;
		}
	}
	
	public AuthenticationManager getAuthenticationManager2() {
		return authenticationManager2;
	}

	public void setAuthenticationManager2(AuthenticationManager authenticationManager) {
		this.authenticationManager2 = authenticationManager;
	}

}
