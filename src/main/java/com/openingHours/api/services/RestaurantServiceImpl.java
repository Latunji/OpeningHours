package com.openingHours.api.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.openingHours.api.models.HoursOpened;
import com.openingHours.api.models.Response;
import com.openingHours.api.models.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantServiceInterface {

	@Override
	public Response openingHours(List<HoursOpened> monday, List<HoursOpened> tuesday, List<HoursOpened> wednesday,
			List<HoursOpened> thursday, List<HoursOpened> friday, List<HoursOpened> saturday,
			List<HoursOpened> sunday) {
		// TODO Auto-generated method stub
		System.out.println("got to the controller...........");
		Response resp = new Response();
		StringBuilder mon = new StringBuilder();
		StringBuilder tues = new StringBuilder();
		StringBuilder wed = new StringBuilder();
		StringBuilder thur = new StringBuilder();
		StringBuilder fri = new StringBuilder();
		StringBuilder sat = new StringBuilder();
		StringBuilder sun = new StringBuilder();

		SimpleDateFormat sdf2 = new SimpleDateFormat("hh aa");
		
		getMondayOpeningHours(sun, mon, monday, resp, sdf2);
		
		getTuesdayOpeningHours(mon, tues, tuesday, resp, sdf2);
		
		getWednesdayOpeningHours(tues, wed, wednesday, resp, sdf2);
		
		getThursdayOpeningHours(wed, thur, thursday, resp, sdf2);
		
		getFridayOpeningHours(thur, fri, friday, resp, sdf2);
		
		getSaturdayOpeningHours(fri, sat, saturday, resp, sdf2);
		
		getSundayOpeningHours(sat, sun, sunday, resp, sdf2, monday);
		
		
		
		return resp;
	}


	private void setSundayClosingTime(List<HoursOpened> monday, List<HoursOpened> sunday, Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		Long val = 0L;
		for(int i=0; i<monday.size(); i++) {
			if((i == 0) && (monday.get(i).getType().equals("close"))) {
		val = monday.get(i).getValue();
			}
		}
		Date date = new Date();
		date.setTime((val*1000));
		if(!(resp.getSunday() == null)) {
			String s = resp.getSunday();
			resp.setSunday(s+" - "+sdf2.format(date));
		}
	}


	private void getMondayOpeningHours(StringBuilder sun, StringBuilder mon, List<HoursOpened> monday, Response resp,
			SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(monday.isEmpty()) {
			resp.setMonday("Closed");
		}
		else {
			for(int i=0; i<monday.size(); i++) {
				if((i == 0) && (monday.get(i).getType().equals("close"))) {
				
				}
				
				else {
				Long val = monday.get(i).getValue();
				String type = monday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				mon.append(sdf2.format(date));
				}
				else {
					mon.append(" - "+sdf2.format(date));
					if(i == monday.size()-1) {
						mon.append("");
					}else {
						mon.append(",");
					}
				}
				
				resp.setMonday(mon.toString());
			}
			}
		}
		
	}
	
	
	private void getTuesdayOpeningHours(StringBuilder mon, StringBuilder tues, List<HoursOpened> tuesday,
			Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(tuesday.isEmpty()) {
			resp.setTuesday("Closed");
		}
		else {
			for(int i=0; i<tuesday.size(); i++) {
				if((i == 0) && (tuesday.get(i).getType().equals("close"))) {
					Long val = tuesday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					mon.append(" - "+sdf2.format(date));
					if(!(resp.getMonday() == null)) {
						resp.setMonday(mon.toString());
					}
				}
				else {
				Long val = tuesday.get(i).getValue();
				String type = tuesday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				tues.append(sdf2.format(date));
				}
				else {
					tues.append(" - "+sdf2.format(date));
					if(i == tuesday.size()-1) {
						tues.append("");
					}
					else {
						tues.append(",");
					}
				}
				
				resp.setTuesday(tues.toString());
				}
			}
		}
	}
	
	
	private void getWednesdayOpeningHours(StringBuilder tues, StringBuilder wed, List<HoursOpened> wednesday,
			Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(wednesday.isEmpty()) {
			resp.setWednesday("Closed");
		}
		else {
			for(int i=0; i<wednesday.size(); i++) {
				if((i == 0) && (wednesday.get(i).getType().equals("close"))) {
					Long val = wednesday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					tues.append(" - "+sdf2.format(date));
					if(!(resp.getTuesday() == null)) {
						resp.setSunday(tues.toString());
					}
				}
				
				else {
				Long val = wednesday.get(i).getValue();
				String type = wednesday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				wed.append(sdf2.format(date));
				}
				else {
					wed.append(" - "+sdf2.format(date));
					if(i == wednesday.size()-1) {
						wed.append("");
					}
					else {
						wed.append(",");
					}
				}
				
				resp.setWednesday(wed.toString());
				}
			}
		}
	}
	
	private void getThursdayOpeningHours(StringBuilder wed, StringBuilder thur, List<HoursOpened> thursday,
			Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(thursday.isEmpty()) {
			resp.setThursday("Closed");
		}
		else {
			for(int i=0; i<thursday.size(); i++) {
				if((i == 0) && (thursday.get(i).getType().equals("close"))) {
					Long val = thursday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					wed.append(" - "+sdf2.format(date));
					if(!(resp.getWednesday() == null)) {
						resp.setWednesday(wed.toString());
					}
				}
				
				else {
				Long val = thursday.get(i).getValue();
				String type = thursday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				thur.append(sdf2.format(date));
				}
				else {
					thur.append(" - "+sdf2.format(date));
					if(i == thursday.size()-1) {
						thur.append("");
					}
					else {
						thur.append(",");
					}
				
				}
				resp.setThursday(thur.toString());
			}
			}
		}
	}
	
	private void getFridayOpeningHours(StringBuilder thur, StringBuilder fri, List<HoursOpened> friday,
			Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(friday.isEmpty()) {
			resp.setFriday("Closed");
		}
		else {
			for(int i=0; i<friday.size(); i++) {
				if((i == 0) && (friday.get(i).getType().equals("close"))) {
					Long val = friday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					thur.append(" - "+sdf2.format(date));
					if(!(resp.getThursday() == null)) {
						resp.setThursday(thur.toString());
					}
				}
				else {
				Long val = friday.get(i).getValue();
				String type = friday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				fri.append(sdf2.format(date));
				}
				else {
					fri.append(" - "+sdf2.format(date));
					if(i == friday.size()-1) {
						fri.append("");
					}
					else {
						fri.append(",");
					}
				}
				
				resp.setFriday(fri.toString());
			}
			}
		}
	}
	
	
	private void getSaturdayOpeningHours(StringBuilder fri, StringBuilder sat, List<HoursOpened> saturday,
			Response resp, SimpleDateFormat sdf2) {
		// TODO Auto-generated method stub
		if(saturday.isEmpty()) {
			resp.setSaturday("Closed");
		}
		else {
			for(int i=0; i<saturday.size(); i++) {
				if((i == 0) && (saturday.get(i).getType().equals("close"))) {
					Long val = saturday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					fri.append(" - "+sdf2.format(date));
					if(!(resp.getFriday() == null)) {
						resp.setFriday(fri.toString());
					}
				}
				
				else {
				Long val = saturday.get(i).getValue();
				String type = saturday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				sat.append(sdf2.format(date));
				}
				else {
					sat.append(" - "+sdf2.format(date));
					if(i == saturday.size()-1) {
						sat.append("");
					}
					else {
						sat.append(",");
					}
				}
				resp.setSaturday(sat.toString());
				}
			}
		}
	}
	
	private void getSundayOpeningHours(StringBuilder sat, StringBuilder sun, List<HoursOpened> sunday,
			Response resp, SimpleDateFormat sdf2, List<HoursOpened> monday) {
		// TODO Auto-generated method stub
		if(sunday.isEmpty()) {
			resp.setSunday("Closed");
		}
		else {
			for(int i=0; i<sunday.size(); i++) {
				if((i == 0) && (sunday.get(i).getType().equals("close"))) {
					Long val = sunday.get(i).getValue();
					
					Date date = new Date();
					date.setTime((val*1000));
					
					sat.append(" - "+sdf2.format(date));
					if(!(resp.getSaturday() == null)) {
						resp.setSaturday(sat.toString());
					}
				}
				else{
				Long val = sunday.get(i).getValue();
				String type = sunday.get(i).getType();
				
				Date date = new Date();
				date.setTime((val*1000));
				if(type.equals("open")) {
				sun.append(sdf2.format(date));
				}
				else {
					sun.append(" - "+sdf2.format(date));
					if(i == sunday.size()-1) {
						sun.append("");
					}
					else {
						sun.append(",");
					}
				
				}
				resp.setSunday(sun.toString());
				
				if((i == sunday.size()-1) && (sunday.get(i).getType().equals("open"))) {
					setSundayClosingTime(monday, sunday, resp, sdf2);
				}
			}
			}
		}
	}

}
