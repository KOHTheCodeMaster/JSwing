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
        SwingUtilities.invokeLater(MainFrame::new);

    }

}

/*
 *  Date Created:   13th April 2K20, 05:35 AM..!!
 *  Last Modified:  14th April 2K20, 08:15 PM..!!
 *
 *  7th Commit - FormPanel
 *  Added Empty FormPanel
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */
