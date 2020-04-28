package in.ibm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ibm.demo.dao.ProductDAO;
import in.ibm.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDAO productDao;

	@Autowired
	public ProductServiceImpl(ProductDAO productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public Iterable<Product> getProducts() {

		return productDao.findAll();
	}

	@Override
	public Product findProductById(int id) {

		return productDao.findById(id).get();
	}

	@Override
	public void create(Product product) {
		productDao.save(product);

	}

	@Override
	public void deleteById(int id) {
		productDao.deleteById(id);

	}

	
}
