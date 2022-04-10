package com.niit.share.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Record implements Serializable {
    private static final long serialVersionUID = -4370643742995115877L;
    private Integer id;
    private Integer userId;
    private String content;
    private String time;
}
