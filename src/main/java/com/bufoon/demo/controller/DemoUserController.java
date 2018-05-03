package com.bufoon.demo.controller;


import com.bufoon.demo.service.IDemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bufoon
 * @since 2018-04-07
 */
@RestController
@RequestMapping("/demoUser")
public class DemoUserController {

    @Autowired
    private IDemoUserService demoUserService;
    @GetMapping("/test")
    public Object test(){
        return demoUserService.findById(1);
    }


}

