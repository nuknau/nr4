/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javauppgift2024;

/**
 *
 * @author nukhbanauman
 */

// This class represents the main logic for starting and ending the DragonTreasure game. 
// It handles user input to either start the game with dungeon setup or exit the game.

import java.util.Scanner;

public class DragonTreasure {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // The user can choose to start or end the game
        System.out.println("Type 'setupGame' to start the game and 'endGame' to exit it");
        String command = scanner.nextLine();  // Read the user's command

        // If the user types 'setupGame', start the game setup
        if (command.equalsIgnoreCase("setupGame")) {
            setupGame(scanner); // Pass the scanner to setupGame to initialize the game
        } 
        // If the user types 'endGame', end the game
        else if (command.equalsIgnoreCase("endGame")) {
            endGame(); // This ends the game and exits the program
        } 
        // If the input is invalid, show an error message
        else {
            System.out.println("Invalid command: " + command); // Invalid input handling
        }

        // Close scanner to prevent memory leak
        scanner.close();
    }

    // This method initializes the game and prints out the dungeon rooms (layout) from the perspective of the game character 
    public static void setupGame(Scanner scanner) { 
        // Display the message indicating game setup is complete
        System.out.println("Game setup complete. This is the dungeon layout:");

        // Define the layout of the dungeon rooms
        String[][] rooms = {
            {"deadbodyroom 1", "lightroom 2", "keyroom 3"},
            {"monsterrum 4", "poisonroom 5"},
            {"treasureroom 6"}
        };

        // Print each room in the dungeon layout
        for (String[] row : rooms) {
            for (String room : row) {
                System.out.print(room + " "); // Print each room name followed by a space
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Ask the player for to enter their name
        System.out.print("Write your name and press ENTER to start ");
        String playerName = scanner.nextLine();  // Read the player's name
        System.out.println("Welcome, " + playerName + ", to this treasure hunt!"); // Welcome message
        
        // Start the dungeon game and pass the scanner and player name
        Dungeon.playGame(scanner, new Player(playerName));  // Pass scanner to playGame method
    }

    // This method ends the game and displays a goodbye message
    public static void endGame() {
        System.out.println("You have exited the game. Goodbye!"); // Goodbye message
        System.exit(0); // End the game
    }
}


