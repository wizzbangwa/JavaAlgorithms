package javaalgorithms;

import java.util.Scanner;
import javaalgorithms.Algorithms.StringManipulation;

public class App {
    
    private static int _maxInputLength = 255;
    private static final String GUI_STRING = "gui";
    private static final String CLI_STRING = "cli";
    private static Scanner _scanner;

    public static void main(String[] args) {
        String uiType = CLI_STRING;
        _scanner = new Scanner(System.in);

        if (args != null && args.length > 0) {
            uiType = args[0];
        } else {
            uiType = GetUIChoiceFromUser();
        }

        if (uiType == CLI_STRING) {
            ShowCLI();
        } else {
            ShowGUI();
        }
        _scanner.close();
    }

    private static void ShowCLI()
    {
        String userInput = null;

        while (true)
        {
            System.out.println("Please enter a string up to " + _maxInputLength + " characters in length.  Numbers, spaces, and alpha characters are ok.\r\n");
            
            userInput = _scanner.nextLine();

            if (userInput.length() > _maxInputLength) {
                System.out.println("\r\nInput exceeds maximum length of " + _maxInputLength + " characters.");
                userInput = userInput.substring(0, _maxInputLength);
                System.out.println("\r\nTruncated string: " + userInput + "\r\n");
            }

            if (userInput.isEmpty())
            {
                System.out.println("Thank you, bye.");
                break;
            }
            else
            {
                System.out.println("\r\nUser input: \"" + userInput +"\"");
                var inputLength = userInput.length();
                System.out.println("\r\nNumber of characters: " + inputLength);
                System.out.println("\r\nNumber of vowels: " + StringManipulation.CountVowels(userInput));
            }
        }
    }

    private static void ShowGUI()
    {
        System.out.println("GUI has not been setup yet.");
    }

    private static String GetUIChoiceFromUser()
    {
        String uiSelection = "";

        String prompt = "Select a user interface type to continue.\r\n" +
            "HINT: passing either \"cli\" or \"gui\" as a command line argument will bypass this selection.\r\n\r\n" +
            "1. Command Line Interface (CLI)\r\n" +
            "2. Graphical User Interface (GUI)\r\n\r\n" +
            "Select an interface to use.\r\n";

        System.out.println(prompt);

        while (uiSelection == "") {
            System.out.print("");
            String selection = _scanner.nextLine();
            if (!selection.isEmpty()) {
                selection = selection.toLowerCase();
                if (selection.equals("1")) {
                    uiSelection = CLI_STRING;
                    break;
                } else if (selection.equals("2")) {
                    uiSelection = GUI_STRING;
                    break;
                } else {
                    System.out.println("\r\nInvalid selection. Press 1 or 2 to select a UI type.\r\n");
                }
            }
        }

        return uiSelection;
    }

}
