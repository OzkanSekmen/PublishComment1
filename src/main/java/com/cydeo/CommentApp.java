package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();                                                           //3b
        comment.setAuthor("Johnson");                                                              //4
        comment.setText("Spring Framework");                                                       //5

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class); // 1
        CommentService commentService = context.getBean(CommentService.class);                      //2
        commentService.publishComment(comment);                                                     //3a



    }
}
