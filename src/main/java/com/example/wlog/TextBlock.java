package com.example.wlog;

import javafx.beans.property.StringProperty;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class TextBlock extends AnchorPane {
    private final TextArea area = new TextArea();

    public TextBlock() {
        AnchorPane.setTopAnchor(area, 0.0);
        AnchorPane.setLeftAnchor(area, 0.0);
        AnchorPane.setRightAnchor(area, 0.0);
        AnchorPane.setBottomAnchor(area, 0.0);
        getChildren().add(area);
    }

    public String getText() { return area.getText(); }
    public void setText(String v) { area.setText(v); }
    public StringProperty textProperty() { return area.textProperty(); }
}
