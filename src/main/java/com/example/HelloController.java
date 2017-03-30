package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by james on 2017/3/30.
 */
@RestController
@RequestMapping
public class HelloController {

    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;


    @Autowired
    private GirlRepository girlRepository;

    @RequestMapping(value={"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }

}
