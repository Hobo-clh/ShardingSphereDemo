package com.clh.shardingspheredemo.controller;


import com.clh.shardingspheredemo.model.Merchant;
import com.clh.shardingspheredemo.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-20
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @GetMapping("/all")
    public List<Merchant> get(){
        return merchantService.list();
    }

    @GetMapping("/byMemberId")
    public Merchant get(@RequestParam Long id){
        return merchantService.getByMemberInfoId(id);
    }
}
