
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
    private String numeroDeReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroDePaginas = numeroPaginas;
        numeroDeReferencia = "";
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
        if (numeroDeReferencia.length() > 0) {
            System.out.println("Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas + ".  Número de referencia: " + numeroDeReferencia);
        }
        else{
            numeroDeReferencia = "ZZZ";
            System.out.println("Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas + ".  Número de referencia: " + numeroDeReferencia);
            
        }
    } 
    
    public String getDetalles() {
        String detalles = "";
        if (numeroDeReferencia.length() > 0) {
            detalles = "Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas + ".  Número de referencia: " + numeroDeReferencia;
        }
        else{
            numeroDeReferencia = "ZZZ";
            detalles = "Título: " + titulo + ".  Autor: " + autor + ".  Numero de páginas: " + numeroDePaginas + ".  Número de referencia: " + numeroDeReferencia;

        }
        
        return detalles;
        
    }
    
    public void setNumeroRef(String numeroReferencia) {
        if(numeroReferencia.length() < 3){
            System.out.println("Introducir un valor superior a 3 caracteres");
        }
        else{
            this.numeroDeReferencia = numeroReferencia;
        }
        
    }
   
    public String getNumeroReferencia() {
        return numeroDeReferencia;
    }
}
