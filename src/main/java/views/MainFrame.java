package views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Writo App");

        ToolbarPanel toolbarPanel = new ToolbarPanel();
        CustomTree tree = new CustomTree();
        JPanel documentPanel = new JPanel();
        StatusPanel statusPanel = new StatusPanel();
        LeftmostPanel leftmostPanel = new LeftmostPanel();
        RightmostPanel rightmostPanel = new RightmostPanel();
        CustomSplitPane splitPane = new CustomSplitPane(tree, documentPanel);

        setLayout(new BorderLayout());
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(toolbarPanel, BorderLayout.PAGE_START);
        add(leftmostPanel, BorderLayout.LINE_START);
        add(splitPane, BorderLayout.CENTER);
        add(rightmostPanel, BorderLayout.LINE_END);
        add(statusPanel, BorderLayout.PAGE_END);

        setJMenuBar(new CustomMenuBar());
    }
}
