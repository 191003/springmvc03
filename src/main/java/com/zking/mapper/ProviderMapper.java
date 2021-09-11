package com.zking.mapper;

import com.zking.model.Provider;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Provider record);

    int insertSelective(Provider record);

    Provider selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
}