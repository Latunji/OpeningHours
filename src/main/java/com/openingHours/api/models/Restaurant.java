package com.openingHours.api.models;

import java.util.List;

public class Restaurant {
	
	private List<HoursOpened> monday;
	private List<HoursOpened> tuesday;
	private List<HoursOpened> wednesday;
	private List<HoursOpened> thursday;
	private List<HoursOpened> friday;
	private List<HoursOpened> saturday;
	private List<HoursOpened> sunday;
	
	
	public List<HoursOpened> getMonday() {
		return monday;
	}
	public void setMonday(List<HoursOpened> monday) {
		this.monday = monday;
	}
	public List<HoursOpened> getTuesday() {
		return tuesday;
	}
	public void setTuesday(List<HoursOpened> tuesday) {
		this.tuesday = tuesday;
	}
	public List<HoursOpened> getWednesday() {
		return wednesday;
	}
	public void setWednesday(List<HoursOpened> wednesday) {
		this.wednesday = wednesday;
	}
	public List<HoursOpened> getThursday() {
		return thursday;
	}
	public void setThursday(List<HoursOpened> thursday) {
		this.thursday = thursday;
	}
	public List<HoursOpened> getFriday() {
		return friday;
	}
	public void setFriday(List<HoursOpened> friday) {
		this.friday = friday;
	}
	public List<HoursOpened> getSaturday() {
		return saturday;
	}
	public void setSaturday(List<HoursOpened> saturday) {
		this.saturday = saturday;
	}
	public List<HoursOpened> getSunday() {
		return sunday;
	}
	public void setSunday(List<HoursOpened> sunday) {
		this.sunday = sunday;
	}
}
