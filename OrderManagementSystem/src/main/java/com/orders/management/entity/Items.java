package com.orders.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Items {


	    @ManyToOne
	    @JoinColumn(name = "category_id")
	    Categories categories;
	    
	    @Id
	    @Column(name = "item_id")
		  Integer item_id;
		  @Column(name = "item_name")
		  String item_name;

	    @Column(name = "item_price")
	    Integer item_price;
	    
		public Categories getCategories() {
			return categories;
		}
		public void setCategories(Categories categories) {
			this.categories = categories;
		}
		public int getItem_id() {
			return item_id;
		}
		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}
		public String getItem_name() {
			return item_name;
		}
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}
		public int getItem_price() {
			return item_price;
		}
		public void setItem_price(int item_price) {
			this.item_price = item_price;
		}
}
