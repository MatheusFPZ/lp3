module com.mycompany.puxarselecao {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.puxarselecao to javafx.fxml;
    exports com.mycompany.puxarselecao;
}
