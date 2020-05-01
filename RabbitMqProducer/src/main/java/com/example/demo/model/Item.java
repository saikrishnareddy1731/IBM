package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "id",scope = Item.class)
public class Item {
	/* private int id; */
	 private String itemName;
	    private String category;
	    private String description;
		public Item(String itemName, String category, String description) {
			super();
			this.itemName = itemName;
			this.category = category;
			this.description = description;
		}
		public Item() {
			super();
		}

		/*
		 * public int getId() { return id; } public void setId(int id) { this.id = id; }
		 */	public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	    
}
