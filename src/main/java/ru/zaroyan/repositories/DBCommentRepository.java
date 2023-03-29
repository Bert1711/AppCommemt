package ru.zaroyan.repositories;

import org.springframework.stereotype.Component;
import ru.zaroyan.model.Comment;
@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Сохранение комментария: " + comment.getText());
    }
}
