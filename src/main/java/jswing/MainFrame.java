package jswing;

import jswing.customComponents.TextPanel;
import jswing.customComponents.Toolbar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private Toolbar toolbar;
    private TextPanel textPanel;
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

    private void initializeDataMembers() {

        toolbar = new Toolbar();
        textPanel = new TextPanel();
        btn = new JButton("Submit");

    }

    private void initializeListeners() {

        //  Add ActionListener to the btn
        btn.addActionListener((actionEvent) -> textPanel.appendText("\nHola..!! :D\n"));

    }

    private void initializeLayoutSettings() {

        //  set layout for the frame as BorderLayout
        setLayout(new BorderLayout());

        //  Add components to the frame according to the border layout
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
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
