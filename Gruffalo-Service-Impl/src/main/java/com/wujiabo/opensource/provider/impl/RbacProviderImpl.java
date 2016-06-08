package com.wujiabo.opensource.provider.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.wujiabo.opensource.entity.TPermission;
import com.wujiabo.opensource.entity.TRole;
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
	public Set<String> getRolesByUserId(Long userId) {
		Set<String> roleSet = new HashSet<String>();
		List<TRole> roles = rbacService.findRolesByUserId(userId);
		for (TRole role : roles) {
			roleSet.add(role.getRoleKey());
		}
		return roleSet;
	}

	@Override
	public Set<String> getPermissionsByUserId(Long userId) {
		Set<String> permissionSet = new HashSet<String>();
		List<TPermission> permissions = rbacService.findPermissionsByUserId(userId);
		for (TPermission permission : permissions) {
			permissionSet.add(permission.getPermissionKey());
		}
		return permissionSet;
	}

}
