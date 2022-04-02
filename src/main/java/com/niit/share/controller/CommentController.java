package com.niit.share.controller;

import com.niit.share.base.BaseResponse;
import com.niit.share.entity.Comment;
import com.niit.share.service.CommentService;
import com.niit.share.utils.ResUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @GetMapping("/all")
    public BaseResponse<List<Comment>> getAll() {
        return ResUtils.success(commentService.getAll());
    }
}
