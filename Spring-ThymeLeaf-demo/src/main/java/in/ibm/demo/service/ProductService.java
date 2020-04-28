package in.ibm.demo.service;

import in.ibm.demo.model.Product;

public interface ProductService {

	public Iterable<Product> getProducts();
	
	public Product findProductById(int id);
	
	public void create(Product product);
	
	
	public void deleteById(int id);

	
}
