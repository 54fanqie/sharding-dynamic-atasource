package com.fanqie.sd.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author fanqie
 * @ClassName PsSealLog
 * @date 2021/7/27 下午2:14
 **/
@Data
@ToString
public class SealLog {
        private Long id;
        private String esId;
        private Long sealId;
        private String sealName;
        private String ownerName;
        private Long userId;
        private String userName;
        private Long sealDeptId;
        private String sealDeptName;
        private Integer businessType;
        private Date actionTime;
        private Long userDeptId;
        private String userDeptName;
        private String applyChannel;
        private Integer sealType;
}
