package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

	private ProductRepository productRepository;

	public String getProducts() {
		Product product = new Product();
		product.setId(1);
		Image image = new Image();
		image.setName("name");
		image.setId(1);
		product.setImages(List.of(image));
		productRepository.save(product);
		return productRepository.findAll().iterator().next().getImages().iterator().next().getName();
	}
}
