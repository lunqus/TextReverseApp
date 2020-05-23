package com.sigis.textreverse;

import javax.swing.*;
import java.awt.*;

public class TextReverse {

    public TextReverse() {

    }


    public static void main(String[] args) {

        // Create the frame on the event dipatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });
    }
}
