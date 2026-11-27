import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Patron2 {
    public static void main(String[] args) {
        Map<String, List<String>> alumnosPorGrupo = new HashMap<>();

        alumnosPorGrupo.computeIfAbsent("1DAW-A", k -> new ArrayList<>()).add("Ana");
        alumnosPorGrupo.computeIfAbsent("1DAW-A", k -> new ArrayList<>()).add("Luis");
        alumnosPorGrupo.computeIfAbsent("1DAW-A", k -> new ArrayList<>()).add("Marta");

        Scanner sc = new Scanner(System.in);
        String grupo;
        String nombre;

        do {
            System.out.println("Introduce el grupo del alumno");
            grupo = sc.nextLine();
            System.out.println("Introduce el nombre del alumno");
            nombre = sc.nextLine();
            if (!grupo.isEmpty()){
                if (!alumnosPorGrupo.containsKey(grupo)){
                    alumnosPorGrupo.put(grupo, new ArrayList<>());
                }
                alumnosPorGrupo.get(grupo).add(nombre);
            }

        }while (!grupo.isEmpty());
        System.out.println(alumnosPorGrupo);
    }
}
