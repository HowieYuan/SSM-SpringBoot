package com.swit.controller;

import com.swit.sevice.MyService;
import com.swit.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-12
 * @time 0:48
 */
@RestController
public class MyController {
    private final MyService myService;
    private final MyUtil myUtil;

    @Autowired
    public MyController(MyService myService, MyUtil myUtil) {
        this.myService = myService;
        this.myUtil = myUtil;
    }

    @RequestMapping(value = "/test")
    public String getShufflingImg(){
        myUtil.test();
        return myService.test();
    }
}
