package jswing;

import jswing.customComponents.TextPanel;
import jswing.customComponents.Toolbar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private Toolbar toolbar;
    private TextPanel textPanel;

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

    }

    private void initializeListeners() {

        //  Set toolbarListener to the toolbar
        toolbar.setToolbarListener(str -> textPanel.appendText(str));

    }

    private void initializeLayoutSettings() {

        //  set layout for the frame as BorderLayout
        setLayout(new BorderLayout());

        //  Add components to the frame according to the border layout
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

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
