package com.springbook.form;


public interface FormConvert<S,T> {
    T convert(S s);
}
