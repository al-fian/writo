package views;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class CustomMenuBar extends JMenuBar {
    public CustomMenuBar() {
        FileMenu fileMenu = new FileMenu();
        fileMenu.setMnemonic(KeyEvent.VK_F);

        add(fileMenu);
    }
}
