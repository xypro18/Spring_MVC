/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.model.Activity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
    
    @Override
    public List<Activity> findAllActivities() {
        
        List<Activity> activities = new ArrayList<>();
        
        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);
        
        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);
        
        Activity swim = new Activity();
        swim.setDesc("Swim");
        activities.add(swim);
        
        return activities;
        
    }
    
}
