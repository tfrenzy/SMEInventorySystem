/*
 * SMEInventorySystemApp.java
 */

package smeinventorysystem;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class SMEInventorySystemApp extends SingleFrameApplication {

    public static String OfficerLoggedIn = null;
    public static String OfficerCategory = null;
    /**
     * At startup create and show the main frame of the application.
     */

 @Override protected void startup() {
        SMEInventorySystemView ard = new SMEInventorySystemView(this);
        ard.OfficerLoggedIn = OfficerLoggedIn;
        ard.OfficerCategory = OfficerCategory;
        show(ard);
    }
    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of SMEInventorySystemApp
     */
    public static SMEInventorySystemApp getApplication() {
        return Application.getInstance(SMEInventorySystemApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        if (OfficerLoggedIn != null) {
        launch(SMEInventorySystemApp.class, args);
        }
 else {
        Login log = new Login();
        log.setVisible(true);
    }
    }
}
