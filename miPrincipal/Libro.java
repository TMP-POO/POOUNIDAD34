public class Libro extends Notas{
    private String editorial;

  
    public Libro(String titulo, String autor) {
        super(titulo, autor);
    }
    public void CapturarEditorial(){
        editorial="MCGRAWALHILL";
    }
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String toString(){
        return super.toString()+"Editorial :"+editorial;
    }
}
