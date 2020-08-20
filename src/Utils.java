import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Utils {

    /**
     * Opens a directory on disk in the file explorer of the OS
     * @param directory the directory to open
     */
    public void openDiskDirectory(String directory) {
        File dir = new File (directory);
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
