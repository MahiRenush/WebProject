import java.util.Scanner;
import java.io.*;

public class Assignment1{
	
	
	public static void main(String[] args) throws Exception{
		Product[] pd = new Product[6];
		Scanner sc= new Scanner(System.in);
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		float cost=0;
		String prodID= new String();
		int noOfItems=0;
		float totcost=0;
		for(int i=0;i<2;i++){
			System.out.println("Enter the product ID of "+i+"th item");
			prodID= sc.next();

			System.out.println("Enter the cost of "+i+"th item");
			cost= sc.nextFloat();

			System.out.println("Enter the total no. of items available in "+i+"th item");
			noOfItems= sc.nextInt();

			pd[i]= new Product(prodID, cost, noOfItems);
			
			totcost= totcost+ pd[i].getCost()*pd[i].getNoOfItems();	
			oos.writeObject(pd[i]);
			
		}
		Product[] pd1 = new Product[6];
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		for(int j=0;j<2;j++){

			
			totcost= totcost+ pd[j].getCost()*pd[j].getNoOfItems();	
			pd1[j]=(Product)ois.readObject();
			System.out.println(pd1[j]);
			
		}
		System.out.println("The total cost is "+totcost);
		sc.close();
		ois.close();
		oos.close();
	}
}
