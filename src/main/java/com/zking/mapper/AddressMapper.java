package com.zking.mapper;

import com.zking.model.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}