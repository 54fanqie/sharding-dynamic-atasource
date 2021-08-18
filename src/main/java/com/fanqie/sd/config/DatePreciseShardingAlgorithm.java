package com.fanqie.sd.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * @author fanqie
 * @ClassName  shaerding  分库分表策略配置：按照年月 如ps_seal_log202108
 * @date 2021/7/28 下午4:40
 **/

public class DatePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Date>  {


    private static final Logger logger = LoggerFactory.getLogger(DatePreciseShardingAlgorithm.class);
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> preciseShardingValue) {
        Date date = preciseShardingValue.getValue();
        logger.info("Sharding input:" + preciseShardingValue.getValue());
        String suffix = getSuffixByYearMonth(date);
        for (String tableName : availableTargetNames) {
            logger.info("suffix:" + suffix + ", 表明:{}" + tableName);
            if (tableName.endsWith(suffix)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException("未找到匹配的数据表");

    }

    private static String getSuffixByYearMonth(Date date) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR)  +"" +  nf.format((calendar.get(Calendar.MONTH) + 1));
    }
}
