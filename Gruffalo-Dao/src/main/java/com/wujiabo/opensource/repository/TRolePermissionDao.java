package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TRolePermission;
import com.wujiabo.opensource.entity.TRolePermissionPK;

public interface TRolePermissionDao extends PagingAndSortingRepository<TRolePermission, TRolePermissionPK>, JpaSpecificationExecutor<TRolePermission> {

}
