package views;

import javax.swing.*;
import java.awt.*;

public class CustomSplitPane extends JSplitPane {

    public CustomSplitPane(Component newLeftComponent, Component newRightComponent) {
        super(JSplitPane.HORIZONTAL_SPLIT, newLeftComponent, newRightComponent);
    }
}
