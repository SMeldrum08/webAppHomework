package com.example.j2eeapp.services;

import com.example.j2eeapp.domain.UserEntity;

/*
 * Service that will authenticate the student. Test for now to see how to operate the different role system.
 */

public interface UserAuthenticationProviderService {
	
	boolean processUserAuthentication(UserEntity user);

}
