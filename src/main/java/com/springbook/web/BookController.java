package com.springbook.web;

import com.springbook.domain.Book;
import com.springbook.exception.BookNotFoundExcepiton;
import com.springbook.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;


@Controller
@RequestMapping("/books")
public class BookController  {

    private final Logger logger = LoggerFactory.getLogger(BookController.class);


    private BookService bookService;

    /**
     * 书单详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getBook(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id);

        model.addAttribute("book", book);
        return "book";
    }


    
}
