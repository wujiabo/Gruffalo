package com.wujiabo.opensource.provider;

import java.util.Set;

import com.wujiabo.opensource.model.User;

public interface RbacProvider {
	User getUserByLoginName(String loginName);

	Set<String> getRolesByUserId(Long userId);

	Set<String> getPermissionsByUserId(Long userId);
}
