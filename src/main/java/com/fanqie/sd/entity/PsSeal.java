package com.fanqie.sd.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author liangpeng
 * @version 1.0
 * @date 2021/8/13 11:16
 */
@Data
@ToString
public class PsSeal {

    private Long id;
    private String esId;
    private String name;
    private String ownerName;
    private String applyChannel;
    private Integer type;
    private Long deptId;
    private String deptName;

}
