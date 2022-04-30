package application;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import OnlineStore.Stores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


import javafx.stage.Stage;
public class FoodAddProductController {

	@FXML
	private TextField Fname;
	@FXML
	private TextField Fid;
	@FXML
	private TextField Fprice;
	@FXML
	private TextField Fexpire;
	@FXML
	private TextField Fquantity;
	@FXML
	private TextField Fmgf;
	String nameValue;
	String codeValue;
	int quantityValue;
	double priceValue;
	LocalDate mgf;
	LocalDate exp;
	public void confirm(){
		try{

			System.out.println(Fname.getText());
			codeValue = (Fid.getText());
			nameValue = Fname.getText();
			priceValue = Double.parseDouble(Fprice.getText());
			quantityValue = Integer.parseInt(Fquantity.getText());

			Main.market.addProduct(nameValue, codeValue, quantityValue,mgf,exp,  priceValue);
			Main.market.viewProducts(true);

		}


		catch(Exception e){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Input Error".toUpperCase(Locale.ROOT));
			alert.setContentText("Please re-check input values".toUpperCase(Locale.ROOT));
			alert.showAndWait();
		}

	}
	public void Next(ActionEvent event)throws IOException{

		//System.out.println("Happy Shopping");
		//To Hide the current window
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();


		Stage primaryStage = new Stage();
		Parent root  = FXMLLoader.load(getClass().getResource("ClotheAddProduct.fxml"));
		// Parent root = loder.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Put On Sale");

		//TO get new Controller method

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void add(ActionEvent event)throws IOException{

		//System.out.println("Happy Shopping");
		//To Hide the current window
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();


		Stage primaryStage = new Stage();
		Parent root  = FXMLLoader.load(getClass().getResource("Add Product Item To Store.fxml"));
		// Parent root = loder.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Put On Sale");

		//TO get new Controller method

		primaryStage.setScene(scene);
		primaryStage.show();
	}


}