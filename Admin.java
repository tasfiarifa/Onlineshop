package OnlineStore;
/**
 * 
 */

/**
 * @author Busra
 *
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Admin extends User{

		public Admin(Stores stores) {
			super(stores);
		}
		public  void add_clothes() {
			Scanner Scan=new Scanner(System.in);
			String name;
			String id;
			String brand;
			int quantity;
			double price;
			System.out.println("Name, "+""+ "ID,"+"Qunatity, "+"Brand, "+" "+" Price");
			name=Scan.next();
			id=Scan.next();
			quantity=Scan.nextInt();
			brand=Scan.next();
			price=Scan.nextDouble();
			System.out.println("1  MEN"+""+ "2 WOMEN"+"3  KIDS"+"4  GIRLS");
			int oop=Scan.nextInt();
			System.out.println("Press 1 SMALL"+"2 MEDIUM"+ "3 LARGE"+ "4 XL"+ "5 XXL");
			int opP=Scan.nextInt();
			SubCategory category=SubCategory.values()[oop-1];
			Size size=Size.values()[opP-1];
			System.out.println("Selected "+category+" "+" "+size);
			super.stores.addProduct(name, id, quantity, brand, category, size, price);
			Scan.close();
		}
		public  void add_electronics() {
			Scanner Scan=new Scanner(System.in);
			String name;
			String id;
			String manufacturer;
			int quantity;
			double price;
			System.out.println("Name, "+""+ "ID,"+"Qunatity, "+"Manufacturer, "+"  "+" Price");
			name=Scan.next();
			id=Scan.next();
			quantity=Scan.nextInt();
			manufacturer=Scan.next();
			price=Scan.nextDouble();
			System.out.print("1 HOME_APPLIANCE"+ "2 KITCHEN_APPLIANCE"+ "3  ELECTRONIC_DEVICE"+"4 ELECTRONIC_ACCESSORY");
			int s=Scan.nextInt();
			ElectCategory elec=ElectCategory.values()[s-1];
			super.stores.addProduct(name, id, quantity, manufacturer, elec, price);
			Scan.close();
		}
		public  void add_fooditems() {
			Scanner Scan=new Scanner(System.in);
			String name=null;
			String id=null;
			String brand=null;
			int quantity=0;
			double price=0.0;
			System.out.println("Name, "+""+ "ID,"+"Qunatity, "+" "+" "+" prize");
			name=Scan.next();
			id=Scan.next();
			quantity=Scan.nextInt();
			price=Scan.nextDouble();
			LocalDate current_Date=LocalDate.now();
			System.out.println("Add expiry days: ");
			int days=Scan.nextInt();
			LocalDate expiryDate=current_Date.plusDays(days);
			
			super.stores.addProduct(name, id, quantity, current_Date, expiryDate, price);
			Scan.close();
		}
		@Override
		public void display() {
			System.out.printf(" 1 Items,2 Items in catgeories,3 add Item to the store,4 give sale, 5 return to previous menu");
		}
		@Override
		public void console() {
			Scanner Scan=new Scanner(System.in);
		
			while(true) {
				this.display();
				int option=Scan.nextInt();
				boolean exit_flag=false;
			switch(option) {
				case 1:
					super.stores.viewProducts(true);
					break;
				case 2:
					System.out.println("1 Food"+ "2 Cloth"+" 3 for Electronics");
					int select=Scan.nextInt();
					if(select==1) {
						super.stores.viewProductsAsAdmin(Category.Food);
						
					}
					else if(select==2) {
						super.stores.viewProductsAsAdmin(Category.Cloth);
						
					}
					else if(select==3) {
						super.stores.viewProductsAsAdmin(Category.Electronics);
						
					}
					break;
				case 3:
					System.out.println("Input 1 to add Food");
					System.out.println("Input 2 to add Cloth");
					System.out.println("Input 3 to add Electronics");
					int s=Scan.nextInt();
					if(s==1) {
						add_fooditems();
					}
					else if(s==2) {
						add_clothes();
					}
					else if(s==3) {
						add_electronics();
					}
					break;
				case 4:
					int Percentage;
					String id;
					int expireWithin;
					System.out.println("Percentage, "+""+ "ID,"+" expirewithin");
					Percentage=Scan.nextInt();
					id=Scan.next();
					expireWithin=Scan.nextInt();
					System.out.println("Input 1 onsale Food");
					System.out.println("Input 2 onsale Cloths");
					System.out.println("Input 3 onsale Electronics");
					int opp=Scan.nextInt();
					Category cat=Category.values()[opp-1];
					
					if(cat.equals(Category.Food)) {
						super.stores.putOnSaleFood(expireWithin, Percentage);
					}
					else if(cat.equals(Category.Cloth)) {
						super.stores.putOnSaleCloth(id, Percentage);
					}
					else {
						super.stores.putOnSaleElectronic(id, Percentage);
					}
					break;
				case 6:
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
