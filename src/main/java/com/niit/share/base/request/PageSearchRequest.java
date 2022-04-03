package com.niit.share.base.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageSearchRequest extends PageRequest {
    private String key;
}
