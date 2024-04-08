package SenseXP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/hello-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Sense XP");

        // Get the scene size from the loaded FXML file
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Optionally, you can adjust the stage size based on the scene size
        primaryStage.sizeToScene();

        primaryStage.show();
    }
}