package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ProductService {

	private ProductRepository productRepository;

	// here you need a transaction as this now may happen on a different server
	// and the previous transaction is of-course not available here.
	// This is in fact the EntryPoint of your job transaction. This is where it should be
	// so the EntityManager can load all instances.
	// If you do updates too, remove the readOnly.
	@Transactional(readOnly = true)
	public String getProducts() {
		return productRepository.findAll().iterator().next().getImages().iterator().next().getName();
	}
}
