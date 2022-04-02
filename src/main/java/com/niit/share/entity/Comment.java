package com.niit.share.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Comment implements Serializable {
    private static final long serialVersionUID = -5261743405322977974L;
    private Integer id;
    private Integer userId;
    private String userName;
    private String avatar;
    private Integer commentId;
    private String content;
    private Integer likes;
}
