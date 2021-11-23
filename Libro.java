
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, boolean deTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroDePaginas = numeroPaginas;
        numeroDeReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = deTexto;
    }
    
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void imprimeTitulo () {
        System.out.println("El t�tulo es: " + titulo);
    }
    
    public void imprimeAutor () {
        System.out.println("El autor es: " + autor);
    }
    
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    
   
    
    public void imprimeDetalles () {
        String esDeTexto= "";
        
        if (numeroDeReferencia.length() > 0) {

            if(esLibroDeTexto == true){
               esDeTexto = "Verdadero";
            }
            else {
                esDeTexto = "Falso";
            }
        System.out.println("T�tulo: " + titulo + ".  Autor: " + autor + ".  Numero de p�ginas: " + numeroDePaginas + ".  N�mero de referencia: " + numeroDeReferencia + ".  Veces prestado: " + vecesPrestado + ".  Libro de texto: " + esDeTexto);

        }
            
        else{
            if(esLibroDeTexto == true){
               esDeTexto = "Verdadero";
            }
            else {
                esDeTexto = "Falso";
            }
        System.out.println("T�tulo: " + titulo + ".  Autor: " + autor + ".  Numero de p�ginas: " + numeroDePaginas + ".  N�mero de referencia: ZZZ" + ".  Veces prestado: " + vecesPrestado + ".  Libro de texto: " + esDeTexto);

        }
    } 
    
    public String getDetalles() {
        String detalles = "";
        String esDeTexto = ""; 
        
        if (numeroDeReferencia.length() > 0) {
            if(esLibroDeTexto == true){
               esDeTexto = "Verdadero";
            }
            else {
                esDeTexto = "Falso";
            }
        detalles = "T�tulo: " + titulo + ".  Autor: " + autor + ".  Numero de p�ginas: " + numeroDePaginas + ".  N�mero de referencia: " + numeroDeReferencia + ".  Veces prestado: " + vecesPrestado + ".  Libro de texto: " + esDeTexto;

        }
        else{
            
             if(esLibroDeTexto == true){
               esDeTexto = "Verdadero";
            }
            else {
                esDeTexto = "Falso";
            }
        detalles = "T�tulo: " + titulo + ".  Autor: " + autor + ".  Numero de p�ginas: " + numeroDePaginas + ".  N�mero de referencia: ZZZ" + ".  Veces prestado: " + vecesPrestado + ".  Libro de texto: " + esDeTexto;

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
    
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;

    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    
    public boolean getEsDeTexto(){
        return esLibroDeTexto;
    }
}