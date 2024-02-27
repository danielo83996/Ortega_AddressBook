package address;

public class AdressEntry {
    //variables used to determine the contact of an entry
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;
    /*zombie entry*/
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
    /*takes in info from user to construct a new contact*/
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
    /*formats our contacts so it is more readible*/
    public String toString(){
        return firstName +" "+ lastName + "\n" + street +", " + state +" "+ zip +"\n"+email+ "\n"+ phone+"\n";
    }

    //sets the value for first name
    public void setFirstName(String firstName){
         this.firstName = firstName;
    }
    //sets the value of the last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //gets value for last name
    public String getLastName(){
        return lastName;
    }
    //sets value for street
    public void setStreet(String street){
        this.street = street;
    }
    //set the value for city
    public void setCity(String city){
        this.city = city;
    }
    //set the value of the state
    public void setState(String state){
        this.state = state;
    }
    //set value of zip
    public void setZip(int zip){
        this.zip = zip;
    }
    //set the value of phone
    public void setPhone(String phone){
        this.phone = phone;
    }
    //set the value of email
    public void setEmail(String email){
        this.email = email;
    }
    //get the value of email


}
