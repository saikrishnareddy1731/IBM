package in.ibm.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ibm.demo.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer> {


	
}
