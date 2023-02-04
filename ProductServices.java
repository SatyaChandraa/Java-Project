package products;

public class ProductServices {

	private int id;
	private String name;
	private double price;
	
	public void setDetails (int id,String name,double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		
		
	}
	public   void displayDetails() {
		
		System.out.println("Product ID" + id);
		System.out.println("Product name" + name);
		System.out.println("Product price" + price);
	}
	
}
