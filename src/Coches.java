import java.util.*;

public class Coches {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<String> coches = new ArrayList<>();
        boolean s = true;

        System.out.println("Añade coche: ");
        while (s) {
            coches.add(sc.nextLine());
            if (sc.nextLine().equals("")) {
                Collections.sort(coches);
                s = false;
            }
        }
        for(String coche: coches){
            System.out.println(coche);
        }






    }
}
