package com.walker.space.controller;

import com.walker.space.domain.User;
import com.walker.space.dto.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wk on 2015/12/3.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Response createUser(@RequestBody User user){

        return null;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Response getUser(@PathVariable int id){

        return null;
    }
}
