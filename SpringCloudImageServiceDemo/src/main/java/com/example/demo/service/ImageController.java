package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ImageService;
import com.example.demo.model.Image;

@RestController
public class ImageController {

	private ImageService service;

	@Autowired
	public ImageController(ImageService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/images")
	public List<Image> getImages()
	{
		return service.getAllImage();
	}
	
	@RequestMapping("/getImage/{id}")
	public Image getImage(@PathVariable("id")int id)
	{
		return service.getImage(id);
	}
}
