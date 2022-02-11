package com.clh.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clh.shardingspheredemo.mapper.MerchantMapper;
import com.clh.shardingspheredemo.model.Merchant;
import com.clh.shardingspheredemo.service.MerchantService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-20
 */
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant> implements MerchantService {

    @Override
    public Merchant getByMemberInfoId(Long id){
        return this.getBaseMapper().getByMemberInfoId(id);
    }
}
