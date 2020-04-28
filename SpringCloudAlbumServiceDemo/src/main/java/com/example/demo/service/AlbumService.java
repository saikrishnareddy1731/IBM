package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AlbumService {

	private RestTemplate restTemplate;

	@Autowired
	public AlbumService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public List<?> getAllImages()
	{
		return restTemplate.getForObject("http://image-service/images", List.class);
	}
	
	public Object getImage(int id)
	{
		return restTemplate.getForObject("http://image-service/getImage/"+id, Object.class);
	}
}
