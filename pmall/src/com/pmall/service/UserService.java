package com.pmall.service;

import com.pmall.pojo.User;

public interface UserService extends BaseService{

	boolean isExist(String name);
	
	User get(String name, String password);

}
