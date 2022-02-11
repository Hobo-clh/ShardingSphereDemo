package com.clh.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clh.shardingspheredemo.model.Merchant;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-20
 */
public interface MerchantService extends IService<Merchant> {


    Merchant getByMemberInfoId(Long id);
}
