package com.example.product_service.dto;

public class Price {

	private long priceId;
	private long productId;
	private int originalPrice;
	private int discountedPrice;

	public long getPriceId() {
		return priceId;
	}

	public void setPriceId(long priceId) {
		this.priceId = priceId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public Price(long priceId, long productId, int originalPrice, int discountedPrice) {
		super();
		this.priceId = priceId;
		this.productId = productId;
		this.originalPrice = originalPrice;
		this.discountedPrice = discountedPrice;
	}

	public Price() {
		super();

	}

}
