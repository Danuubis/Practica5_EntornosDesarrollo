import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    Personas alumno = new Personas("David","X4069919T",18);

    @Test
    public void testGetNombre(){
        Assertions.assertEquals("David", alumno.getNombre());
    }

    @Test
    public void testGetEdad(){
        Assertions.assertEquals(19, alumno.getEdad());
    }

    @Test
    public void testGetDNI(){
        Assertions.assertEquals("X4069919T", alumno.getDNI());
    }
}
