package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Image;

public interface ImageService {

	public Image getImage(int id);
	public List<Image> getAllImage();
}
