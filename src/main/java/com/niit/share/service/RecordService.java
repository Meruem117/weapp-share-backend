package com.niit.share.service;

import com.niit.share.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getAll();

    Integer addRecord(Record record);
}
