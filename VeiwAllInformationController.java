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
public class VeiwAllInformationController {
	@FXML
	public void addbutton(ActionEvent event)throws IOException{
		//System.out.println("Happy Shopping");
	  //To Hide the current window
	  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  stage.hide();
	  
	  
	  Stage primaryStage = new Stage();
	  Parent root  = FXMLLoader.load(getClass().getResource("Menu.FXML"));
	   // Parent root = loder.load();
		Scene scene = new Scene(root);
		//primaryStage.setTitle("Veiw Product");
		
	     //TO get new Controller method
		//MenuControler mControler = loder.getController();
		
		primaryStage.setScene(scene);
		primaryStage.show();
  }
	
}
