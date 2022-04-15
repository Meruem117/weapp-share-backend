package com.niit.share.service;

import com.niit.share.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getAll();

    List<Record> getPages(Integer userId, String key);

    Record getRecordById(Integer id);

    Integer addRecord(Record record);
}
