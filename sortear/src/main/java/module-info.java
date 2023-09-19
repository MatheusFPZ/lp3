module com.mycompany.sortear {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.sortear to javafx.fxml;
    exports com.mycompany.sortear;
}
