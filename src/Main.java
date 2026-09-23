import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        //Modelo de un libro
        //String titulo = "Le Rouge et le Noir";
        //String autor = "Stendhal";
        //String genero = "novela";
        //short anioPublicacion = 1830; //Número entero 2 bytes en memoria [-32768, 32767]

        //System.out.println("El libro se titula: " + titulo + ", y es un(a) " + genero + " publicado(a) por " + autor + " en " + anioPublicacion + ".");

        // 1. Construcción del objeto
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "novela", (short)1967);

        //2. Asignación de los atributos del objeto
        //libro1.titulo = "Cien años de soledad";
        //libro1.autor = "Gabriel García Márquez";
        //libro1.genero = "novela";
        //libro1.anioPublicacion = 1967;

        System.out.println("El libro se titula: " + libro1.titulo + ", y es un(a) " + libro1.genero + " publicado(a) por " + libro1.autor + " en " + libro1.anioPublicacion + ".");

        System.out.println(libro1);
    }
}