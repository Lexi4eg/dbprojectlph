module com.example.infiprojectplh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.infiprojectplh to javafx.fxml;
    exports com.example.infiprojectplh;
}