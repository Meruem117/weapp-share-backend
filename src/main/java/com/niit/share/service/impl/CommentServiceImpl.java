package com.niit.share.service.impl;

import com.niit.share.entity.Comment;
import com.niit.share.mapper.CommentMapper;
import com.niit.share.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getAll() {
        return commentMapper.getAll();
    }

    @Override
    public List<Comment> getSearchPages(String key) {
        return commentMapper.getSearchPages(key);
    }
}
