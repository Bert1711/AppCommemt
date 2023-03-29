package ru.zaroyan.proxies;

import ru.zaroyan.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
