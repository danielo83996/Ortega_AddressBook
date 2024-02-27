package address;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * creates entries to see if the getters and setters would show the right values
 */
public class AdressEntryTest {
    /**
     * contact 1 is default values for all the vars of an entry
     */
    private AdressEntry contact1 = new AdressEntry();
    /**
     * contact 2 is an entry provided with inforamtnion
     */
    private AdressEntry contact2 = new AdressEntry("wack", "Davidson", "street", "City", "State", 12345, "email", "phone");

    /**
     * checks to see that the tostring formats the values of the entry correctly
     */
    @Test
    public void testToString(){
        String test ="unknown unknown\nunknown\nunknown, unknown "+0+ "\nunknown\nunknown\n";
        assertEquals(test, contact1);
        test = "wack Davidson\nstreet\ncity, state 12345\nemail\nphone";
        assertEquals(test, contact2);
    }

    /**
     * sets first name for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetFirstName(){
        contact1.setFirstName("Daniel");
        assertEquals("Daniel",contact1.getFirstName());
        assertEquals("wack", contact2.getFirstName());
    }
    /**
     * sets last name for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetLastName(){
        contact1.setLastName("Ortega");
        assertEquals("Ortega",contact1.getLastName());
        assertEquals("Davidson", contact2.getLastName());

    }
    /**
     * sets street for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetStreet(){
        contact1.setStreet("140th ave");
        assertEquals("140th ave",contact1.getStreet());
        assertEquals("street", contact2.getStreet());

    }
    /**
     * sets city for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetCity(){
        contact1.setCity("San Leandro");
        assertEquals("San Leandro",contact1.getCity());
        assertEquals("City", contact2.getCity());

    }
    /**
     * sets state for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetState(){
        contact1.setState("CA");
        assertEquals("CA", contact1.getState());
        assertEquals("State", contact2.getState());

    }
    /**
     * sets zip for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetZip(){
        contact1.setZip(84578);
        assertEquals(84578, contact1.getZip());
        assertEquals(12345, contact2.getZip());

    }
    /**
     * sets email for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetEmail(){
        contact1.setEmail("DanielO83996@gmail.com");
        assertEquals("DanielO83996@gmail.com",contact1.getEmail());
        assertEquals("email", contact2.getEmail());

    }
    /**
     * sets phone for contact (testing setter), then compares it to what the new value should be
     * (testing getter)
     */
    @Test
    public void testSetandGetPhone(){
        contact1.setPhone("510-332-0103");
        assertEquals("510-332-0103", contact1.getPhone());
        assertEquals("phone", contact2.getPhone());

    }
}

