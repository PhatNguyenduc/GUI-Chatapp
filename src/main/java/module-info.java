module com.example.gui_12_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gui_12_1 to javafx.fxml;
    exports com.example.gui_12_1;
}