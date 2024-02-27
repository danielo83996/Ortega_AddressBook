package address;
import java.util.Scanner;

/**
 * this class creates the static variables input, and choiceStr input is meant to scan in the inputs of the user whn
 * prompted about the attribute of the contact, and ChoiceStr is meant to be their response
 */
public class Menu {
    /**
     * used to read the input of the user
     */
    private static Scanner input = new Scanner(System.in);
    /**
     * saves the response
     */
    private static String choiceStr = "";


    /**
     *displays menu options
     * @return choicstr
     */
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

    /**
     *asks user for first name and takes in user input
     * @return choicstr
     */
    public static String prompt_FirstName(){
        System.out.println("First Name: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for last name and takes in user input
     * @return choicstr
     */
    public static String prompt_LastName(){
        System.out.println("Last Name: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for street and takes in user input
     * @return choicstr
     */
    public static String prompt_Street(){
        System.out.println("Street: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for city and takes in user input
     * @return choicstr
     */
    public static String prompt_City(){
        System.out.println("City: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for state and takes in user input
     * @return choicstr
     */
    public static String prompt_State(){
        System.out.println("State: ") ;
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for zip code and takes in user input
     * @return choicstr
     */
    public static int prompt_Zip(){
        System.out.println("Zip: ") ;
        choiceStr = input.nextLine();
        return Integer.parseInt(choiceStr);
    }

    /**
     *asks user for phone number and takes in user input
     * @return choicstr
     */
    public static String prompt_Telephone(){
        System.out.println("Telephone: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }

    /**
     *asks user for email and takes in user input
     * @return choicstr
     */
    public static String prompt_Email(){
        System.out.println("Email: ");
        choiceStr = input.nextLine();
        return choiceStr;
    }
}