package com.clh.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clh.shardingspheredemo.mapper.MemberInfoMapper;
import com.clh.shardingspheredemo.model.MemberInfo;
import com.clh.shardingspheredemo.service.MemberInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-19
 */
@Service
public class MemberInfoServiceImpl extends ServiceImpl<MemberInfoMapper, MemberInfo> implements MemberInfoService {


    @Override
    public Boolean createMemberInfo(MemberInfo memberInfo) {
        return this.save(memberInfo);
    }
}
