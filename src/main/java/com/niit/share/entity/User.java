package com.niit.share.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Byte gender;
    private String avatar;
    private String sign;
    private String location;
    private Integer total;
}
