package com.carwow.service;

import com.carwow.dto.LoginDto;
import com.carwow.mapper.LoginMapper;

import lombok.Setter;

public class LoginServiceImpl implements LoginService{

	@Setter
	private LoginMapper loginMapper;
	
	
	@Override
	public void registerUser(LoginDto user) {
		loginMapper.registerUser(user);
	}

	@Override
	public LoginDto findLoginByIdAndPasswd(String userId, String passwd) {
		
		LoginDto loginDto = loginMapper.selectLoginByIdAndPasswd(userId, passwd);
		return loginDto;
	}

}
