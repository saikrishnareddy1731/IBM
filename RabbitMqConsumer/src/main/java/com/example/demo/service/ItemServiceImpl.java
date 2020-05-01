package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemDao;
import com.example.demo.model.Item;

@Service
public class ItemServiceImpl {

	private static final String QUEUE= "items-queue";
	private ItemDao dao;
	@Autowired
	public ItemServiceImpl(ItemDao dao) {
		super();
		this.dao = dao;
	}

	@RabbitListener(queues = QUEUE)
	public void recieveMessage(Item item)
	{
		System.out.println("Items Recieved: "+item);
		dao.save(item);
	}
}
