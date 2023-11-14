package com.snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    // Constructor for the GameFrame class
    GameFrame() {
        // Create a new GamePanel and add it to the frame
        this.add(new GamePanel());

        // Set frame properties
        this.setTitle("Snake"); // Set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation when the frame is closed
        this.setResizable(false); // Disable frame resizing
        this.pack(); // Pack the components to set the frame size
        this.setVisible(true); // Make the frame visible
        this.setLocationRelativeTo(null); // Center the frame on the screen
    }
}