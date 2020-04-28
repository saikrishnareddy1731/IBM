package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;
@Controller
public class ProductsController {

	private ProductsService service;
	@Autowired
	public ProductsController(ProductsService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/products")
	public String getAllProducts(Model model)
	{
		model.addAttribute("products", service.getAllProducts());
		return "products";
	}
	
	@RequestMapping("/product/{id}")
	public String getProductById(@PathVariable("id")int id,Model model)
	{
		model.addAttribute("product", service.getproduct(id));
		return "product";
	}
	
	 @RequestMapping("/product/new")
	    public String newProduct(Model model){
	        model.addAttribute("product", new Products());
	        return "productForm";
	    }

	 @RequestMapping("/updateForm/{id}")
	    public String updateProduct(@PathVariable("id")int id,Model model){
	        model.addAttribute("product", service.getproduct(id));
	        return "updateForm";
	    }
	    @RequestMapping(value = "/product", method = RequestMethod.POST)
	    public String save(Products product){
	        service.save(product);
	        return "redirect:/products/";
	    }
		/*
		 * @RequestMapping(value = "/product1", method = RequestMethod.POST) public
		 * String UpdateProduct(Products product){ service.save(product); return
		 * "redirect:/products/"; }
		 */
	    
}
