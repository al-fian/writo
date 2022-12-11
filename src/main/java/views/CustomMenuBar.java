package views;

import javax.swing.*;

public class CustomMenuBar extends JMenuBar {
    public CustomMenuBar() {
        FileMenu fileMenu = new FileMenu();

        add(fileMenu);
    }
}
