package com.wujiabo.opensource.service;

import java.util.List;

import com.wujiabo.opensource.entity.TPermission;
import com.wujiabo.opensource.entity.TRole;
import com.wujiabo.opensource.entity.TUser;

public interface RbacService {

	TUser getUserByLoginName(String loginName);

	List<TRole> findRolesByUserId(Long userId);

	List<TPermission> findPermissionsByUserId(Long userId);

}
