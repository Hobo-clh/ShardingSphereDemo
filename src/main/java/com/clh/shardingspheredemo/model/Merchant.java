package com.clh.shardingspheredemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("merchant")
@ApiModel(value = "Merchant对象", description = "")
public class Merchant extends Model<Merchant> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户号")
    private String merCode;

    @ApiModelProperty(value = "商户名")
    private String merName;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;
}
