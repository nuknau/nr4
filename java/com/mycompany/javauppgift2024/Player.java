/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javauppgift2024;

/**
 *
 * @author nukhbanauman
 */

// This class represents a player in the game. 
// It stores the player's name and allows it to be retrieved or updated.
public class Player {
    private String name; // The player's name

    // Create a player with the given name.
    public Player(String name) {
        this.name = name;
    }

    // Get the player's name.
    public String getName() {
        return name;
    }

    // Update the player's name.
    public void setName(String name) {
        this.name = name;
    }
}

