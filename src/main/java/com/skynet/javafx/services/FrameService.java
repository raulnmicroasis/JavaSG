package com.skynet.javafx.services;

import java.util.List;
import com.skynet.javafx.models.SimpleEntity;

public interface FrameService {

	public List<? extends SimpleEntity> getData();
	
	public void delete(Long id);	
	
}
