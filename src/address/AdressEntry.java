package address;

/**
 * this class creates the variables needed to build the contact info of the new entries and gets/sets the
 * values of them
 *
 */
public class AdressEntry {
    /**
     * first name of contact
     */
    private String firstName;
    /**
     * last name of contact
     */
    private String lastName;
    /**
     * street of contact
     */
    private String street;
    /**
     * city of contact
     */
    private String city;
    /**
     * state of contact
     */
    private String state;
    /**
     * zip code of contact
     */
    private int zip;
    /**
     * phone number of contact
     */
    private String phone;
    /**
     * email of contact
     */
    private String email;
    /*zombie entry*/

    /**
     *sets default values if a new contact is created yet user doesn't provide info
     *
     */
    public  AdressEntry(){
        firstName = "unknown";
        lastName = "unknown";
        street = "unknown";
        city = "unknown";
        state = "unknown";
        zip = 0;
        phone = "unknown";
        email = "unknown";
    }

    /**
     *takes in info from user to construct a new contact
     * @param firstName sets this firstname to that firstname
     * @param lastName sets this lastname to that lastname
     * @param street sets this street to that street
     * @param city sets this city to that city
     * @param state sets this state to that state
     * @param zip sets this zip to that zip
     * @param email sets this email to that email
     * @param phone sets this phone number to that phhone number
     */
    public  AdressEntry(String firstName, String lastName, String street, String city, String state, int zip, String email, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     *formats our contacts so it is more readible
     * @return a formated string of the contacts info
     */
    public String toString(){
        return firstName +" "+ lastName + "\n" + street +"\n"+city+", " + state +" "+ zip +"\n"+email+ "\n"+ phone+"\n";
    }

    //sets the value for first name

    /**
     *accesses the private variable and changes it to the assigned var, so now firstName given will replace the incumbent
     * value previously established
     * @param firstName the contacts first name
     */
    public void setFirstName(String firstName){
         this.firstName = firstName;
    }

    /**
     * accesses the name var to either compare it to other values
     * @return the value of first name
     */
    public String getFirstName(){
        return firstName;
    }
    //sets the value of the last name

    /**
     *accesses the private variable and changes it to the assigned var, so now lastName given will replace the incumbent
     * value previously established
     * @param lastName the contacts last name
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //gets value for last name

    /**
     * accesses the lastName variable which is used to compare w/other lastNames
     * @return the lastname of the contact
     */
    public String getLastName(){
        return lastName;
    }
    //sets value for street

    /**
     *accesses the private variable and changes it to the assigned var, so no email given will replace the incumbent
     * value previously established
     * @param street the street the contact lives in
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     * accesses the street var to either compare it to other values
     * @return the value of street
     */
    public String getStreet(){
        return street;
    }

    /**
     *accesses the private variable and changes it to the assigned var, so now city given will replace the incumbent
     * value previously established
     * @param city the city the contact lives in
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * accesses the city var to either compare it to other values
     * @return the value of city
     */
    public String getCity(){
        return city;
    }

    /**
     *accesses the private variable and changes it to the assigned var, so now State given will replace the incumbent
     *value previously established
     * @param state the state the contact lives in
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * accesses the state var to either compare it to other values
     * @return the value of state
     */
    public String getState(){
        return state;
    }

    /**
     *accesses the private variable and changes it to the assigned var, so now zip given will replace the incumbent
     *value previously established
     * @param zip the contacts zip code
     */
    public void setZip(int zip){
        this.zip = zip;
    }

    /**
     * accesses the zip var to either compare it to other values
     * @return the value of zip
     */
    public int getZip(){
        return zip;
    }
    //set the value of phone

    /**
     *accesses the private variable and changes it to the assigned var, so now phone given will replace the incumbent
     * value previously established
     * @param phone the contacts number
     */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * accesses the phone var to either compare it to other values
     * @return the value of phone
     */
    public String getPhone(){
        return phone;
    }
    //set the value of email

    /**
     * accesses the private variable and changes it to the assigned var, so now email given will replace the incumbent
     * value previously established
     * @param email the contacts email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**get the value of email
     *
     * @return the value of email
     */
    public String getEmail(){
        return email;
    }


}
