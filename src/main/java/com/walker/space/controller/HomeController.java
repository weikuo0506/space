package com.walker.space.controller;

import com.walker.space.domain.User;
import com.walker.space.service.BlogService;
import com.walker.space.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wk on 2015/12/3.
 */
@Controller
public class HomeController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private UserService userService;

    @RequestMapping({"/","/home"})
    public String showHomePage(Map<String,Object> model){
        //model.put("blogs",blogService.getRecentBlogs());
        return "home";
    }

    @RequestMapping("/user_create")
    public String createUser(){
        return "user_create";
    }

    @RequestMapping("/user_save")
    public void saveUser(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService.saveUser(user);
        //request.getRequestDispatcher("users_all").forward(request,response);
        response.sendRedirect("users_all");
    }

    @RequestMapping("/users_all")
    public String showUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("users",users);
        return "users_all";
    }

    @RequestMapping(value = "/user_edit/{userId}",method = RequestMethod.GET)
    public String editUser(@PathVariable long userId, Model model){
       User user = userService.getUserById(userId);
       model.addAttribute("user",user);

        return "user_edit";
    }

    @RequestMapping("/user_update/{userId}")
    public void updateUser(@PathVariable long userId, @ModelAttribute User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService.updateUser(user);
        //request.getRequestDispatcher("users_all").forward(request,response);
        response.sendRedirect("/space/users_all");
    }

    @RequestMapping("/user_delete")
    public void deleteUser(@RequestParam long userId,HttpServletResponse response) throws IOException {
        System.out.println(userId);
        userService.deleteUser(userId);
        response.sendRedirect("users_all");
    }

}
