package views;

import javax.swing.*;
import java.awt.*;

public class PagePanel extends JPanel {
    public PagePanel() {

        setLayout(new BorderLayout());

        JPanel leftbarInsideRightPanel = new JPanel();
        CustomTextPane customTextPane = new CustomTextPane();

        add(leftbarInsideRightPanel, BorderLayout.LINE_START);
        add(new JScrollPane(customTextPane), BorderLayout.CENTER);
    }
}
