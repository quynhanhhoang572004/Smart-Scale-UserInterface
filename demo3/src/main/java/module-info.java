module main.SenseXPApplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens main.SenseXPApplication to javafx.fxml;
    exports main.SenseXPApplication;
}