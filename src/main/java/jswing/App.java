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
 *  Last Modified:  13th April 2K20, 06:07 AM..!!
 *
 *  2nd Commit - Main Frame
 *
 *  1. Added New Class named MainFrame extending JFrame to handle all the frame operations.
 *  2. Added JTextArea and JButton to the MainFrame according to the Border Layout.
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */
