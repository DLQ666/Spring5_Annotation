package com.dlq.controller;

import com.dlq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-23 15:08
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
