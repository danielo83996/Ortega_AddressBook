package address;
import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    private static String choiceStr = "";

    /*displays menu options*/
    public static String displayMenu(){
        return  "*************************\n"+
                "Please enter your menu selection\n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*************************";
    }
    /*asks user for first name and takes in user input*/
    public static String prompt_FirstName(){
        System.out.println("First Name: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for last name and takes in user input*/

    public static String prompt_LastName(){
        System.out.println("Last Name: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for street and takes in user input*/

    public static String prompt_Street(){
        System.out.println("Street: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for city and takes in user input*/

    public static String prompt_City(){
        System.out.println("City: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for state and takes in user input*/

    public static String prompt_State(){
        System.out.println("State: ") ;
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for zip code and takes in user input*/

    public static int prompt_Zip(){
        System.out.println("Zip: ") ;
        choiceStr = input.nextLine();
        return Integer.parseInt(choiceStr);
    }
    /*asks user for phone number and takes in user input*/

    public static String prompt_Telephone(){
        System.out.println("Telephone: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
    /*asks user for email and takes in user input*/

    public static String prompt_Email(){
        System.out.println("Email: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
}