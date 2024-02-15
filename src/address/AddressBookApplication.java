package address;
class AddressBookApplication {

    public static void main(String args[]) {
    //cerate instacne of addressbook
    AddressBook ab = new AddressBook();
    initAddressBookExercise(ab);

    }

    //adds address to the addressbook
    public static void initAddressBookExercise(AddressBook ab){
        AdressEntry contact1 = new AdressEntry();
        AdressEntry contact2 = new AdressEntry("jack", "black","21 jump","Gotham","New York", 9457, "911", "nah@gmail.com");

        contact1.setFirstName("daniel");

        ab.add(contact1);
        ab.add(contact2);
        //outputs the contacts
        ab.list();

    }

}

