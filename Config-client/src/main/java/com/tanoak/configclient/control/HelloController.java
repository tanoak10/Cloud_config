package com.tanoak.configclient.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanoak@qq.com
 * @date 2018/10/13 10:02
 * @Desc
 */
@RestController
@RefreshScope
public class HelloController {

    
    @Autowired
    private Environment environment ;
    
    @GetMapping("/from")
    public String from(){
        return  environment.getProperty("label","undefined");
    }


}
