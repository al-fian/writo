package views;

import javax.swing.*;

public class CustomTree extends JTree {
    public CustomTree() {

        int padding = 5;
        setBorder(BorderFactory.createEmptyBorder(padding, padding,padding, padding));
    }
}
