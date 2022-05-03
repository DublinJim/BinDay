module com.example.binday {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.binday to javafx.fxml;
    exports com.example.binday;
}