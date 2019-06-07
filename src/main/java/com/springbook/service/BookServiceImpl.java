package com.springbook.service;

import com.springbook.domain.Book;
import com.springbook.domain.BookRepository;
import com.springbook.exception.BookNotFoundExcepiton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
// 获取一个书单信息

@Service
public class BookServiceImpl implements BookService {

    @Resource
    // autowire
    private BookRepository bookRepository;

    /**
     * 
     * @param id
     * @return
     */
    @Override
    public Book getBookById(Long id) {
        Book book;
        book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            throw new BookNotFoundExcepiton("书单信息不存在");
        }
        return book;
    }
}
