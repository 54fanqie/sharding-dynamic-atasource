package com.fanqie.sd.service.impl;

import com.fanqie.sd.dao.dynamic.PsSealMapper;
import com.fanqie.sd.entity.PsSeal;
import com.fanqie.sd.service.PsSealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fanqie
 * @ClassName PsSealServiceImpl
 * @date 2021/8/18 下午3:10
 **/
@Service
public class PsSealServiceImpl implements PsSealService {

    @Autowired
    private PsSealMapper sealMapper;


    @Override
    public PsSeal getSealWithValidDept(Long sealId) {
        return sealMapper.getSealWithValidDept(sealId);
    }
}
