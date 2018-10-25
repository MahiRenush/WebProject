package com.Mahi;

import java.io.*;


public class Product implements Serializable {
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
	public int getNumberOfITems(){
		return numberOfItems;
	}
