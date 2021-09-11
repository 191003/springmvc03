package com.zking.service.impl;

import com.zking.mapper.ProviderMapper;
import com.zking.model.Provider;
import com.zking.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    private ProviderMapper providerMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Provider record) {
        return 0;
    }

    @Override
    public int insertSelective(Provider record) {
        return 0;
    }

    @Override
    public Provider selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Provider record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Provider record) {
        return 0;
    }
}
