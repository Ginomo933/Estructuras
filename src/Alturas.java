import java.util.ArrayList;
import java.util.Scanner;

public class Alturas {

    // Usamos un único Scanner global para evitar problemas con el flujo de entrada
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();

        int n = numeroAlumnos();
        leerAlturas(alturas, n);
        double media = calcularMedia(alturas);
        mostrarResultados(alturas, media);
    }
    public static int numeroAlumnos() {
        int n;
        do {
            System.out.print("Introduce el número de alumnos: ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void leerAlturas(ArrayList<Double> alturas, int n) {
        System.out.println("Introduce las alturas de los alumnos:");
        for (int i = 0; i < n; i++) {
            alturas.add(sc.nextDouble());
        }
    }
    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (Double d : alturas) {
            suma += d;
        }
        return suma / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas) {
        double media = calcularMedia(alturas);
        int cuantos = 0;
        for (Double d : alturas) {
            if (d > media) {
                cuantos++;
            }
        }
        return cuantos;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas) {
        double media = calcularMedia(alturas);
        int cuantos = 0;
        for (Double d : alturas) {
            if (d < media) {
                cuantos++;
            }
        }
        return cuantos;
    }
    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        System.out.println("Alturas: " + alturas);
        System.out.printf("Altura media: " + media);
        System.out.println("Alumnos mas la media: " + calcularAlumnosAlturaSuperior(alturas));
        System.out.println("Alumnos menos la media: " + calcularAlumnosAlturaInferior(alturas));
    }
}
