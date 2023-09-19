module com.mycompany.teste2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.teste2 to javafx.fxml;
    exports com.mycompany.teste2;
}
