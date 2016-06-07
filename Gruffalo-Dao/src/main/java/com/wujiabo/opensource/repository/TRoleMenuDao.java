package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TRoleMenu;
import com.wujiabo.opensource.entity.TRoleMenuPK;

public interface TRoleMenuDao extends PagingAndSortingRepository<TRoleMenu, TRoleMenuPK>, JpaSpecificationExecutor<TRoleMenu> {

}
