package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Image;

@Service
public class ImageServiceImpl implements ImageService{

	private ImageDao dao;
	@Autowired
	public ImageServiceImpl(ImageDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Image getImage(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Image> getAllImage() {
		// TODO Auto-generated method stub
		return (List<Image>) dao.findAll();
	}

}
