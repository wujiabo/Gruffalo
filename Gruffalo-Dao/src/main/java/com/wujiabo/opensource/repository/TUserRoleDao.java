package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TUserRole;
import com.wujiabo.opensource.entity.TUserRolePK;

public interface TUserRoleDao extends PagingAndSortingRepository<TUserRole, TUserRolePK>, JpaSpecificationExecutor<TUserRole> {

}
