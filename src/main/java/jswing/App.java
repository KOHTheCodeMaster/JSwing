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
                MainFrame mainFrame = new MainFrame();
            }
        });

    }

}

/*
 *  Date Created:   13th April 2K20, 05:35 AM..!!
 *  Last Modified:  13th April 2K20, 06:17 AM..!!
 *
 *  3rd Commit - Button ActionListener
 *  Added ActionListener to btn in MainFrame, appends specified String to the textArea when clicked.
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */
