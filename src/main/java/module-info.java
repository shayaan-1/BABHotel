module com.example.babhotel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.babhotel to javafx.fxml;
    exports com.example.babhotel;
}