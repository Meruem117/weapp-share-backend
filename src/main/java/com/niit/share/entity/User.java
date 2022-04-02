package com.niit.share.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 3842411948192431441L;
    private Integer id;
    private String name;
    private Integer gender;
    private String avatar;
    private String sign;
    private String location;
}
