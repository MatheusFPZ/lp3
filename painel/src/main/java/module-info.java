module com.mycompany.painel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.painel to javafx.fxml;
    exports com.mycompany.painel;
}
