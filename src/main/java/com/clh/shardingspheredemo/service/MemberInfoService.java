package com.clh.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clh.shardingspheredemo.model.MemberInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-19
 */
public interface MemberInfoService extends IService<MemberInfo> {


    Boolean createMemberInfo(MemberInfo memberInfo);
}
