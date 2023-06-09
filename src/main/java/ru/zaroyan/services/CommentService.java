package ru.zaroyan.services;
import org.springframework.stereotype.Component;
import ru.zaroyan.model.Comment;
import ru.zaroyan.proxies.CommentNotificationProxy;
import ru.zaroyan.repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);

    }
}
