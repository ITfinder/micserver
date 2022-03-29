package com.ziyi.order_center.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @RequestMapping(value = "/order/getOrder",method = RequestMethod.POST,produces = "application/json;charset=UTF-8" )
    public String getUser(@RequestBody Map<String,Object> param){
        return "order"+param.get("id");
    }

}
