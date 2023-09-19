module com.mycompany.panel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.panel to javafx.fxml;
    exports com.mycompany.panel;
}
