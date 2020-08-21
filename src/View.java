import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class View extends JFrame {

    //Program utils
    private Utils utils = new Utils();

    //Controller controller;
    JPanel panelOutput, panelInput;
    JTextArea display;
    JButton openJavaDirBtn;
    JLabel emptySpace;
    JButton quitBtn;
    JButton downloadBtn;
    Info info;
    int convertByteToGb = 1073741824;


    public View() {
        //controller = new Controller();
        createGUI();
        createListeners();
    }

    public void createGUI() {

        panelOutput = new JPanel();
        panelInput = new JPanel();
        display = new JTextArea();
        openJavaDirBtn = new JButton("Open java directory");
        downloadBtn = new JButton("Download Java");
        emptySpace = new JLabel();
        quitBtn = new JButton("QUIT");
        info = new Info();

//---------- OUTPUT PANEL --------------
        panelOutput.setBackground(new Color(43, 43, 43));
        display.setPreferredSize(new Dimension(562, 414));
        display.setBackground(new Color(64, 64, 64));
        display.setEditable(false);
        display.setForeground(Color.white);
        display.setFont(new Font("Georgia", Font.PLAIN, 14));
        display.append("  User account name\t" + info.getOSUserName() + "\n\n");
        display.append("  Operating system name\t" + info.getOSName() + "\n\n");
        display.append("  Operating system version\t" + info.getOSVersion() + "\n\n");
        display.append("  JRE version number\t" + info.getJavaVersion() + "\n\n");
        display.append("  Installation directory for JRE\t" + info.getJavaHomeDir() + "\n\n");

        for (File root : info.getRoots()) {
            display.append("  File system root: " + root.getAbsolutePath() + "\n\n");
            display.append("  Total space: " + root.getTotalSpace() / convertByteToGb + " gb\n\n");
            display.append("  Free space: " + root.getFreeSpace() / convertByteToGb + " gb\n\n");
            //display.append("  Usable space: " + root.getUsableSpace() / convertByteToGb+ " gb\n\n");
        }


        panelOutput.add(display);

//------------ INPUT PANEL -------------
        openJavaDirBtn.setPreferredSize(new Dimension(150, 28));
        panelInput.add(openJavaDirBtn);
        downloadBtn.setPreferredSize(new Dimension(150, 28));
        panelInput.add(downloadBtn);
        emptySpace.setPreferredSize(new Dimension(182, 28));
        panelInput.add(emptySpace);
        quitBtn.setPreferredSize(new Dimension(70, 28));
        panelInput.add(quitBtn);

//        Dimension buttonBounds = new Dimension(40,40);
//        panelInput.setLayout(new GridLayout(1,2));
//        open.setPreferredSize(buttonBounds);
//        panelInput.add(open);
//        quit.setPreferredSize(buttonBounds);
//        panelInput.add(quit);

//-------------- FRAME -------------
        this.setTitle("Java Version");
        this.setLayout(new BorderLayout());
        this.add(panelOutput, BorderLayout.CENTER);
        this.add(panelInput, BorderLayout.SOUTH);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createListeners() {
        quitBtn.addActionListener(e -> {
            System.exit(0);
        });

        openJavaDirBtn.addActionListener(e -> {
            utils.openDiskDirectory(System.getProperty("java.home"));  //TODO ersätt system.get
        });

        downloadBtn.addActionListener(e -> {
            utils.openWebPage("https://www.oracle.com/java/technologies/");
        });
    }
}