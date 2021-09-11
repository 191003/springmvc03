package com.zking.service.impl;

import com.zking.mapper.AddressMapper;
import com.zking.model.Address;
import com.zking.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Address record) {
        return 0;
    }

    @Override
    public int insertSelective(Address record) {
        return 0;
    }

    @Override
    public Address selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Address record) {
        return 0;
    }
}
