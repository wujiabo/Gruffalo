package com.wujiabo.opensource.provider;

import java.util.Set;

import com.wujiabo.opensource.model.User;

public interface RbacProvider {
	User getUserByLoginName(String loginName);

	Set<String> getRolesByLoginName(String loginName);

	Set<String> getPermissionsByLoginName(String loginName);
}
