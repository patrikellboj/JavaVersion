import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

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
    
    public void openWebPage(String url){
        URI uri = URI.create(url);
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IllegalArgumentException | IOException iae) {
            System.out.println("Url not found");
        }
    }
}
