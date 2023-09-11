import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Persona persona1 = new Persona("Juan", "Saracco");
        Persona persona2 = new Persona("Carlos", "Auzqui");
        Persona persona3 = new Persona("Benjamin", "Rolllheiser");
        Persona persona4 = new Persona("Mariano", "Andujar");
        Persona persona5 = new Persona("Santiago", "Ascacibar");

        List<Persona> personas = new ArrayList<>();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        System.out.println("Lista desordenada:");

        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        System.out.println();

        Collections.sort(personas);

        System.out.println("Lista ordenada:");


        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        System.out.println();

        System.out.println("lista ordenada por apellido: ");

        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }


        System.out.println();

        System.out.println("Lista ordenada inversamente por apellido:");

        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());

        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

    }
}

