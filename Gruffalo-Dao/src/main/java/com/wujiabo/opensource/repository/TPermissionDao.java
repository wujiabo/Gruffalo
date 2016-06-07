package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TPermission;

public interface TPermissionDao extends PagingAndSortingRepository<TPermission, Long>, JpaSpecificationExecutor<TPermission> {

}
