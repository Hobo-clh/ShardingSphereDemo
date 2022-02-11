package com.clh.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clh.shardingspheredemo.model.Merchant;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-20
 */
public interface MerchantMapper extends BaseMapper<Merchant> {

    Merchant getByMemberInfoId(@Param("id") Long id);
}
