import models.Persona;
import org.junit.Assert;
import org.junit.Test;

public class main_test_junit {

    @Test
    public void testConstructor(){
        Persona persona = new Persona("Anakin", "Skywalker");
        Assert.assertEquals("Anakin Skywalker", persona.fullName());
    }

    @Test
    public void testChangeName(){
        Persona persona = new Persona("Anakin", "Skywalker");
        persona.setName("Darth");
        Assert.assertEquals("Darth Skywalker", persona.fullName());
    }
}
