package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TUser;

public interface TUserDao extends PagingAndSortingRepository<TUser, Long>, JpaSpecificationExecutor<TUser> {

	TUser findByLoginName(String loginName);
}
