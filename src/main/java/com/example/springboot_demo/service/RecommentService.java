package com.example.springboot_demo.service;

import com.example.springboot_demo.domain.Book;

import java.util.List;
import java.util.Map;

public interface RecommentService {

    List<Book> findBook(Map<String,Object> param);
}
