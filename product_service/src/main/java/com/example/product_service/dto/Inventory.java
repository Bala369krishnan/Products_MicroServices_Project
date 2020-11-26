package com.example.product_service.dto;

public class Inventory {

	private long inventoryId;
	private long productId;
	private boolean inStock;

	public long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public Inventory(long inventoryId, long productId, boolean inStock) {
		super();
		this.inventoryId = inventoryId;
		this.productId = productId;
		this.inStock = inStock;
	}

	public Inventory() {
		super();
	}

}
