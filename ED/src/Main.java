// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int edad = 28;
        String nombre = "Alumno";

        Persona david = new Persona("David", 18, true);

        if (david.getEdad() > edad){
            System.out.println(david.getNombre() + " es mayor que " + nombre);
        } else if (david.getEdad() == edad){
            System.out.println(david.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(david.getNombre() + " es menor que " + nombre);
        }
        david.setNombre("Alvaro");
        System.out.println(david.getNombre());
    }
}