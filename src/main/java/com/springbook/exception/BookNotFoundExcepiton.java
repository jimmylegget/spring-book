package com.springbook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by qida on 2017/8/23.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundExcepiton extends RuntimeException {

    public BookNotFoundExcepiton() {
    }

    public BookNotFoundExcepiton(String message) {
        super(message);
    }

    public BookNotFoundExcepiton(String message, Throwable cause) {
        super(message, cause);
    }
}
