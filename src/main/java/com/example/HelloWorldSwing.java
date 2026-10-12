package com.example;

import javax.swing.*;    
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  


public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */

    private static void createAndShowGUI() {

        
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 400));
        JPanel content = new JPanel();
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("hello world");
      //  frame.getContentPane().add(label);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(100, 100));

        //Add the "Press Me" button.
        JButton button = new JButton("press me");
        button.setPreferredSize(new Dimension(100, 50));
        button.addActionListener(new ActionListener() {
        
                public void actionPerformed(ActionEvent e) {
                    label.setText("you did it");
                }
        });
     
        //Add the grid layout
        content.setLayout(new GridLayout(2,4));
        content.add(button);
        content.add(label);
        frame.add(content);
        //Add the menu bar at the top of my applet


        //Display the window.
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
