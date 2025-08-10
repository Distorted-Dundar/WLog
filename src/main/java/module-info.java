module com.example.wlog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wlog to javafx.fxml;
    exports com.example.wlog;
}