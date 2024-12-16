/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javauppgift2024;

/**
 *
 * @author nukhbanauman
 */

// This class represents a room in the game. 
// It describes each room's unique features and navigation options.
import java.util.Scanner;

public class Room {

    public static void main(String[] args) {
        doNarrative(); // Start the room interaction.
    }

    public static void doNarrative() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a room to enter (e.g., 'room 1'):");

        String command = scanner.nextLine(); // Get the player's room choice.

        // Describe the room based on the player's choice.
        if (command.equalsIgnoreCase("room 1")) {
            System.out.println("You see a dead body on the floor. You can go south (s) or east (e).");
        } else if (command.equalsIgnoreCase("room 2")) {
            System.out.println("The room is lit by candles on a table. You can go north (n) or south (s).");
        } else if (command.equalsIgnoreCase("room 3")) {
            System.out.println("You find a key! You can go north (n) or east (e).");
        } else if (command.equalsIgnoreCase("room 4")) {
            System.out.println("A beam of light seeps through a crack in the eastern wall. You can go east (e), south (s), or west (w).");
        } else if (command.equalsIgnoreCase("room 5")) {
            System.out.println("You enter a damp room. Water seeps along the western wall. A locked door reveals a treasure chest full of gold. You can go north (n), east (e), or west (w).");
        } else if (command.equalsIgnoreCase("room 6")) {
            System.out.println("You see a dragon guarding a treasure chest. You can fight the dragon or try to find a way out!");
        } else {
            System.out.println("Invalid input. Please write 'room' followed by a space and its number.");
        }

        scanner.close();
    }
}
