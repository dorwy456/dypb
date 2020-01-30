package com.example.login.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.login.vo.User;

@Mapper
public interface LoginMapper {

	public List<User> getLoginInfo() throws Exception;

}
