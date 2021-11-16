package com.example.demo.models;

public class Movie {
	private String movieId;
	private String name;
	
	public Movie(String name, String desc) {
		this.movieId = name;
		this.name = desc;
	}
	
	public String getName() {
		return movieId;
	}
	public void setName(String name) {
		this.movieId = name;
	}
	public String getDesc() {
		return name;
	}
	public void setDesc(String desc) {
		this.name = desc;
	}
}
