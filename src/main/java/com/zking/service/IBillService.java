package com.zking.service;

import com.zking.model.Bill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IBillService {
    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}