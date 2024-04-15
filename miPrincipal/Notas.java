abstract public class Notas {
    private String titulo, autor;

    public Notas(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    abstract public void CapturarEditorial();
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
 
}
