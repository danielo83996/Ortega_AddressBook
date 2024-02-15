package address;
import java.util.Vector;
public class AddressBook {
    //creates list to store entries
    Vector<AdressEntry> adressEntryList = new Vector<AdressEntry>();

    //function to print list
    public void list(){
        for(int entry = 0; entry < adressEntryList.size(); entry++){
            System.out.println((entry+1) + ": " +adressEntryList.get(entry));
        }
    }

    //adds contact to list
    public void add(AdressEntry newEntry){
        adressEntryList.add(newEntry);
    }
}


