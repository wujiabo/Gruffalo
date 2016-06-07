package com.wujiabo.opensource.provider.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.wujiabo.opensource.entity.TUser;
import com.wujiabo.opensource.model.User;
import com.wujiabo.opensource.provider.RbacProvider;
import com.wujiabo.opensource.service.RbacService;

public class RbacProviderImpl implements RbacProvider {

	@Autowired
	private RbacService rbacService;

	@Override
	public User getUserByLoginName(String loginName) {
		TUser tUser = rbacService.getUserByLoginName(loginName);
		if (tUser == null) {
			return null;
		}
		User user = new User();
		user.setId(tUser.getUserId());
		user.setUserName(tUser.getUserName());
		user.setLoginName(tUser.getLoginName());
		user.setPassword(tUser.getPassword());
		user.setSalt(tUser.getSalt());
		user.setLocked("0".equals(tUser.getLocked()));
		return user;
	}

	@Override
	public Set<String> getRolesByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getPermissionsByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}

}
