package com.niit.share.service.impl;

import com.niit.share.entity.Record;
import com.niit.share.mapper.RecordMapper;
import com.niit.share.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public List<Record> getAll() {
        return recordMapper.getAll();
    }

    @Override
    public List<Record> getPages(Integer userId, String key) {
        return recordMapper.getPages(userId, key);
    }

    @Override
    public Record getRecordById(Integer id) {
        return recordMapper.getRecordById(id);
    }

    @Override
    public Integer addRecord(Record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = df.format(new Date());
        record.setTime(datetime);
        recordMapper.addRecord(record);
        return record.getId();
    }
}
