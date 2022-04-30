package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ElectronicPutOnSaleController{
	@FXML
	public void addPlane(ActionEvent event)throws IOException{
	  //To Hide the current window
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  stage.hide();
	  
	  
	  Stage primaryStage = new Stage();
	  Parent root  = FXMLLoader.load(getClass().getResource("Add Product Item To Store.fxml"));
	   // Parent root = loder.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Put On Sale");
		
	     //TO get new Controller method
		//MenuControler mControler = loder.getController();
		
		primaryStage.setScene(scene);
		primaryStage.show();
  }
}