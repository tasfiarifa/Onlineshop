/**
 * 
 */
package application;

/**
 * @author Busra
 *
 */
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UpdateProductToStoreController {

	@FXML
	public void addButton(ActionEvent event)throws IOException{
		//System.out.println("Happy Shopping");
		 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("VeiwProduct.fxml"));
	    Scene scene = new Scene(root);
	    primaryStage.setTitle("VeiwProduct");
		
	     //TO get new Controller method
		//MenuControler mControler = loder.getController();
		
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
	
	
	
	}
	
	public void addbhahir(ActionEvent event)throws IOException{
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

