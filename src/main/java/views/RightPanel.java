package views;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    public RightPanel() {

        CustomTabbedPane customTabbedPane = new CustomTabbedPane();

        setLayout(new BorderLayout());
        add(customTabbedPane, BorderLayout.CENTER);

    }
}
