module com.example.infi_project_plh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.infi_project_plh to javafx.fxml;
    exports com.example.infi_project_plh;
}