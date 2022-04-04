package com.niit.share.service;

import com.niit.share.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAll();

    List<Comment> getPages(Integer userId, Integer commentId, String key);

    Comment getCommentById(Integer id);

    Integer addComment(Comment comment);
}
