package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Controladora2 {
	@FXML
	public ImageView refugees;
	private Ellipse ceiling;
	public AnchorPane page;
	public Scene scene;

//	private void initialize() {
//		Scene scene = new Scene(page);
//		// refugees.setEffect(new GaussianBlur(50));
//		// refugees.fitWidthProperty().bind(sendStage.widthProperty());
//		refugees.fitWidthProperty().bind(scene.widthProperty());
//		refugees.setPreserveRatio(true);
//		sendStage.setScene(scene);
//
//	}

	// private void initializeCeiling(AnchorPane root) {
	// ceiling = new Ellipse();
	// ceiling.centerXProperty().bind(root.widthProperty().multiply(0.5));
	// ceiling.centerYProperty().setValue(0);
	// ceiling.radiusXProperty().bind(root.widthProperty().multiply(0.8));
	// ceiling.radiusYProperty().bind(root.heightProperty().multiply(0.6));
	// }

	/**
	 * Opens an stage to send the profile
	 */

	public void showSendProfile() {
		try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista2.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();    
            sendStage.setTitle("JAVAFX2");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);          
            sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class SetBlur {

		@FXML
		private ImageView refugees;

		
		@FXML
		public void initialize() {
			refugees.setEffect(new GaussianBlur(50));

		}
	}


	@FXML
	private void handleSend() {
		showSendProfile();
	}

	@FXML
	private void handleClose() {
		System.exit(0);
	}
	
	
	
    
    
}
