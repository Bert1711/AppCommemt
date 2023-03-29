package ru.zaroyan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zaroyan.ProjectConfiguration;
import ru.zaroyan.model.Comment;
import ru.zaroyan.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment();
        comment.setText("Мне нравится");
        comment.setAuthor("Петя");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}