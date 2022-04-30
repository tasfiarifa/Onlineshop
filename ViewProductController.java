/**
 * 
 */
package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * @author Busra
 *
 */
public class ViewProductController{
		
	public void addCategorybutton(ActionEvent event) throws IOException{
		System.out.print("Happy Shopping");
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();
		
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("AddProductToCart.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Add Product To Cart.fxml");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void addexit(ActionEvent event)throws IOException{
		  Stage primaryStage = new Stage();
		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.hide();
		 
		  Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			//primaryStage.setTitle("Add Product To Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }

}

