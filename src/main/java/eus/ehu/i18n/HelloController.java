package eus.ehu.i18n;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ResourceBundle;
import java.util.Locale;

public class HelloController {
    @FXML
    private Label welcomeText;
    private ResourceBundle bundle;

    @FXML
    public void initialize() {
        this.bundle = ResourceBundle.getBundle("eus.ehu.i18n.Messages", Locale.getDefault());
        welcomeText.setText(bundle.getString("welcome"));
    }

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        welcomeText.setText(bundle.getString("clicked"));
    }
}