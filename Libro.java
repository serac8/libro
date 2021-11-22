
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroDePaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroDePaginas = numeroPaginas;
    }
    
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void imprimeTitulo () {
        System.out.println("El título es: " + titulo);
    }
    
    public void imprimeAutor () {
        System.out.println("El autor es: " + autor);
    }
    
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    
    public void imprimeDetalles () {
        System.out.println("Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas);
    } 
    
    public String getDetalles() {
        String detalles = "";
        detalles = "Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas;
        return detalles;
        
    }
}
