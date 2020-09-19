package com.lk.sc.controller;

import com.lk.sc.entity.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author likeLove
 * @time 2020-09-17  12:59
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

   static HashMap<String,Object> data= new HashMap<>();

    static {
       data.put("1","这里是1");
       data.put("2","这里是2");
       data.put("3", "这里是3");
    }
    @GetMapping("/{id}")
    public Result getDataById(@PathVariable String id) {
        Object obj = data.get(id);
        return Result.ok().data("obj",obj).message(serverPort);
    }




    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable String id) {
        return "nacos registry,serverPort:"+serverPort+"\t id"+id ;
    }
}
