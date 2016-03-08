package com.example.j2eeapp.services;

import com.example.j2eeapp.domain.UserEntity;

/*
 * service to authenticate user I think
 */

public interface UserAuthenticationProviderService {
	
	boolean processUserAuthentication(UserEntity user);

}
