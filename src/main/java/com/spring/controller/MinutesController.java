/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
    
    @RequestMapping("/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
//        return "redirect:addMoreMinutes.html";
        return "addMinutes.html";
    }
    
    @RequestMapping("/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
        System.out.println("exercising: " + exercise.getMinutes());
        return "addMinutes";
    }
    
}
