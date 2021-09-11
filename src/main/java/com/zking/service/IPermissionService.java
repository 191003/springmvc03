package com.zking.service;

import com.zking.model.Permission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IPermissionService {
    int deleteByPrimaryKey(Long permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}