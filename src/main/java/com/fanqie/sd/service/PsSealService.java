package com.fanqie.sd.service;

import com.fanqie.sd.entity.PsSeal;


/**
 * @author fanqie
 * @ClassName PsSealService
 * @date 2021/8/18 下午3:10
 **/

public interface PsSealService {
    PsSeal getSealWithValidDept(Long sealId);
}
