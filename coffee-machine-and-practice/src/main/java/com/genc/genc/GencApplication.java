package com.genc.genc;

import com.genc.genc.service.BookService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GencApplication {

    @Autowired
    BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(GencApplication.class, args);

    }

}
