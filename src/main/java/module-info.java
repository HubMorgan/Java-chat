module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Chat to javafx.fxml;
    exports com.example.Chat;
}