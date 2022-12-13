package views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Writo App");

        ToolbarPanel toolbarPanel = new ToolbarPanel();
        LeftPanel leftPanel = new LeftPanel();
        RightPanel rightPanel = new RightPanel();
        StatusPanel statusPanel = new StatusPanel();
        LeftmostPanel leftmostPanel = new LeftmostPanel();
        RightmostPanel rightmostPanel = new RightmostPanel();
        CustomSplitPane splitPane = new CustomSplitPane(leftPanel, rightPanel);

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
