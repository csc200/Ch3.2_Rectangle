import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog input = new TextInputDialog();
		input.setTitle("Rectangle Application");
		input.setHeaderText("The Primeter of Rectangle");
		input.setContentText("Enter the height/width");
		input.showAndWait();
		double h = Double.parseDouble(input.getResult());
		double w = Double.parseDouble(input.getResult());

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(" Rectangle");
		alert.setHeaderText("Primeter");
		alert.setContentText("You primeter is" + 2*h +2*w);
		alert.showAndWait();
	}

	public static void main(String [] args) {
		launch(args);
	}
}
		
