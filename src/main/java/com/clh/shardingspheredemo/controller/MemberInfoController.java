package com.clh.shardingspheredemo.controller;


import com.clh.shardingspheredemo.model.MemberInfo;
import com.clh.shardingspheredemo.service.MemberInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CLongHua
 * @since 2022-01-19
 */
@RestController
@RequestMapping("/member-info")
public class MemberInfoController {

    @Autowired
    private MemberInfoService memberInfoService;

    @PostMapping()
    public Boolean create(@RequestBody MemberInfo memberInfo){
        return memberInfoService.createMemberInfo(memberInfo);
    }

    @GetMapping
    public MemberInfo select(@RequestParam Long id) {
        return memberInfoService.getById(id);
    }
    @GetMapping("/count")
    public Long select() {
        return memberInfoService.count();
    }


}
