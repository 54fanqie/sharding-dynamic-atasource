package com.fanqie.sd.dao.dynamic;


import com.fanqie.sd.entity.PsSeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface PsSealMapper {


    PsSeal getSealWithValidDept(@Param("sealId") Long sealId);

}
