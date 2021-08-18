package com.fanqie.sd.dao.shareding;

import com.fanqie.sd.entity.SealLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SealLogMapper {

    int insert(SealLog record);
    SealLog selectByPrimaryKey(long  id);

}