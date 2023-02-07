package com.carwow.service;

import com.carwow.dto.LoginDto;

public interface LoginService {

	void registerUser(LoginDto user);
	
	LoginDto findLoginByIdAndPasswd(String userId, String passwd);
	
}
