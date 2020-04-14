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
 *  Last Modified:  14th April 2K20, 07:50 PM..!!
 *
 *  6th Commit - ToolbarListener
 *  Handle Toolbar Button Events using ToolbarListener
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */
