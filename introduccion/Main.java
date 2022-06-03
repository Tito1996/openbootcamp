import Ejercicio_T8.*;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Vicente", 25, 686868688);

        persona.setNombre("Tito");
        persona.setEdad(26);
        persona.setTelefono(345345345);

        System.out.println("Hola, me llamo " + persona.getNombre() + ", tengo " + persona.getEdad() + " años, y me telefono es " + persona.getTelefono());
    }
}
