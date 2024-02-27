public class Persona {
    private String nombre;

    private int edad;

    private Boolean DNI;

    public Persona() {

    }
    public Persona(String valorNombre, int valorEdad, Boolean valorDNI){
        nombre = valorNombre;

        edad = valorEdad;

        DNI = valorDNI;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public double getEdad(){
        return edad;
    }

    public void setDNI(Boolean nuevoDNI){
        DNI = nuevoDNI;
    }

    public Boolean getDNI(){
        return DNI;
    }

}
