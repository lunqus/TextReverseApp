package com.sigis.textreverse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextReverse implements ActionListener {

    JTextField mTextField;
    JButton reverseButton;
    JLabel promtLabel;
    JLabel contentLabel;

    public TextReverse() {

        JFrame mFrame = new JFrame("Enter Text");

        // Set layout
        mFrame.setLayout(new FlowLayout());

        // Give the Frame a size
        mFrame.setSize(250, 250);

        // Set close operation
        mFrame.setDefaultCloseOperation(mFrame.EXIT_ON_CLOSE);

        // Create Text Field
        mTextField = new JTextField(10);

        // Create Action Command
        mTextField.setActionCommand("textField");

        // Crate Buttons
        reverseButton = new JButton("Reverse");

        // Add Action Listeners
        mTextField.addActionListener(this);
        reverseButton.addActionListener(this);

        // Create prompt Labels
        promtLabel = new JLabel("Enter text: ");
        contentLabel = new JLabel("");

        // Add components to mField
        mFrame.add(promtLabel);
        mFrame.add(mTextField);
        mFrame.add(reverseButton);
        mFrame.add(contentLabel);

        // Set visible
        mFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        // Create the frame on the event dipatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextReverse();
            }
        });
    }

}
