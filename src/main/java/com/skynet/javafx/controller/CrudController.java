package com.skynet.javafx.controller;

import com.skynet.javafx.models.SimpleEntity;

public interface CrudController {

	public void add();

	public void render(SimpleEntity id);
	
	public void save();
	
}
