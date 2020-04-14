package jswing.customComponents;

import jswing.listeners.ToolbarListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton heyBtn;
    private JButton byeBtn;
    private ToolbarListener toolbarListener;

    public Toolbar() {

        //  Initialize buttons
        heyBtn = new JButton("Hey");
        byeBtn = new JButton("Bye");

        heyBtn.addActionListener(this);
        byeBtn.addActionListener(this);

        //  set layout for the textPanel
        setLayout(new FlowLayout(FlowLayout.CENTER));

        setBorder(BorderFactory.createEtchedBorder());

        add(heyBtn);
        add(byeBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (toolbarListener != null) {

            JButton btnClicked = (JButton) e.getSource();

            if (btnClicked == heyBtn)
                toolbarListener.sendText("Hey\n");
            else if (btnClicked == byeBtn)
                toolbarListener.sendText("Bye\n");

        }

    }

    public void setToolbarListener(ToolbarListener toolbarListener) {
        this.toolbarListener = toolbarListener;
    }

}
