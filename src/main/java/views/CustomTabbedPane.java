package views;

import javax.swing.*;

public class CustomTabbedPane extends JTabbedPane {
    public CustomTabbedPane() {

        PagePanel pagePanel = new PagePanel();

        addTab("Page 1", pagePanel);
    }
}
