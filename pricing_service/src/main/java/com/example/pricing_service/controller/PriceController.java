package com.example.pricing_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pricing_service.model.Price;


@RestController
public class PriceController {

	List<Price> priceList = new ArrayList<Price>();
	
	@GetMapping(path = "/price/{productId}")
	public Price getPriceDetails(@PathVariable("productId") Long productId) {
		//Get name and description from product_service
		Price price = getPriceInfo(productId);
		
		
		return price;
	}
	
	
	private Price getPriceInfo(Long productId) {
		populatePriceList();
		
		for(Price p : priceList) {
			if(productId.equals(p.getProductId())) {
				return p;
			}
		}
		
		return null;
	}


	private void populatePriceList() {
		priceList.add(new Price(1011,101,5999,4999));
		priceList.add(new Price(1012,102,4999,3999));
		priceList.add(new Price(1013,103,1200,900));
		priceList.add(new Price(1014,104,1000,700));
		
	}
}
