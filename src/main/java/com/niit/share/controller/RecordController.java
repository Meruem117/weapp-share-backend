package com.niit.share.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.niit.share.base.request.PageRequest;
import com.niit.share.base.response.BaseResponse;
import com.niit.share.base.response.PageResponse;
import com.niit.share.entity.Record;
import com.niit.share.service.RecordService;
import com.niit.share.utils.ResUtils;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list")
    public BaseResponse<PageResponse<Record>> getPages(Integer userId, String key, PageRequest pageRequest) {
        PageHelper.startPage(pageRequest.getPage(), pageRequest.getSize());
        List<Record> list = recordService.getPages(userId, key);
        Long total = ((Page) list).getTotal();
        return ResUtils.success(new PageResponse<>(list, total));
    }

    @PostMapping("/add")
    public BaseResponse<Integer> addRecord(@RequestBody Record record) {
        return ResUtils.success(recordService.addRecord(record));
    }
}
