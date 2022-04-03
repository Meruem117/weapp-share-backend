package com.niit.share.base.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommentPageRequest extends PageRequest {
    private Integer userId;
    private String key;
}
