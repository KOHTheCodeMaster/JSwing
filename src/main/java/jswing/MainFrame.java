package jswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn;

    public MainFrame() {

        init();

    }

    private void init() {

        initializeDataMembers();

        initializeListeners();

        initializeLayoutSettings();

        initializeFrameSettings();

    }

    private void initializeListeners() {

        //  Add ActionListener to the btn
        btn.addActionListener((actionEvent) -> textArea.append("\nHola..!! :D\n"));

    }

    private void initializeDataMembers() {

        textArea = new JTextArea();
        btn = new JButton("Submit");

    }

    private void initializeLayoutSettings() {

        //  set layout for the frame as BorderLayout
        setLayout(new BorderLayout());

        //  Add components to the frame according to the border layout
        add(textArea, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);

    }

    private void initializeFrameSettings() {

        //  the title of the frame as "Main Frame".
        setTitle("Main Frame");

        //  Set frame to be visible.
        setVisible(true);

        //  Set frame size to 1280x720. (Pixels)
        setSize(1280, 720);

        //  Set default close operation to exit.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
