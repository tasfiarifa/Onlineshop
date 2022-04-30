package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import OnlineStore.Product;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
public class addProductItemToStoreController<TableVeiw> implements Initializable {
    @FXML
	TextField Fname;
    @FXML
	TableView<Product>foodProductList;
@FXML
 TextField Cname;
	@FXML
	TableView<Product>clothProductList;
	@FXML
	TextField name;
	@FXML
	TableView<Product> electronicProductList;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		TableColumn id = new TableColumn("ID");
		TableColumn name = new TableColumn("NAME");
		TableColumn price = new TableColumn("PRICE");
		TableColumn quantity = new TableColumn("QUANTITY");
		TableColumn cat = new TableColumn("CATEGORY");
		TableColumn sale = new TableColumn("SALE PERCENTAGE");
		TableColumn manufacturer = new TableColumn("MANUFACTURER");


		electronicProductList.getColumns().addAll(cat, id, name, price, quantity, sale);
		final ObservableList<Product> data = Main.getStore().getProducts();




		cat.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
		id.setCellValueFactory(new PropertyValueFactory<Product, String>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
		quantity.setCellValueFactory(new PropertyValueFactory<Product, String>("quantity"));
		sale.setCellValueFactory(new PropertyValueFactory<Product, String>("salePercent"));
		manufacturer.setCellValueFactory(new PropertyValueFactory<Product, String>("manufacturer"));


		electronicProductList.setItems(data);
	}

	public void confirm(){
		System.out.println(name.getText());
	}
	public void addPlane(ActionEvent event)throws IOException{
		//System.out.println("Happy Shopping");
	  //To Hide the current window
	  //Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 // stage.hide();
	 /****** Add electornic fxml functions ******/ 
		
	  
	  Stage primaryStage = new Stage();
	  Parent root  = FXMLLoader.load(getClass().getResource("FoodAddProduct.fxml"));
	   // Parent root = loder.load();
		Scene scene = new Scene(root);
		primaryStage.setTitle("Add Product");
		
	     //TO get new Controller method
		//MenuControler mControler = loder.getController();
		
		primaryStage.setScene(scene);
		primaryStage.show();
  }
	

	public void addcloth(ActionEvent event)throws IOException{
		  Stage primaryStage = new Stage();
		  //Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  //stage.hide();
		  Parent root = FXMLLoader.load(getClass().getResource("ClotheAddProduct.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Add Product");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }

	public void addelectronic(ActionEvent event)throws IOException{
		  Stage stage = (Stage)electronicProductList.getScene().getWindow();
		 

		  Parent root = FXMLLoader.load(getClass().getResource("ElectronicAddProduct.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setTitle("Add Product");
			stage.setScene(scene);
			stage.show();
	  }
	public void addputo(ActionEvent event)throws IOException{
		  Stage primaryStage = new Stage();
		  //Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  //stage.hide();
		  Parent root = FXMLLoader.load(getClass().getResource("ElectronicPutOnSale.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Put On Sale");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	public void addupdate(ActionEvent event)throws IOException{
		  Stage primaryStage = new Stage();
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		  Parent root = FXMLLoader.load(getClass().getResource("UpdateProductToStore.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Update Product To Store ");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }
	  
	public void addbhahir(ActionEvent event)throws IOException {
		Stage primaryStage = new Stage();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.hide();
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	  


}
