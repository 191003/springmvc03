package com.zking.service.impl;

import com.zking.mapper.BillMapper;
import com.zking.model.Bill;
import com.zking.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements IBillService {


    @Autowired
    private BillMapper billMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Bill record) {
        return 0;
    }

    @Override
    public int insertSelective(Bill record) {
        return 0;
    }

    @Override
    public Bill selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bill record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bill record) {
        return 0;
    }
}
