package com_day4_q4;
import java.util.*;

public class priorityqueue {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		PriorityQueue<Product> pq1 = new
			PriorityQueue<Product>(5, new ProductComparator());
				
								Product product_1 = new Product(1,"Frooti", 20.0);
				
				
		
				pq1.add(product_1);
				Product product_2 = new Product(2,"Pepsi", 18.6);
						pq1.add(product_2);		
				Product product3 = new Product(3,"Pastry", 60.0);
						pq1.add(product3);
				
				
				
				System.out.println("Students served food as per their priority");
				
				while (!pq1.isEmpty()) {
				System.out.println(pq1.poll().getproductPrice());
		}
	}
}

class ProductComparator implements Comparator<Product>{
					
			public int compare(Product p1, Product p2) {
				if (p1.pPrice < p2.pPrice)
					return 1;
				else if (p1.pPrice > p2.pPrice)
					return -1;
								return 0;
				}
		}

class Product {
	public int pId;
	public String pName;
	public double pPrice;
		
	
	public Product(int pId,String pName, double pPrice) {
	    this.pId=pId;
		this.pName = pName;
		this.pPrice = pPrice;
		
	}
	
	public double getproductPrice() {
		return  pPrice;
	}
}
