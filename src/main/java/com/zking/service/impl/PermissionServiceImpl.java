package com.zking.service.impl;

import com.zking.model.Permission;
import com.zking.service.IPermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements IPermissionService {
    @Override
    public int deleteByPrimaryKey(Long permissionId) {
        return 0;
    }

    @Override
    public int insert(Permission record) {
        return 0;
    }

    @Override
    public int insertSelective(Permission record) {
        return 0;
    }

    @Override
    public Permission selectByPrimaryKey(Long permissionId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return 0;
    }
}
