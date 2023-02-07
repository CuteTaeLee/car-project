package com.carwow.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.carwow.dto.LoginDto;

@Mapper
public interface LoginMapper {

	@Insert ("INSERT INTO user( userId, passwd) " +
				"VALUES (#{ userId }, #{ passwd })")
	void registerUser(LoginDto user);

	@Select ("SELECT userId, passwd " +
				"FROM user" +
				"WHERE userId = #{ userId } AND passwd = #{ passwd } AND deleted = 0 ")
	LoginDto selectLoginByIdAndPasswd(@Param("userId")String userId, @Param("passwd") String passwd);
	
}
