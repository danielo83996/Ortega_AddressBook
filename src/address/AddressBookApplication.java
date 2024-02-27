package address;
import java.util.Scanner;

/**
 * creats are addressbook and then calls other methods to read user input
 */

class AddressBookApplication {
    /**
     *creates instance of addresbook
     * @param args creates main function
     */
    public static void main(String args[]) {
    AddressBook ab = new AddressBook();
    initAddressBookExercise(ab);

    }

    /**
     *initializes choice that the user will make
     * determines what choice the user will make
     * a- will get the input and send it to readfromfile to add the contacts in the book
     * b- input will prompt user for all info then call to add to book
     * c- asks user for last name then calls remove to remove the name
     * d- like c gets last name then calls find to look through the list to see name(s) that match
     * e- prints the addressbook
     * @param ab is the adressbook we will use to store entries
     */
    public static void initAddressBookExercise(AddressBook ab){
        String choice = "";
        while(!choice.equalsIgnoreCase("F")){
            System.out.println(Menu.displayMenu());
            Scanner input = new Scanner(System.in);
            choice = input.nextLine();
            if(choice.equalsIgnoreCase("A")){
                System.out.println("\nEnter in FileName:");
                input = new Scanner(System.in);
                String fileName = input.nextLine();
                ab.readFromFile(fileName);
            }
            if(choice.equalsIgnoreCase("B")){

                String firstName = Menu.prompt_FirstName();
                String lastName = Menu.prompt_LastName();
                String street = Menu.prompt_Street();
                String city = Menu.prompt_City();
                String state = Menu.prompt_State();
                int zip = Menu.prompt_Zip();
                String email = Menu.prompt_Email();
                String phone = Menu.prompt_Telephone();

                AdressEntry contact = new AdressEntry(firstName,lastName,street,city,state,zip,email,phone);
                ab.add(contact);
            }
            if(choice.equalsIgnoreCase("C")){
                System.out.println("Enter in Last Name of contact to remove");
                input = new Scanner(System.in);
                String lastName = input.nextLine();
                ab.remove(lastName);

            }
            if(choice.equalsIgnoreCase("D")){
                System.out.println("Enter in all or beginning of last name you wish to find:");
                input = new Scanner(System.in);
                String lastName = input.nextLine();
                ab.find(lastName);


            }
            if(choice.equalsIgnoreCase("E")){
                ab.list();
            }
        }
        System.out.println("Quitting.");


    }

}

