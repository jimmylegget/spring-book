package com.springbook.service;

import com.springbook.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Component("BookService")
public interface BookService {

    Book getBookById(Long id);
}
