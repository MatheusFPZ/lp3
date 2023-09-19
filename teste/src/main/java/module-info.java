module com.mycompany.teste {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.teste to javafx.fxml;
    exports com.mycompany.teste;
}
