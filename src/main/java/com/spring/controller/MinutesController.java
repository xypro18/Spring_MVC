/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.model.Activity;
import com.spring.model.Exercise;
import com.spring.service.ExerciseService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinutesController {
    
    @Autowired
    private ExerciseService exerciseService;
    
    @RequestMapping("/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("exercise activity: " + exercise.getActivity());
//        return "redirect:addMoreMinutes.html";
        return "addMinutes";
    }
    
    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody List<Activity> findAllActivities() {
        return exerciseService.findAllActivities();
    }
    
//    @RequestMapping("/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }
    
}
