import models.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class main_test_testng {
    @Test(groups = {"Imperio"})
    public void testConstructor(){
        Persona persona = new Persona("Anakin", "Skywalker");
        Assert.assertEquals(persona.fullName(), "Anakin Skywalker");
    }

    @Test(groups = "Republica")
    public void testChangeName(){
        Persona persona = new Persona("Anakin", "Skywalker");
        persona.setName("Darth");
        Assert.assertEquals(persona.fullName(), "Darth Skywalker");
        //Assert.assertTrue(persona.getFullName().equals("Darth Skywalker"));
    }
}
