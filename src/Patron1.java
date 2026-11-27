import java.util.HashMap;
import java.util.Map;

public class Patron1 {
    static void main() {
        String texto = "el perro y el gato y el raton";
        Map<String,Integer> frecuencias = new HashMap<>();
        String[] palabras = texto.split(" ");
        for (String palabra: palabras) {
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra,0)+1);
        }
        System.out.println(frecuencias);
    }
}
