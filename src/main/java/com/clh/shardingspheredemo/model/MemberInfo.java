package com.clh.shardingspheredemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author: LongHua
 * @date: 2022/1/19
 */
@Data
@TableName("member_info")
public class MemberInfo {

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 商户号
     */
    private String merCode;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     *  修改时间
     */
    private Date modifyTime;

}
