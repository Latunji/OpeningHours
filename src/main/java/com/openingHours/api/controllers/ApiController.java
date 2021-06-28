package com.openingHours.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openingHours.api.models.Response;
import com.openingHours.api.models.Restaurant;
import com.openingHours.api.services.RestaurantServiceImpl;

@RestController
public class ApiController {
	
	@Autowired
	RestaurantServiceImpl restaurantService;
	
	@RequestMapping(value = "/getOpeningHours", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<Response> getOpeningHours(
            @RequestBody Restaurant restaurant) {
        return new ResponseEntity<Response>(restaurantService.openingHours(restaurant.getMonday(), restaurant.getTuesday(), restaurant.getWednesday(), restaurant.getThursday(), 
        		 restaurant.getFriday(), restaurant.getSaturday(), restaurant.getSunday()), HttpStatus.OK);
    }

}
