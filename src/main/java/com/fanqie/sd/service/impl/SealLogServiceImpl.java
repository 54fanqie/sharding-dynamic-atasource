package com.fanqie.sd.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fanqie.sd.dao.shareding.SealLogMapper;
import com.fanqie.sd.entity.SealLog;
import com.fanqie.sd.service.SealLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fanqie
 * @ClassName SealLogServiceImpl
 * @date 2021/8/18 下午3:11
 **/
@Service
@DS("sharding")
public class SealLogServiceImpl implements SealLogService {

    @Autowired
    SealLogMapper sealLogMapper;

    @Override
    public int insert(SealLog record) {
        return sealLogMapper.insert(record);
    }

    @Override
    public SealLog selectByPrimaryKey(long id) {
        return sealLogMapper.selectByPrimaryKey(id);
    }


}
