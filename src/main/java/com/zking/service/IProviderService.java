package com.zking.service;

import com.zking.model.Provider;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IProviderService {
    int deleteByPrimaryKey(Long id);

    int insert(Provider record);

    int insertSelective(Provider record);

    Provider selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
}