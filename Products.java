package products;

import java.util.Scanner;

public class Products {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductServices[] products = new ProductServices[10];
		for(int i =1 ; i<=10 ; i++) {
			System.out.println("Enter product " + i + " details here");
			System.out.println("Enter product ID");
			int x = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter product Name");
			String y = sc.nextLine();		
			System.out.println("Enter product price");
			double z = sc.nextDouble();
			
			ProductServices ps = new ProductServices();
			ps.setDetails(x, y, z);
			products[i] = ps;
		}
		for(int i=1 ;i<=10 ;i++) {
			ProductServices p = products[i];
			p.displayDetails();
		}
				
	
	}	
}
