import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    static void main() {
        Map<String, String> paises = new HashMap<>();
        paises.put("España","Madrid");
        paises.put("Francia","Paris");
        paises.put("Italia","Roma");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese pais: ");
        String pais = sc.nextLine();
        System.out.println(paises.getOrDefault(pais,"No existe el país" + pais ));

    }
}
