package eus.ehu.i18n;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        
        ResourceBundle bundle = ResourceBundle.getBundle("eus.ehu.i18n.Messages", Locale.getDefault());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"), bundle);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle(bundle.getString("welcome"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}