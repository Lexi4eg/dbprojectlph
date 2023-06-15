module com.example.infi_project_plh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens model to javafx.base;

    opens com.example.infi_project_plh to javafx.fxml;
    exports com.example.infi_project_plh;
}