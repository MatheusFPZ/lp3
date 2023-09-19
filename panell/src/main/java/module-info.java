module com.mycompany.panell {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.panell to javafx.fxml;
    exports com.mycompany.panell;
}
