package day15022026.laClasseConsole;

import java.io.Console;

public class ConsoleSample {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println(console);
        if(console != null) {
            String userInput = console.readLine("Donner votre nom : ");
            console.writer().println("You entered the following: " + userInput);
        }else {
        	System.out.println("Console not available");
        }
    }
}