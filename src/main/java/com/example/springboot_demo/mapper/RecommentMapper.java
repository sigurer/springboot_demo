package com.example.springboot_demo.mapper;

import com.example.springboot_demo.domain.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RecommentMapper {

    List<Book> findRecomment(@Param("param")Map<String,Object> param);
}
