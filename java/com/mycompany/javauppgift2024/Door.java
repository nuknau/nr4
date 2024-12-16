/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javauppgift2024;

/**
 *
 * @author nukhbanauman
 */

// This class represents a door in the game. It has a position and a lock status.

public class Door {
    // Position of the door (n, s, e, w for north, south, east, west)
    private char position;  
    
    // Lock status of the door: true if locked, false if unlocked
    private boolean locked; 

    // Constructor to set the door's position and lock status
    public Door(char position, boolean locked) {
        this.position = position;
        this.locked = locked;
    }

    // Get the door's position
    public char getPosition() {
        return position;
    }

    // Set the door's position
    public void setPosition(char position) {
        this.position = position;
    }

    // Get the door's lock status
    public boolean isLocked() {
        return locked;
    }

    // Set the door's lock status
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    // Unlock the door if the player has a key
    public void unlock(boolean hasKey) {
        if (locked && hasKey) {
            System.out.println("You unlocked the door with your key.");
            locked = false; // Unlock the door
        } else if (locked) {
            System.out.println("The door is locked. You need a key to unlock it.");
        } else {
            System.out.println("The door is already unlocked.");
        }
    }
}

