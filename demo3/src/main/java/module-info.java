module main.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens main.demo3 to javafx.fxml;
    exports main.demo3;
}