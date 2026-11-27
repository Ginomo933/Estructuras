import java.util.*;

public class TelefonoII {
    static void main() {
        Map<String, List<String>> contactos = new HashMap<>();
        List telefonos = new ArrayList<>();
        telefonos.add("12345");
        telefonos.add("67890");

        contactos.put("Pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("8899");
        contactos.put("Maria", telefonos);

        List<String> telefonosPepe = new ArrayList<>();
        telefonosPepe = contactos.get("Pepe");

        for (String t: telefonosPepe){
            System.out.println(t);
        }
    }
}
