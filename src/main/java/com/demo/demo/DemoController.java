package com.demo.demo;

import com.demo.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public @ResponseBody String helloUser(){
        return "Hello User post your name!!";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public @ResponseBody User saveUser(@RequestBody User user){
        return user;
    }

}