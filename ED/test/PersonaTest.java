import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PersonaTest {
    Persona alumno = new Persona("David", 18,true);

    @Test
    public void testGetEdad(){
        Assertions.assertEquals(18, alumno.getEdad());

    }

    @Test
    public void testGetNombre(){
        Assertions.assertEquals("Manu", alumno.getNombre());

    }
}