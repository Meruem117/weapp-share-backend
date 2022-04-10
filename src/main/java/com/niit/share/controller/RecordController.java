package com.niit.share.controller;

import com.niit.share.base.response.BaseResponse;
import com.niit.share.entity.Record;
import com.niit.share.service.RecordService;
import com.niit.share.utils.ResUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Resource
    private RecordService recordService;

    @GetMapping("/all")
    public BaseResponse<List<Record>> getAll() {
        return ResUtils.success(recordService.getAll());
    }
}
