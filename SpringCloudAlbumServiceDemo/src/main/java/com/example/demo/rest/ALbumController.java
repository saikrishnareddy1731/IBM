package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AlbumService;

@RestController
public class ALbumController {

	private AlbumService service;

	@Autowired
	public ALbumController(AlbumService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/getImages")
	public List<?> getImages()
	{
		return service.getAllImages();
	}
	@RequestMapping("/get/{id}")
	public Object getImage(@PathVariable("id") int id)
	{
		return service.getImage(id);
	}
}
