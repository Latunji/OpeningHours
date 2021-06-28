package com.openingHours.api.services;

import java.util.List;

import com.openingHours.api.models.HoursOpened;
import com.openingHours.api.models.Response;
import com.openingHours.api.models.Restaurant;

public interface RestaurantServiceInterface {
	
	public Response openingHours(List<HoursOpened> monday, List<HoursOpened> tuesday, List<HoursOpened> wednesday,
			List<HoursOpened> thursday, List<HoursOpened> friday, List<HoursOpened> saturday, List<HoursOpened> sunday);

}
