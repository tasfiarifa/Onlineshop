package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
public class MenuController{
 
	@FXML
  
  public void addMenuBar(ActionEvent event)throws IOException{
		//System.out.println("Yeahoo");
	  //To hide the current window
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  stage.hide();
	  //New Window
	  Stage primaryStage = new Stage();
	  Parent root = FXMLLoader.load(getClass().getResource("Add Product Item to Store.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();


  }
  public void addveiwProduct(ActionEvent event)throws IOException{
	  Stage primaryStage = new Stage();
	 
	  Parent root = FXMLLoader.load(getClass().getResource("ViewProduct.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();
  }
  
  
  public void addproductcart(ActionEvent event)throws IOException{
	  Stage primaryStage = new Stage();
	 
	  Parent root = FXMLLoader.load(getClass().getResource("AddProductToCart.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();
  }
  public void addeditproduct(ActionEvent event)throws IOException{
	  Stage primaryStage = new Stage();
	 
	  Parent root = FXMLLoader.load(getClass().getResource("EditProductToCart.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();
  }
 
  public void addveiwinformation(ActionEvent event)throws IOException{
	  Stage primaryStage = new Stage();
	 
	  Parent root = FXMLLoader.load(getClass().getResource("ViewAlllnformation.fxml"));
		//Parent root = loader.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Add Product To Store");
		primaryStage.setScene(scene);
		primaryStage.show();
  }
  public void exit(ActionEvent event) {

		System.out.println("Exit Shop");
  }
  
}
