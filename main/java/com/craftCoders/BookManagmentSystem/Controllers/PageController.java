package com.craftCoders.BookManagmentSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/index")
    public String homepage(){
        return"index";
    }


    @GetMapping("/AdminLogin")
    public String adminLogin(){
        return"AdminLogin";
    }


    @GetMapping("/NotifyMe")
    public String NotifyMe(){
        return"NotifyMe";
    }

    @GetMapping("/shareWhishlist")
    public String shareWhislist(){
        return"shareWhishlist";
    }

    @GetMapping("/virtualGuide")
    public String virtualGuide(){
        return"virtualGuide";
    }

    @GetMapping("/contactUs")
    public String contactUS(){
        return"contactUs";
    }

    @GetMapping("/AdminPage")
    public String adminPage(){
        return"AdminPage";
    }

    @GetMapping("/books")
    public String books(){
        return"books";
    }

    @GetMapping("/events")
    public String events(){
        return"events";
    }

    @GetMapping("/addNewAdmin")
    public String addNewAdmin(){
        return"addNewAdmin";
    }

    @GetMapping("/logout")
    public String logout(){
        return"index";
    }

    @GetMapping("/adminList")
    public String adminList(){
        return"adminList";
    }
}
