package ru.zaroyan.proxies;

import org.springframework.stereotype.Component;
import ru.zaroyan.model.Comment;
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправка уведомления о комментарии: " + comment.getText());
    }
}
