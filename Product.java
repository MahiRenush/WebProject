package com.Mahi;

import java.io.File;
import java.io.FileOutputStream;

public class Product {
	String prodID;
	float cost;
	int numberOfItems;
/*	FileOutputStream fos = null;
    File file;
    try{
    	file.createNewFile();
    }
    catch(){
    	
    }*/
	public Product(String prodID, float cost, int numberOfItems) {
		this.prodID = prodID;
		this.cost = cost;
		this.numberOfItems = numberOfItems;
	}
	public float getCost() {
		return cost;
	}
}
