package application;

import java.io.IOException;
import java.util.Locale;

import OnlineStore.ElectCategory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ElectronicAddProductController{
	@FXML
	TextField name;
	@FXML
	TextField code;
	@FXML
	TextField quantity;
	@FXML
	TextField price;
	@FXML
			TextField manufacturer;

	String nameValue;
	String manufacturerValue;
	String codeValue;
	int quantityValue;
	double priceValue;
	ElectCategory subCategory;

	public void confirm(){
		try{

			System.out.println(name.getText());
			codeValue = (code.getText());
			nameValue = name.getText();
			priceValue = Double.parseDouble(price.getText());
			quantityValue = Integer.parseInt(quantity.getText());
			manufacturerValue = manufacturer.getText();
			Main.market.addProduct(nameValue, codeValue, quantityValue, manufacturerValue, subCategory, priceValue);
			Main.market.viewProducts(true);

			Stage thisStage=(Stage) name.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("Add Product Item to Store.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			thisStage.setTitle("Add Product");
			thisStage.setScene(scene);




		}


		catch(Exception e){
			System.out.println(e.getMessage());//dekhi ki bole
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Input Error".toUpperCase(Locale.ROOT));
			alert.setContentText("Please re-check input values".toUpperCase(Locale.ROOT));
			alert.showAndWait();
		}

	}
	public void setHomeAppliance(){
		subCategory = ElectCategory.HOME_APPLIANCE;
	}
	public void setKitchenAppliance(){
		subCategory = ElectCategory.KITCHEN_APPLIANCE;
	}
	public void setElectronicDevice(){
		subCategory = ElectCategory.ELECTRONIC_DEVICE;
	}
	public void setElectronicAccessory(){
		subCategory = ElectCategory.ELECTRONIC_ACCESSORY;
	}



	public void addPlane(ActionEvent event)throws IOException{
	  //To Hide the current window
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  stage.hide();
	  
	  
	  Stage primaryStage = new Stage();
	  Parent root  = FXMLLoader.load(getClass().getResource("ElectronicPutOnSale.fxml"));
	   // Parent root = loder.load();
		Scene scene = new Scene(root);
		primaryStage.setTitle("Put On Sale");
		
	     //TO get new Controller method
		//MenuControler mControler = loder.getController();
		
		primaryStage.setScene(scene);
		primaryStage.show();
  }
	public void addp(ActionEvent event)throws IOException{
		  Stage primaryStage = new Stage();
		 
		  Parent root = FXMLLoader.load(getClass().getResource("Add Product Item To Store.fxml"));
			//Parent root = loader.load();
			Scene scene = new Scene(root);
			//primaryStage.setTitle("Add Product To Store");
			primaryStage.setScene(scene);
			primaryStage.show();
	  }


	
	
}
