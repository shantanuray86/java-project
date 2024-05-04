package com.playerbattingaverage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Player implements Comparable<Player> {

	private String name;
	private double average;
	private String dob;
	
	
	public Player(String name, double average, String dob) {
		super();
		this.name = name;
		this.average = average;
		this.dob = dob;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", average=" + average + ", dob=" + dob + "]";
	}





	@Override
	public int compareTo(Player o) {
		
	if(this.getAverage()>o.getAverage()) {
		return -1;
	}
		
	else if(this.getAverage()==o.getAverage()) {
			String str_this_dob = this.getDob();
			String str_o_dob = o.getDob();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			formatter = formatter.withLocale(Locale.UK);
				LocalDate date_str_this_dob = LocalDate.parse(str_this_dob,formatter);
				LocalDate date_str_o_dob = LocalDate.parse(str_o_dob,formatter);
				int age_this = Period.between(date_str_this_dob,  LocalDate.now()).getYears();
				int age_o = Period.between(date_str_o_dob,  LocalDate.now()).getYears();
				if(age_this>age_o) {
					return -1;
				}else if(age_this==age_o) {
					return o.getName().compareTo(this.getName());
				}
			
		
			
		
		}
		return 1;
	}

}
