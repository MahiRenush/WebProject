package com.Mahi;

import java.util.*;

public class Assignment1 {
	static Product[] pd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String prodID= new String();
		float cost=0;
		int numberOfItems=0, totalProd=0;
		float totcost = 0;
		System.out.println("Specify the total no. of products to be bought altogether");
		totalProd= sc.nextInt();
		for(int i=0;i<6;i++){
			System.out.println("Enter the product ID of the "+i+"th item");
			prodID= sc.next();
			System.out.println("Enter the cost of the "+i+"th item");
			cost= sc.nextFloat();
			System.out.println("Enter the total number of items available for "+i+"th item");
			numberOfItems= sc.nextInt();
			pd[i]= new Product(prodID, cost, numberOfItems);
			
			totcost= totcost+pd[i].getCost();
			System.out.println();
		}
		sc.close();
	}
}
