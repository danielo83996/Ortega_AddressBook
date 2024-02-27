package address;
/*the first three imports are used for reading a file and making sure that opening it
* is safe, furhtermore vecotr and comparator imports are used to arrange and list the
* items in my vector. and of coruse scanners are meant to get user input when decideing to
* delete an element in the vector or not*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 * creates list to store, find, add, readfiles, and remove entries
 */
public class AddressBook {
    /**
     * creates list to store the entries
     */
    Vector<AdressEntry> adressEntryList = new Vector<AdressEntry>();
    /**
     *function to print list
     * allows us to go through our contact list and sort them by last name
     */
    public void list(){
        adressEntryList.sort(new Comparator<AdressEntry>() {
            @Override
            public int compare(AdressEntry o1, AdressEntry o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        /*prints the last name */
        for(int entry = 0; entry < adressEntryList.size(); entry++){
            System.out.println((entry+1) + ": " +adressEntryList.get(entry));
        }
    }
    /**
     *adds contact to list
     * @param newEntry adds the entry provided to the vector holding the contacts of the addressbook
     */
    public void add(AdressEntry newEntry){
        adressEntryList.add(newEntry);
    }

    /**
     *takes in the parameter containg the name of the file then creates a new AddressEntry
     *, and then goes through each line of the file and adds them to their
     *apporoprate variable. Once it has assinged allvars then it is then added to the book, if
     *the file does not exist in the directory then it tells the user so
     * @param entriesFile contains the name of the file which can hold any size of contact info
     */
    public void readFromFile(String entriesFile){
        String read;
        try(BufferedReader file = new BufferedReader(new FileReader(entriesFile))){
            while((read =file.readLine()) != null){
                AdressEntry newEntry = new AdressEntry();
                newEntry.setFirstName(read);
                newEntry.setLastName(file.readLine());
                newEntry.setStreet(file.readLine());
                newEntry.setCity(file.readLine());
                newEntry.setState(file.readLine());
                newEntry.setZip(Integer.parseInt(file.readLine()));
                newEntry.setEmail(file.readLine());
                newEntry.setPhone(file.readLine());
                adressEntryList.add(newEntry);
            }
        } catch (IOException e) {
            System.out.println("Error opening file");
        }
    }
    /**
     *traverses through the book and shows the user which address match the lastname given, once the
     * names are found it stores those entries on a tempearray list, andasks the user to choose one
     * of the entries to delete. After an entry is chosen it then creates a asks the user to confirm
     * their choice and traversers through the actual list to remove it from our addressbook
     * @param removeLastName is the string containing the name in which the user may want to remove
     */
    public void remove(String removeLastName){
        int outputCounter = 0;
        Vector<AdressEntry> tempList = new Vector<AdressEntry>();
        System.out.println("The following entries were found in the address book, select number of entry you wish to remove: ");

        for (AdressEntry adressEntry : adressEntryList) {
            String lastName = adressEntry.getLastName();
            boolean existsInBook = removeLastName.equalsIgnoreCase(lastName) || lastName.startsWith(removeLastName);
            if (existsInBook) {
                System.out.println((outputCounter +1) + ": " + adressEntry);
                outputCounter++;
                tempList.add(adressEntry);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println("Hit 'y' to remove the following entry or 'n' to return to the main menu:");
        scanner.nextLine();

        System.out.println(outputCounter + ": " + tempList.get(choice - 1));
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            for(int entry = 0; entry < adressEntryList.size(); entry++){
                if((tempList.get(choice - 1)).equals(adressEntryList.get(entry))){
                    adressEntryList.remove(entry);
                    break;
                }
            }
        }
    }
    /**
     *goes through our addressbook and only shows the entries in which match what the user inputed
     * @param findLastName user input of what last name they want to find
     */
    public void find(String findLastName){
        int counter = 1;
        System.out.println("The following entries were found in the address book for a last name with \""+findLastName+"\"");
        for (AdressEntry adressEntry : adressEntryList) {
            String lastName = adressEntry.getLastName();

            if (findLastName.equalsIgnoreCase(lastName) || lastName.startsWith(findLastName)) {
                System.out.println((counter) + ": " + adressEntry);
                counter++;
            }

        }

    }
}


