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
        label.setVisible(true);
        label.setPreferredSize(new Dimension(100, 100));

        //Add the "Press Me" buttons.
        JButton button = new JButton("press me");
        button.setPreferredSize(new Dimension(100, 50));
        button.addActionListener(new ActionListener() {
        
                public void actionPerformed(ActionEvent e) {
                    label.setText("you did it");
                }
        });

        JButton buttonTwo = new JButton("no press me");
        buttonTwo.setPreferredSize(new Dimension(100, 50));
        buttonTwo.addActionListener(new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                    label.setText("hah you pressed me");
                }

        });

        JButton buttonThree = new JButton("please press me");
        buttonThree.setPreferredSize(new Dimension(100, 50));
        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("yayyyy");
            }
        });
     
        //Add the grid layout
        content.setLayout(new GridLayout(5,1));
        content.setLocation(200, 200);
        content.add(button);
        content.add(buttonTwo);
        content.add(buttonThree);
        content.add(label);
        frame.add(content);

        //Add the menu bar at the top of my applet
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Who's");
        menuBar.add(fileMenu);
        JMenuItem menuItem = new JMenuItem("The Best");
        fileMenu.add(menuItem);
        content.add(menuBar);

        // New Screen 

        JPanel secondScreen = new JPanel();
        JFrame secondFrame = new JFrame("Best Java Programmer");
        JLabel secondLabel = new JLabel("Soul Yoon is the best Java Coder ever");
        secondFrame.setPreferredSize(new Dimension(150, 100));
        secondLabel.setPreferredSize(new Dimension(150, 100));
        secondScreen.add(secondFrame);
        secondScreen.add(secondLabel);

        menuItem.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                secondScreen.setVisible(true);

            }

        });

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
