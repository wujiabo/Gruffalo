package com.wujiabo.opensource.provider.impl;

import java.util.Set;

import com.wujiabo.opensource.model.User;
import com.wujiabo.opensource.provider.RbacProvider;

public class RbacProviderImpl implements RbacProvider {

	@Override
	public User getUserByLoginName(String loginName) {
		User user = new User();
		user.setId(1l);
		user.setUserName("admin");
		user.setLoginName("admin");
		user.setPassword("d3c59d25033dbf980d29554025c23a75");
		user.setSalt("8d78869f470951332959580424d4bf4f");
		user.setLocked(Boolean.FALSE);
		if ("admin".equals(loginName)) {
			return user;
		}
		return null;
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
