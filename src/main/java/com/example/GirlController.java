package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by james on 2017/3/30.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @GetMapping("/girls")
    public java.util.List<Girl> girlList(){
        return girlRepository.findAll();
    }



}
