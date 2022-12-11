package views;

import javax.swing.*;

public class FileMenu extends JMenu {
    public FileMenu() {
        super("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        add(newMenuItem);
    }
}
