package com.niit.share.mapper;

import com.niit.share.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> getAll();

    List<Comment> getPages(Integer userId, String key);

    Comment getCommentById(Integer id);

    List<Comment> getCommentListById(Integer id);
}
