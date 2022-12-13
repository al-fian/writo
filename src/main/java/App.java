import com.formdev.flatlaf.FlatLightLaf;
import views.MainFrame;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        SwingUtilities.invokeLater(App::createAndShowGui);
    }

    public static void createAndShowGui() {
        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());

        new MainFrame();
    }
}
