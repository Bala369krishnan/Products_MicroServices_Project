package com.example.product_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.product_service.dto.Inventory;
import com.example.product_service.dto.Price;
import com.example.product_service.model.Products;
import com.example.product_service.model.ProductsInfo;

@RestController
public class ProductsController {

	List<ProductsInfo> productList = new ArrayList<ProductsInfo>();
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path = "/product/details/{productId}")
	public Products getProductDetails(@PathVariable("productId") Long productId) {
		//Get name and description from product_service
		ProductsInfo productsInfo = getProductInfo(productId);
		
		
		//Get price from pricing_service
		Price price = restTemplate.getForObject("http://localhost:8081/price/"+productId, Price.class);
		
		
		//Get stock from inventory_service
		Inventory inventory = restTemplate.getForObject("http://localhost:8082/inventory/"+productId, Inventory.class);

		
		return new Products(productsInfo.getProductId(), productsInfo.getProductName(), productsInfo.getProductDescription(), price.getDiscountedPrice(), inventory.isInStock());
	}
	
	
	private ProductsInfo getProductInfo(Long productId) {
		populateProductList();
		
		for(ProductsInfo p : productList) {
			if(productId.equals(p.getProductId())) {
				return p;
			}
		}
		
		return null;
	}


	private void populateProductList() {
		productList.add(new ProductsInfo(101,"Hard Drive", "500 GB"));
		productList.add(new ProductsInfo(102,"SSD", "512 GB"));
		productList.add(new ProductsInfo(103,"Pen Drive", "64 GB"));
		productList.add(new ProductsInfo(104,"Disk Drive", "Sony"));
		
	}
}
