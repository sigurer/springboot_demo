package com.example.springboot_demo.controller;


import com.example.springboot_demo.domain.Book;
import com.example.springboot_demo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @GetMapping("getBook")
    public Map<String,Object> getBook(@RequestParam(value = "id")int id){

        Map<String,Object> param = new HashMap();
        param.put("id",id);

        Map<String,Object> result = new HashMap<>();
        try{
            List<Book> bookList= bookService.findBook(param);
            result.put("status",200);
            if (bookList.isEmpty()) {
                result.put("reason","no content");
            } else {
                result.put("reason","success");
            }
        } catch (Exception e){
            result.put("status",500);
            result.put("reason","Server error");
            logger.error(e.getMessage());
        }
        return result;
    }
}
