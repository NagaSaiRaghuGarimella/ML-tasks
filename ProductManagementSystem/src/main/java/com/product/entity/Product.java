package com.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "productId")
	private Integer productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "brandName")
	private String brandName;
	@Column(name = "price")
	private Integer price;
	@Column(name = "discountPercent")
	private Integer discountPercent;
	@Column(name = "expiryDate")
	private Date expiryDate;
	@Column(name = "manufacturedDate")
	private Date manufacturedDate;

	public Product() {
		super();
	}

	public Product(Integer productId, String productName, String brandName, Integer price, Integer discountPercent,
			Date expiryDate, Date manufacturedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brandName = brandName;
		this.price = price;
		this.discountPercent = discountPercent;
		this.expiryDate = expiryDate;
		this.manufacturedDate = manufacturedDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getDiscountPercent() {
		return discountPercent;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

}
