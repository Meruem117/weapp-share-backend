package com.niit.share.mapper;

import com.niit.share.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordMapper {
    List<Record> getAll();

    Integer addRecord(Record record);
}
