/**
 * 
 */
package application;
import OnlineStore.Cart;
import OnlineStore.Stores;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Busra
 *
 */
public class Main extends Application {	
	

	public static Stores market = new Stores("UAP MARKET");

	public static Stores getStore(){
		return  market;
	}

	@Override
		public void start(Stage primaryStage) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
				//StackPane root = new StackPane();//layout
				//Parent root = loader.load();
				Scene scene = new Scene(root);
				//root.getController();
				//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("Menu");
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
}

