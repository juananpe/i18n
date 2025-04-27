module eus.ehu.i18n {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens eus.ehu.i18n to javafx.fxml;
    exports eus.ehu.i18n;
}