package fr.afpa.democss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // *** TITLE IN STAGE ***
        primaryStage.setTitle(" EX AFPA CSS");

        // ICON
        Image icon = new Image(getClass().getResourceAsStream("afpa.png"));
        primaryStage.getIcons().add(icon); // Add icon in stage

        // *** SCENE ***

        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}