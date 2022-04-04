package com.niit.share.service.impl;

import com.niit.share.entity.Comment;
import com.niit.share.entity.User;
import com.niit.share.mapper.CommentMapper;
import com.niit.share.mapper.UserMapper;
import com.niit.share.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Comment> getAll() {
        return commentMapper.getAll();
    }

    @Override
    public List<Comment> getPages(Integer userId, Integer commentId, String key) {
        return commentMapper.getPages(userId, commentId, key);
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentMapper.getCommentById(id);
    }

    @Override
    public Integer addComment(Comment comment) {
        User user = userMapper.getUserById(comment.getUserId());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = df.format(new Date());
        comment.setUserName(user.getName());
        comment.setAvatar(user.getAvatar());
        comment.setLikes(0);
        comment.setTime(datetime);
        commentMapper.addComment(comment);
        return comment.getId();
    }
}
