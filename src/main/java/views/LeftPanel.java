package views;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    public LeftPanel() {

        setLayout(new BorderLayout());

        CustomTree customTree = new CustomTree();
        JPanel topbarInsideLeftPanel = new JPanel();
        topbarInsideLeftPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        add(topbarInsideLeftPanel, BorderLayout.PAGE_START);
        add(new JScrollPane(customTree), BorderLayout.CENTER);
    }
}
