package views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Writo App");

        JPanel toolbarPanel = new JPanel();
        JTree tree = new JTree();
        JPanel documentPanel = new JPanel();
        JPanel statusPanel = new JPanel();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tree, documentPanel);

        setLayout(new BorderLayout());
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(toolbarPanel, BorderLayout.PAGE_START);
        add(splitPane, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.PAGE_END);
    }
}
