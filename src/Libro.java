public class Libro {

    //Atributos
    String titulo;
    String autor;
    String genero;
    short anioPublicacion;

    //Métodos
    //Constructor completo
    Libro(String titulo, String autor, String genero, short anioPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    //Constructor parcial
    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        genero = null;
        anioPublicacion = 1800;
    }
}
