package jswing.customComponents;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel() {

        //  Initialize textArea
        this.textArea = new JTextArea();

        //  set layout for the textPanel
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String str) {
        textArea.append(str);
    }

}
