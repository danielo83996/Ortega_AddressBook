package address;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * although this may seem similiar to testing the getters and setters in teh adressentry
 * the main difference is we transfer the values to a string var
 */
public class MenuTest {
    /**
     * creates a contact to use to see if our prompts do update the default vals
     */
    private AdressEntry contact1 = new AdressEntry();
    /**
     * saves the response
     */
    private String choiceStr;
    @Test
    public void testDisplayMenu(){
    assertEquals("*************************\n"+
            "Please enter your menu selection\n" +
            "a) Loading From File\n" +
            "b) Addition\n" +
            "c) Removal\n" +
            "d) Find\n" +
            "e) Listing\n" +
            "f) Quit\n" +
            "*************************", Menu.displayMenu());
    }
    @Test
    public void testPrompt_FirstName(){
        contact1.setFirstName("Daniel");
        choiceStr = contact1.getFirstName();
        assertEquals("Daniel",choiceStr);
    }
    @Test
    public void testPrompt_LastName(){
        contact1.setLastName("Ortega");
        choiceStr = contact1.getLastName();
        assertEquals("Ortega",choiceStr);

    }
    @Test
    public void testPrompt_Street(){
        contact1.setStreet("140th ave");
        choiceStr = contact1.getStreet();
        assertEquals("140th ave",choiceStr);

    }
    @Test
    public void testPrompt_City(){
        contact1.setCity("San Leandro");
        choiceStr = contact1.getCity();
        assertEquals("San Leandro",choiceStr);

    }
    @Test
    public void testPrompt_State(){
        contact1.setState("CA");
        choiceStr = contact1.getState();
        assertEquals("CA", choiceStr);

    }
    @Test
    public void testPrompt_Zip(){
        choiceStr = "84578";
        assertEquals(84578, Integer.parseInt(choiceStr));

    }
    @Test
    public void testPrompt_Email(){
        contact1.setEmail("DanielO83996@gmail.com");
        choiceStr = contact1.getEmail();
        assertEquals("DanielO83996@gmail.com",choiceStr);

    }
    @Test
    public void testPrompt_Phone(){
        contact1.setPhone("510-332-0103");
        choiceStr = contact1.getPhone();
        assertEquals("510-332-0103", choiceStr);

    }
}