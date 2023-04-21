package com.icia.ex1.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
   @GetMapping("/")
    public String index() {
       return "index";
   }

   @GetMapping("/hello1")
    public String hello1() {
       return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @GetMapping("/hello-param1")
    public String param1(HttpServletRequest request) {
       String age = request.getParameter("age");
       String name = request.getParameter(("name"));
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        return "index";
    }

//    @GetMapping("/hello-param1")
//    public String helloparam1(HttpServletRequest request,
//                              @RequestParam("name") String name, @RequestParam("age") int age) {
//        System.out.println("name = " + name + ", age = " + age);
//        int age1 = Integer.parseInt(request.getParameter("age"));
//        return "index";

    }


