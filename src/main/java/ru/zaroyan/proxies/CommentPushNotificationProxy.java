package ru.zaroyan.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.zaroyan.model.Comment;
@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправка push-уведомления о комментарии: " + comment.getText());
    }
}
