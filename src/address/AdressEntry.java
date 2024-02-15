package address;

public class AdressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

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

    public  AdressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return firstName +" "+ lastName + "\n" + street +", " + state +" "+ zip +"\n"+email+ "\n"+ phone+"\n";
    }

    //sets the value for first name
    public void setFirstName(String firstName){
         this.firstName = firstName;
    }
    //gets the value of the first name
    public String getFirstName(){
        return firstName;
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
    //gets value of street
    public String getStreet(){
        return street;
    }
    //set the value for city
    public void setCity(String city){
        this.city = city;
    }
    //get value of the city
    public String getCity(){
        return city;
    }
    //set the value of the state
    public void setState(String state){
        this.state = state;
    }
    //get the value of state
    public String getState(){
        return state;
    }
    //set value of zip
    public void setZip(int zip){
        this.zip = zip;
    }
    //get the value of zip
    public int getZip(){
        return zip;
    }
    //set the value of phone
    public void setPhone(String phone){
        this.phone = phone;
    }
    //get the value of phone
    public String getPhone(){
        return phone;
    }
    //set the value of email
    public void setEmail(String email){
        this.email = email;
    }
    //get the value of email
    public String getEmail(){
        return email;
    }


}
