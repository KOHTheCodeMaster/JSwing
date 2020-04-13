package jswing;

import javax.swing.*;

public class App {

    public static void main(String[] arg) {
        /*
         *  Time Stamp: 13th April 2K20, 05:35 AM..!!
         *  Invoking the SwingUtilities.invokeLater method which is
         *  usually the appropriate way of executing swing programs
         *  when possibly dealing with multithreading, to avoid uncertain
         *  program crashes just to be safe than sorry,
         *
         *  Creating an Anonymous class that implements the Runnable interface
         *  to define the run method.
         */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                //  Using JFrame component with parameterized constructor to set
                //  the title of the frame as "First JFrame".
                JFrame frame = new JFrame("First JFrame");

                //  Set frame to be visible.
                frame.setVisible(true);

                //  Set frame size to 1280x720. (Pixels)
                frame.setSize(1280, 720);

                //  Set default close operation to exit.
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

    }

}

/*
 *  Date Created:   13th April 2K20, 05:35 AM..!!
 *  Last Modified:  13th April 2K20, 05:35 AM..!!
 *
 *  Change Log:
 *
 *  Init Commit - First JFrame
 *  Basic JFrame with specified Title and width.
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */
