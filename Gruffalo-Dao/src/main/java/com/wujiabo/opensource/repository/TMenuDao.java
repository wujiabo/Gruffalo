package com.wujiabo.opensource.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wujiabo.opensource.entity.TMenu;

public interface TMenuDao extends PagingAndSortingRepository<TMenu, Long>, JpaSpecificationExecutor<TMenu> {

}
