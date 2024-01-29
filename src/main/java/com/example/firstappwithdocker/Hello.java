package com.example.firstappwithdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms")
public class Hello {

    @GetMapping("/test/{msg}")
    public String Msg(@PathVariable String msg){
        return "Le message est: " + msg;
    }
}