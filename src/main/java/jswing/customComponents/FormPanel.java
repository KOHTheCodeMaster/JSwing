package jswing.customComponents;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    public FormPanel() {

        setPreferredSize(new Dimension(300, 50));

        initializeBordere();

    }

    private void initializeBordere() {

        Border innerBorder = BorderFactory.createTitledBorder("Add Movie");
        Border outerrBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerrBorder, innerBorder));

    }


}
