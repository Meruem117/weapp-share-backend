package com.niit.share.service.impl;

import com.niit.share.entity.Record;
import com.niit.share.mapper.RecordMapper;
import com.niit.share.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public List<Record> getAll() {
        return recordMapper.getAll();
    }
}
