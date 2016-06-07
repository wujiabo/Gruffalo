package com.wujiabo.opensource.service;

import com.wujiabo.opensource.entity.TUser;

public interface RbacService {

	TUser getUserByLoginName(String loginName);

}
