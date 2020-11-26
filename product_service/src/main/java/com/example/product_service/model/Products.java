package com.example.product_service.model;

public class Products {

	private long productId;
	private String productName;
	private String productDescription;
	private int productPrice;
	private boolean productStock;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductStock() {
		return productStock;
	}

	public void setProductStock(boolean productStock) {
		this.productStock = productStock;
	}

	public Products(long productId, String productName, String productDescription, int productPrice,
			boolean productStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	public Products() {
		super();
	}

}
