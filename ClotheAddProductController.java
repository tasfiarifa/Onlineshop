/**
 *
 */
package application;


import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import OnlineStore.SubCategory;
import OnlineStore.Size;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.stage.Stage;



public class ClotheAddProductController {
	@FXML
	private TextField Cname;
	@FXML
	private TextField Cid;
	@FXML
	private TextField Cbrand;
	@FXML
	private TextField Ccategory;
	@FXML
	private TextField Cprice;
	@FXML
	private TextField Cquantity;


	String nameValue;
	String Brand;
	String codeValue;
	int quantityValue;
	double priceValue;
	SubCategory sub;
	Size size;
	public void confirm(){
		try{

			System.out.println(Cname.getText());
			codeValue = (Cid.getText());
			nameValue = Cname.getText();
			priceValue = Double.parseDouble(Cprice.getText());
			quantityValue = Integer.parseInt(Cquantity.getText());
			Brand = Cbrand.getText();

			Main.market.addProduct(nameValue, codeValue,  quantityValue,Brand, sub,size, priceValue);
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
	public void setSize1(){
		size = Size.SMALL;
	}
	public void setSize2(){
		size = Size.MEDIUM;
	}
	public void setSize3(){
		size = Size.LARGE;
	}
	public void setSize4(){
		size = Size.XL;
	}
	public void setSize5(){
		size = Size.XXL;
	}



	public void addclothesbutton(ActionEvent event) throws IOException{
		System.out.println("Happy Shopping");
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();

		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ElectronicAddProduct.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Electronic Add Product");
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

