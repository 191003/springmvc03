package com.zking.mapper;

import com.zking.model.Book;
import com.zking.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> getAll(Book book, PageBean pageBean);
}