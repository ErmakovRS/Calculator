package main.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CalcView.fxml"));
        stage.setResizable(false);
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public void run() {
        launch();
    }
}
