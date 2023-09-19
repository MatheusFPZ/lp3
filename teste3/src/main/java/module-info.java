module com.mycompany.teste3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.teste3 to javafx.fxml;
    exports com.mycompany.teste3;
}
