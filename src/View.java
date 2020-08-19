//import com.company.Controller.Controller;
//import com.company.Model.Response;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{

    //Controller controller;
    JPanel panelOutput, panelInput;
    JTextArea display;
    JButton open;
    JLabel emptySpace;
    JButton quit;


    public View() {
        //controller = new Controller();
        createGUI();
        createListeners();
    }

    public void createGUI(){

        this.setTitle("Test!");

        panelOutput = new JPanel();
        panelInput = new JPanel();
        display = new JTextArea();
        open = new JButton("OPEN");
        emptySpace = new JLabel();
        quit = new JButton("QUIT");

//---------- OUTPUT PANEL --------------
        panelOutput.setBackground(new Color(43, 43, 43));
        display.setPreferredSize(new Dimension(562,414));
        display.setBackground(new Color(64, 64, 64));
        display.setEditable(false);
        display.setForeground(Color.white);
        display.setFont(new Font("Georgia", Font.PLAIN, 14));
        display.append("  User account name\t" + System.getProperty("user.name") + "\n\n" );
        display.append("  Operating system name\t" + System.getProperty("os.name") + "\n\n" );
        display.append("  Operating system version\t" + System.getProperty("os.version") + "\n\n" );
        display.append("  JRE version number\t" + System.getProperty("java.version") + "\n\n" );
        display.append("  Installation directory for JRE\t" + System.getProperty("java.home") + "\n\n" );



        panelOutput.add(display);

//------------ INPUT PANEL -------------
        open.setPreferredSize(new Dimension(70,28));
        panelInput.add(open);
        emptySpace.setPreferredSize(new Dimension(412,28));
        panelInput.add(emptySpace);
        quit.setPreferredSize(new Dimension(70,28));
        panelInput.add(quit);

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

        quit.addActionListener(e -> {
            System.exit(0);
        });

        open.addActionListener(e -> {
        });
    }

}
