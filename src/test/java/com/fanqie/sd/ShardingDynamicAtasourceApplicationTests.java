package com.fanqie.sd;

import com.fanqie.sd.entity.PsSeal;
import com.fanqie.sd.entity.SealLog;
import com.fanqie.sd.service.PsSealService;
import com.fanqie.sd.service.SealLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ShardingDynamicAtasourceApplicationTests {


    /**
     *
     * 从主数据源中读取数据，也就是原项目中的大表
     */
    @Autowired
    PsSealService psSealService;

    @Test
    void selectPsSealByEsId() {
        PsSeal seal= psSealService.getSealWithValidDept(2278L);
        System.out.println(seal.toString());
    }




    /**
     *
     * 从shareding 配置数据源中读写数据，并且shareding做了读写分离 + 分库分表
     */
    @Autowired
    SealLogService sealLogService;

    @Test
    void insert() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2021-08-03 10:59:27";
        Date date = simpleDateFormat.parse(dateStr);


        SealLog psSealLog = new SealLog();
        psSealLog.setActionTime(date);
        psSealLog.setBusinessType(1);
        psSealLog.setSealId(9L);
        psSealLog.setEsId("11010100007955");
        psSealLog.setSealDeptId(2L);
        psSealLog.setSealName("1027测试");
        int flag =  sealLogService.insert(psSealLog);
        System.out.println("flag=" + flag);

        SealLog psSealLog2 = new SealLog();
        psSealLog2.setActionTime(new Date());
        psSealLog2.setBusinessType(3);
        psSealLog2.setSealId(10L);
        psSealLog2.setEsId("44030800000093");
        psSealLog2.setSealDeptId(10L);
        psSealLog2.setSealName("测试");
        int flag2 =  sealLogService.insert(psSealLog2);
        System.out.println("flag2=" + flag2);



        SealLog psSealLog3 = new SealLog();
        psSealLog3.setActionTime(new Date());
        psSealLog3.setBusinessType(2);
        psSealLog3.setSealId(11L);
        psSealLog3.setEsId("13030600000131");
        psSealLog3.setSealDeptId(11L);
        psSealLog3.setSealName("恒大");
        int flag3 =  sealLogService.insert(psSealLog3);
        System.out.println("flag3=" + flag3);


        String dateStr2 = "2021-09-03 10:59:27";
        Date date2 = simpleDateFormat.parse(dateStr2);

        SealLog psSealLog4 = new SealLog();
        psSealLog4.setActionTime(date2);
        psSealLog4.setBusinessType(2);
        psSealLog4.setSealId(12L);
        psSealLog4.setEsId("51030300002297");
        psSealLog4.setSealDeptId(12L);
        psSealLog4.setSealName("深圳");
        int flag4 =  sealLogService.insert(psSealLog4);

        System.out.println("flag4=" + flag4);
    }


    @Test
    void search() throws ParseException {
        SealLog sealLog =  sealLogService.selectByPrimaryKey(10L);
        System.out.println("flag5=" + sealLog);
    }
}
