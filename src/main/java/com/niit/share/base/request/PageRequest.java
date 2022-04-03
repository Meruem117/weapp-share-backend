package com.niit.share.base.request;

import lombok.Data;

@Data
public class PageRequest {
    private Integer page;
    private Integer size;
}
