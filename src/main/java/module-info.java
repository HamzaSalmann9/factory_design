module com.example.factory_design {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.factory_design to javafx.fxml;
    exports com.example.factory_design;
}