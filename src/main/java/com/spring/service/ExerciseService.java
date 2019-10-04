/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.model.Activity;
import java.util.List;

/**
 *
 * @author User01
 */
public interface ExerciseService {

    List<Activity> findAllActivities();
    
}
