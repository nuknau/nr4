/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javauppgift2024;

/**
 *
 * @author nukhbanauman
 */


// This class handles the main game logic. 
// It lets the player move through rooms and interact with objects like doors and dragons. 
// The game tracks the player's position and handles different commands, such as moving or fighting. 
// It also manages winning and ending the game when needed.

 import java.util.Scanner;

public class Dungeon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the player's name and create a new player object
        System.out.print("Write your name and type ENTER to start: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName); // Create a new player
        
        // Start the game
        playGame(scanner, player); 

        // Close the scanner to avoid memory leak
        scanner.close();
    }

    // Method to start the game and call the game logic
    public static void playGame(Scanner scanner, Player player) {
        System.out.println("Game setup complete. Let's begin your adventure!");
        
        // Call the narrative method to start gameplay
        doNarrative(scanner, player);// Pass the player object to doNarrative
    }

    // Method to control the navigation and interaction in the dungeon
    public static void doNarrative(Scanner scanner, Player player) {
        int currentRoom = 2; // Starting in room 2
        String command;

        System.out.println("Navigate by typing 'n' (north), 's' (south), 'e' (east), or 'w' (west).");
        System.out.println("Type 'exit' to leave the game.");

        while (true) {
            System.out.println("You are currently in room " + currentRoom + ". What direction do you want to go?");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break; // Exit the game
            }

            // Navigation through different rooms based on input
            switch (currentRoom) {
                case 1: // Room 1
                    if (command.equals("e")) currentRoom = 4;
                    else if (command.equals("s")) currentRoom = 2;
                    else System.out.println("Invalid direction. You can only go 'e' or 's'.");
                    break;

                case 2: // Room 2
                    if (command.equals("n")) currentRoom = 1;
                    else if (command.equals("s")) currentRoom = 3;
                    else System.out.println("Invalid direction. You can only go 'n' or 's'.");
                    break;

                case 3: // Room 3
                    if (command.equals("n")) currentRoom = 2;
                    else if (command.equals("e")) currentRoom = 5;
                    else System.out.println("Invalid direction. You can only go 'n' or 'e'.");
                    break;

                case 4: // Room 4
                    if (command.equals("e")) {
                        System.out.println("You exited the dungeon. Restart the game to try again.");
                        return; // Exit the game
                    } else if (command.equals("s")) currentRoom = 5;
                    else if (command.equals("v")) currentRoom = 1;
                    else System.out.println("Invalid direction. You can only go 'e', 's', or 'v'.");
                    break;

                case 5: // Room 5
                    if (command.equals("n")) currentRoom = 4;
                    else if (command.equals("e")) currentRoom = 6;
                    else if (command.equals("v")) currentRoom = 3;
                    else System.out.println("Invalid direction. You can only go 'n', 'e', or 'v'.");

                    // Create a door in room 5 to the east, initially locked
                    Door door = new Door('e', true); 
                    System.out.println("You see a locked door to the east.");

                    // Ask if the player has a key to unlock it
                    System.out.print("Do you have a key? (yes/no): ");
                    String hasKeyInput = scanner.nextLine().toLowerCase();
                    boolean hasKey = hasKeyInput.equals("yes");// Convert input to boolean

                    // Attempt to unlock the door
                    door.unlock(hasKey);
                    break;

                case 6: // Room 6
                    System.out.println("You see a dragon guarding a treasure chest. Fight or escape!");
                    System.out.println("Type 'fight' to battle the dragon or 'w' to retreat to room 5.");
                    command = scanner.nextLine().toLowerCase();

                    if (command.equals("fight")) {
                        System.out.println("You defeated the dragon and claimed the treasure. Congratulations, you win!");// player wins
                        
System.out.println(
                            "                  _.--.\n"+ 
                            "              _.-'_:-'||\n"+ 
                            "          _.-'_.-::::'||\n"+ 
                            "     _.-:'_.-::::::'  ||\n"+ 
                            "   .'`-.-:::::::'     ||\n"+ 
                            "  /.'`;|:::::::'      ||_\n"+ 
                            " ||   ||::::::'      _.;._'-._\n"+ 
                            " ||   ||:::::'   _.-!oo @.!-._'-.\n"+ 
                            " \'.  ||:::::.-!() oo @!()@.-'_.||\n"+ 
                            "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"+ 
                            "     `>'-.!@%()@'@_%-'_.-o _.|'||\n"+ 
                            "      ||-._'-.@.-'_.-' _.-o  |'||\n"+ 
                            "      ||=[ '-._.-\\U/.-'    o |'||\n"+ 
                            "      || '-.]=|| |'|      o  |'||\n"+ 
                            "      ||      || |'|        _| ';\n"+ 
                            "      ||      || |'|    _.-'_.-'\n"+ 
                            "      |'-._   || |'|_.-'_.-'\n"+ 
                            "      '-._'-.|| |' `_.-'\n"+ 
                            "           '-.||_/.-'\n");

                        return; // End the game
                        
                    } else if (command.equals("v")) {
                        currentRoom = 5; // Move back to room 5
                    } else {
                        System.out.println("Invalid action. You can only 'fight' or go 'w' (west).");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid room. Restarting the game.");
                    currentRoom = 2; // Reset to room 2
                    break;
            }
        }
    }
}

