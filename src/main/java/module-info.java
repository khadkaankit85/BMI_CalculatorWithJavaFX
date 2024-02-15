module org.example.dino {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.dino to javafx.fxml;
    exports org.example.dino;
}