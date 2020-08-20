//import com.company.Controller.Controller;
//import com.company.Model.Response;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{

    //Program utils
    private Utils utils = new Utils();

    //Controller controller;
    JPanel panelOutput, panelInput;
    JTextArea display;
    JButton openJavaDirBtn;
    JLabel emptySpace;
    JButton quitBtn;
    Info info;


    public View() {
        //controller = new Controller();
        createGUI();
        createListeners();
    }

    public void createGUI(){

        panelOutput = new JPanel();
        panelInput = new JPanel();
        display = new JTextArea();
        openJavaDirBtn = new JButton("OPEN");
        emptySpace = new JLabel();
        quitBtn = new JButton("QUIT");
        info = new Info();

//---------- OUTPUT PANEL --------------
        panelOutput.setBackground(new Color(43, 43, 43));
        display.setPreferredSize(new Dimension(562,414));
        display.setBackground(new Color(64, 64, 64));
        display.setEditable(false);
        display.setForeground(Color.white);
        display.setFont(new Font("Georgia", Font.PLAIN, 14));
        display.append("  User account name\t" + info.getOSUserName() + "\n\n" );
        display.append("  Operating system name\t" + info.getOSName() + "\n\n" );
        display.append("  Operating system version\t" + info.getOSVersion() + "\n\n" );
        display.append("  JRE version number\t" + info.getJavaVersion() + "\n\n" );
        display.append("  Installation directory for JRE\t" + info.getJavaHomeDir() + "\n\n" );



        panelOutput.add(display);

//------------ INPUT PANEL -------------
        openJavaDirBtn.setPreferredSize(new Dimension(70,28));
        panelInput.add(openJavaDirBtn);
        emptySpace.setPreferredSize(new Dimension(412,28));
        panelInput.add(emptySpace);
        quitBtn.setPreferredSize(new Dimension(70,28));
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
    }
}