package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TRole;

public interface TRoleDao extends PagingAndSortingRepository<TRole, Long>, JpaSpecificationExecutor<TRole> {

}
