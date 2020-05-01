package com.example.demo.cofig;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





@Configuration
public class RabbitMqConfig {

	private String QUEUE = "items-queue";
	private String EXCHANGE = "otp-exchange";
	private String ROUTING_QUEUE = "items";
	
	@Bean
	Queue queue()
	{
		return new Queue(QUEUE,true);
	}
	
	@Bean
	DirectExchange exchange()
	{
		return new DirectExchange(EXCHANGE);
	}
	
	@Bean
	Binding binding(Queue queue,DirectExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING_QUEUE);
	}
	
	@Bean
	public MessageConverter jsonMessageConverter()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory)
	{
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jsonMessageConverter());
		return rabbitTemplate;
	}
}

