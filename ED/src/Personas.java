public class Personas {


    private String nombre;

    private String DNI;

    private int edad;


    public Personas(String nombre, String DNI, int edad){

        this.nombre = nombre;

        this.DNI = DNI;

        this.edad = edad;


    }

    public Personas(){
        this.nombre = null;

        this.DNI = null;

        this.edad = 0;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
