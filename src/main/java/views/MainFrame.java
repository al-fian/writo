package views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Writo App");

        JPanel toolbarPanel = new JPanel();
        CustomTree tree = new CustomTree();
        JPanel documentPanel = new JPanel();
        JPanel statusPanel = new JPanel();
        JPanel leftmostPanel = new JPanel();
        JPanel rightmostPanel = new JPanel();
        CustomSplitPane splitPane = new CustomSplitPane(tree, documentPanel);

        setLayout(new BorderLayout());
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toolbarPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        leftmostPanel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        rightmostPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        statusPanel.setBorder(BorderFactory.createLineBorder(Color.ORANGE));

        add(toolbarPanel, BorderLayout.PAGE_START);
        add(leftmostPanel, BorderLayout.LINE_START);
        add(splitPane, BorderLayout.CENTER);
        add(rightmostPanel, BorderLayout.LINE_END);
        add(statusPanel, BorderLayout.PAGE_END);
    }
}
