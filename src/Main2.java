import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        int edad = 20;
        mensajeCumpleanios(edad); // Paso de parámetro por valor - Se pasa una copia
        System.out.println(edad);

        ArrayList<String> ejemplo = new ArrayList<>();
        ejemplo.add("Casa");
        ejemplo.add("Barco");
        ejemplo.add("Acero");
        ordenar(ejemplo); // Paso de parámetro por referencia - Se pasa la dirección de memoria
        System.out.println(ejemplo);
    }

    static void mensajeCumpleanios(int edadAnterior) {
        edadAnterior = edadAnterior + 1;
        System.out.println("¡Felicidades, cumpliste " + edadAnterior + " años!");
    }

    static void ordenar(ArrayList<String> original) {
        original.sort(null);
        System.out.println("La lista ordenada es: " + original);
    }
}
