package address;
public class Menu {


    /**
     * prompt for First Name
     * @return the First Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_FirstName(){
        System.out.println("First Name: ");

        //for now return a default first name
        return "Jane";
    }

    public static String prompt_LastName(){
        System.out.println("Last Name: ");
        return "maine";
    }

    public static String prompt_Street(){
        System.out.println("Street: ");
        return "random street";
    }

    public static String prompt_City(){
        System.out.println("City: ");
        return "random city";
    }

    public static String prompt_State(){
        System.out.println("State: ") ;
        return "random state";
    }

    public static int prompt_Zip(){
        System.out.println("Zip: ");
        return 94678;
    }

    public static String prompt_Telephone(){
        System.out.println("Telephone: ");
        return "random number";
    }

    public static String prompt_Email(){
        System.out.println("Email: ");
        return "random email";
    }
}