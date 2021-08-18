package com.fanqie.sd.service;

import com.fanqie.sd.entity.SealLog;

/**
 * @author fanqie
 * @ClassName SealLogService
 * @date 2021/8/18 下午3:09
 **/
public interface SealLogService {
    int insert(SealLog record);

    SealLog selectByPrimaryKey(long  id);
}
