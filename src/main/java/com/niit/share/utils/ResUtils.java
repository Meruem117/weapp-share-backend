package com.niit.share.utils;

import com.niit.share.base.response.BaseResponse;

public class ResUtils {
    /**
     * success
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(200, data, "success");
    }

    /**
     * error
     */
    public static <T> BaseResponse<T> error(Integer code, String errorMessage) {
        return new BaseResponse<>(code, null, errorMessage);
    }
}
