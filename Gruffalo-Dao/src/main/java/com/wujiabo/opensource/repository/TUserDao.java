package com.wujiabo.opensource.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.wujiabo.opensource.entity.TPermission;
import com.wujiabo.opensource.entity.TRole;
import com.wujiabo.opensource.entity.TUser;

public interface TUserDao extends PagingAndSortingRepository<TUser, Long>, JpaSpecificationExecutor<TUser> {

	TUser findByLoginName(String loginName);

	@Query("select distinct d from TRole a ,TUserRole b,TRolePermission c,TPermission d where a.roleId=b.id.roleId and b.id.roleId=c.id.roleId and c.id.permissionId=d.permissionId and b.id.userId=:userId") 
	List<TPermission> findPermissionsByUserId(@Param("userId") Long userId);

	@Query("select distinct a from TRole a ,TUserRole b where a.roleId=b.id.roleId and b.id.userId=:userId") 
	List<TRole> findRolesByUserId(@Param("userId") Long userId);
}
