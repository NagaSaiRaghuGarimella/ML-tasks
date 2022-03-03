package com.orders.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class Categories {
	@Id
	@Column(name = "category_id")
	Integer category_id;
	@Column(name = "category_name")
	String category_name;
//	@OneToOne(mappedBy = "Categories")
//	Items items;

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

//	public Items getItems() {
//		return items;
//	}
//
//	public void setItems(Items items) {
//		this.items = items;
//	}

}
