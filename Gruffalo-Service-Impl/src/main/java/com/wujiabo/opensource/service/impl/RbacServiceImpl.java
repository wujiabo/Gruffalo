package com.wujiabo.opensource.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wujiabo.opensource.entity.TUser;
import com.wujiabo.opensource.repository.TUserDao;
import com.wujiabo.opensource.service.RbacService;

@Component
@Transactional
public class RbacServiceImpl implements RbacService {
	
	@Autowired
	private TUserDao tUserDao;
	
	@Override
	public TUser getUserByLoginName(String loginName) {
		return tUserDao.findByLoginName(loginName);
	}

}
