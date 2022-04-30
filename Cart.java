package OnlineStore;
/**
 * 
 */
import java.util.ArrayList;
/**
 * @author Busra
 *
 */
public class Cart {
	
		private ArrayList<Product> items= new ArrayList<>();
		public Cart() {
			this.items=new ArrayList<>();
		}
		public ArrayList<Product> getCart() {
			return this.items;
		}
		
		public void addProduct(Product p) {
			// Add p to products;
			items.add(p);
		}
		
			
		// Search for the item in the items list and remove the item;
		public void removeProduct(String id) {
				for(Product item:items) {
					if(item.getId().equals(id)) {
						items.remove(item);
						break;
					}
				}
				
		}
		
		// Search for the item in the items list and update the quantity of the item;
		public void updateProduct(String id, int count) {
			int item_index=findProduct(id);
			if(item_index>=0) {
				Product item=items.get(item_index);
				item.setQuantity(item.getQuantity()+count);
			}
		
		}
		
		// View the items in the cart and their details which include the name, quantity and price
		// If any item is on sale, the discounted price will be shown
		public void viewCart() {
			for(Product item:items) {
				item.toString();
			}
		}
		
		// clear the items in the cart
		public void clearCart() {		
			items.clear();
		}
		
		// Search for a specific product and return the index in the items arrayList.
		// If the product is not available return -1
		private int findProduct(String id) { 		 
			// search the product in the items list using id. 
			// If the product exists return the product, otherwise return null
			for(int i=0;i<items.size();i++) {
				if(items.get(i).equals(id)) {
					return i;
				}
			}
			return -1;
			

	}
}
