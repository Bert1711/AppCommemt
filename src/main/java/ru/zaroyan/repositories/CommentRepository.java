package ru.zaroyan.repositories;


import ru.zaroyan.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
