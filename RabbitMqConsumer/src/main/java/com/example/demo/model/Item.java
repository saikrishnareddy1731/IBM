package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "id",scope = Item.class)
@Entity
public class Item {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
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
		public String getItemName() {
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
		@Override
		public String toString() {
			return "Item [id=" + id + ", itemName=" + itemName + ", category=" + category + ", description="
					+ description + "]";
		}
		
		
	    
}
