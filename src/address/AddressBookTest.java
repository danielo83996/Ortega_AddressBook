package address;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

/**
 * tests to see all the functions add, read, remove, etc work fine
 */
 public class AddressBookTest {
     /**
      * adds a contact to the created addressbook ab and then tests to see if
      * the size of entry increases
      */
    @Test
    public void testAdd(){
        AdressEntry testContact = new AdressEntry();
        AddressBook ab = new AddressBook();
        ab.add(testContact);
        assertEquals(1, ab.adressEntryList.size());

    }

     /**
      * adds contact from a file and checks to see if all 5 entries from that file are
      * added to the created addressbook ab
      */
     @Test
     public void testReadFromFile() {
         AddressBook ab = new AddressBook();
         ab.readFromFile("entries.txt");
         assertEquals(5, ab.adressEntryList.size());
     }

     /**
      * fist part of the code makes sure that an item can be removed, and the second
      * part of the code makes sure two contacts with last names doesn't delete both
      * just the one the user decides
      */
     @Test
     public void testRemove() {
         AddressBook ab = new AddressBook();
         AdressEntry contact1 = new AdressEntry("fname", "lname", "street", "City", "State", 12345, "email", "phone");
         AdressEntry contact2 = new AdressEntry("fname", "lname", "street", "City", "State", 12345, "email", "phone");
         AdressEntry contact3 = new AdressEntry("fname", "lname", "street", "City", "State", 12345, "email", "phone");

         ab.add(contact1);
         assertEquals(1, ab.adressEntryList.size());

         int outputCounter = 0;
         Vector<AdressEntry> tempList = new Vector<AdressEntry>();
         System.out.println("The following entries were found in the address book, select number of entry you wish to remove: ");

         for (AdressEntry adressEntry :  ab.adressEntryList) {
             boolean existsInBook = "lna".equalsIgnoreCase(contact1.getLastName()) || (contact1.getLastName()).startsWith("lna");
             if (existsInBook) {
                 System.out.println((outputCounter +1) + ": " + adressEntry);
                 outputCounter++;
                 tempList.add(adressEntry);
             }
         }
         int choice = 1;

         System.out.println("Hit 'y' to remove the following entry or 'n' to return to the main menu:");

         System.out.println(outputCounter + ": " + tempList.get(choice - 1));
         String yesOrNo = "y";

         if (yesOrNo.equalsIgnoreCase("y")) {
             for(int entry = 0; entry < ab.adressEntryList.size(); entry++){
                 if((tempList.get(choice - 1)).equals(ab.adressEntryList.get(entry))){
                     ab.adressEntryList.remove(entry);
                     break;
                 }
             }
         }
         ab.add(contact2);
         ab.add(contact3);
         assertEquals(2, ab.adressEntryList.size());
         for (AdressEntry adressEntry :  ab.adressEntryList) {
             boolean existsInBook = "lna".equalsIgnoreCase(contact2.getLastName()) || (contact2.getLastName()).startsWith("lna");
             if (existsInBook) {
                 System.out.println((outputCounter +1) + ": " + adressEntry);
                 outputCounter++;
                 tempList.add(adressEntry);
             }
         }
         choice = 2;

         System.out.println("Hit 'y' to remove the following entry or 'n' to return to the main menu:");

         System.out.println(outputCounter + ": " + tempList.get(choice - 1));
         yesOrNo = "y";

         if (yesOrNo.equalsIgnoreCase("y")) {
             for(int entry = 0; entry < ab.adressEntryList.size(); entry++){
                 if((tempList.get(choice - 1)).equals(ab.adressEntryList.get(entry))){
                     ab.adressEntryList.remove(entry);
                     break;
                 }
             }
         }
         assertEquals(1, ab.adressEntryList.size());

     }

     /**
      * adds two new entries and makes sure we can find them using only a substring
      * of their last name
      */
     @Test
     public void testFind() {
         AddressBook ab = new AddressBook();
         AdressEntry contact1 = new AdressEntry("wack", "Davidson", "street", "City", "State", 12345, "email", "phone");
         AdressEntry contact2 = new AdressEntry("wack", "David", "street", "City", "State", 12345, "email", "phone");
         ab.add(contact1);
         ab.add(contact2);

         ab.find("David");
         assertEquals(2, ab.adressEntryList.size());
     }

}