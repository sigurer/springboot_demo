package com.example.springboot_demo.service;

import com.example.springboot_demo.domain.Book;
import com.example.springboot_demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findBook(Map<String, Object> param) {
        return bookMapper.findBook(param);
    }
}
