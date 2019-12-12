package de.karasuma.javafx.example;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ExampleController {
    public AnchorPane anchor;

    public void initialize() {
        anchor.getChildren().add(new Label("JavaFX Java 11 example"));
    }
}
