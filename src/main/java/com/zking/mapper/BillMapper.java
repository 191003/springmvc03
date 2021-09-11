package com.zking.mapper;

import com.zking.model.Bill;
import org.springframework.stereotype.Repository;

@Repository
public interface BillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}