package com.zking.service;

import com.zking.model.Address;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IAddressService {
    int deleteByPrimaryKey(Long id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}