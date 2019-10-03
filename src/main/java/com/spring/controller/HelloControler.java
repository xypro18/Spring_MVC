/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControler {
    
    @RequestMapping("/greeting")
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello World");
        return "hello";        
    }
    
}
