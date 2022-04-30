package OnlineStore;
/**
 * 
 */

/**
 * @author Busra
 *
 */
import java.util.Scanner;
public class User {

		public  Stores stores;
		
		public User(Stores stores) {
			this.stores=stores;
			
		}
		public void display() {
			System.out.printf("1 Items,2 Items in Catgeories,3 Add Items cart,4 Remove Items,5 Update Count Items,6 Clear items,7 paybill,8 Return previous menu");
		}
		public void console() throws CloneNotSupportedException {
			Scanner Scan=new Scanner(System.in);
			while(true) {
				this.display();
				int option=Scan.nextInt();
				boolean exit_flag=false;
			switch(option) {
				case 1:
					stores.viewProducts(false);
					break;
				case 2:
					System.out.println("Input 1 Clothes"+ "Input 2 Electronics"+"Input 3 FoodItems");
					int select=Scan.nextInt();
					if(select==1) {
						stores.viewProducts(Category.Cloth);
						
					}
					else if(select==2) {
						stores.viewProducts(Category.Electronics);
						
					}
					if(select==3) {
						stores.viewProducts(Category.Food);
						
					}
					break;
				case 3:
					String id=null;
					int amount=0;
					System.out.print("Pproduct Id: ");
					id=Scan.next();
					System.out.print("Product Amount: ");
					amount=Scan.nextInt();
					stores.addProductToCart(id,amount);
					
					break;
				case 4:
					System.out.print("Product Id: ");
					id=Scan.next();
					
					stores.removeProductFromCart(id);
					break;
				case 5:
					System.out.print("Product Id: ");
					id=Scan.next();
					System.out.print("Product Amount: ");
					amount=Scan.nextInt();
					stores.addProductToCart(id,amount);
					stores.updateProductInCart(id, amount);
					break;
				case 6:
					stores.clearCart();
					break;
				case 7:
					stores.payBill();
					break;
				case 8:
					exit_flag=true;
					break;
				default:
					display();
					Scan.close();
			}
			if(exit_flag) {
				break;
			}
			
		}
		
	}
}
