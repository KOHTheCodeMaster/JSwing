package jswing.customComponents;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {

    private JButton heyBtn;
    private JButton byeBtn;

    public Toolbar() {

        //  Initialize buttons
        heyBtn = new JButton("Hey");
        byeBtn = new JButton("Bye");

        //  set layout for the textPanel
        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(heyBtn);
        add(byeBtn);
    }

}
