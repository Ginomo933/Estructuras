import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefono {
    static void main() {
        Map<String, String> contactos = new HashMap<>();
        contactos.put("Pepe", "9487512");
        contactos.put("Marta", "1293401");

        System.out.println("Introduce un nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println(contactos.getOrDefault(nombre,"No existe el número de: " + nombre ));
    }
}
