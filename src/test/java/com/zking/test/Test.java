package com.zking.test;

import com.github.pagehelper.PageHelper;
import com.zking.mapper.BookMapper;
import com.zking.model.Book;
import com.zking.service.IBookService;
import com.zking.util.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class Test {

    @Autowired
    private IBookService bookService;
    private Book book=null;


    @Before
    public void before(){
        book=new Book();


    }

    @org.junit.Test
    public void Add(){
        book.setBookId(28);
        book.setBookName("空i的撒旦");
        book.setPrice(92f);
        bookService.insert(book);
    }

    @org.junit.Test
    public void list(){
        PageBean pageBean=new PageBean();
        pageBean.setPage(2);
        List<Book> books = bookService.getAll(null,pageBean);
        for (Book book1 : books) {
            System.out.println(book1);
        }
        System.out.println("fhj"+pageBean.getTotal());
    }

}
