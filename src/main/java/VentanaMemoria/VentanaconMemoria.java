package VentanaMemoria;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Slider;

public class VentanaconMemoria extends Application {
	public void start(Stage primaryStage) {
		try {

			HBox rojo = new HBox();
			Text red = new Text("Red");
			rojo.setSpacing(5);
			Slider slider1 = new Slider(0, 1, 0.5);
			rojo.getChildren().addAll(red, slider1);
			HBox verde = new HBox();
			Text green = new Text("Green");
			rojo.setSpacing(5);
			Slider slider2 = new Slider(0, 1, 0.5);
			verde.getChildren().addAll(green, slider2);
			HBox azul = new HBox();
			Text blue = new Text("Blue");
			rojo.setSpacing(5);
			Slider slider3 = new Slider(0, 1, 0.5);
			azul.getChildren().addAll(blue, slider3);

			// Final
			VBox root = new VBox();
			root.setSpacing(10);
			root.getChildren().addAll(rojo, verde, azul);

			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("Ventana con Memoria");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);
	}

}
