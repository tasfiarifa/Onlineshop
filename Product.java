package OnlineStore;
/**
 * 
 */

import javafx.collections.ObservableArray;

/**
 * @author Busra
 *
 */

public abstract class Product implements Cloneable{
	private String name, id;
	private Category category;
	private int quantity;
	private double price;
	private boolean onSale;
	private int salePercent;
	
	public Product(String name, String id, Category category, int quantity, double price) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void updateQuantity(int quantity) {
		this.quantity += quantity;
	}

	public int getSalePercent() {
		return salePercent;
	}

	public void setSalePercent(int salePercent) {
		this.salePercent = salePercent;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getPrice(){
		return  this.price;
	}
	

	public double totalPrice(int amt) {
		return amt*price;
	}

	public double salePrice(int amt) {
			return amt*price*((100-salePercent)/100.0);
			
		}
	public abstract void putOnSale(Object criterion, int percentage);

	// TO show the summary or customer view
	@Override
	public String toString() {
		if (!onSale)
			return  String.format("%s(%s)-%.1f tk", name,id,price);
		else
			return  String.format("%s(%s)-On Sale-%.1f tk(Original Price:%d)", name,id,price, salePrice(1));
			
	}
	
	// This is for showing the details
	public String details() {
		return "name=" + name + "\tid=" + id + "\tcategory=" + category + "\tquantity=" + quantity + "\tprice="
				+ price + "\tonSale=" + onSale + "\tsalePercent=" + salePercent;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}
	
}

enum Category{
	Food,
	Cloth,
	Electronics
}