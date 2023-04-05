package prueba.prueba;


public class Manga {
    private String nombre;
    private String autor;
    private String fechap;
    private String animeEm;
    private String demografia;
    private int ventasTrim;

    public Manga(String nombre, String autor, String fechap, String animeEm, String demografia, int ventasTrim) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechap = fechap;
        this.animeEm = animeEm;
        this.demografia = demografia;
        this.ventasTrim = ventasTrim;
    }
    
    public Manga(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechap() {
        return fechap;
    }

    public void setFechap(String fechap) {
        this.fechap = fechap;
    }

    public String getAnimeEm() {
        return animeEm;
    }

    public void setAnimeEm(String animeEm) {
        this.animeEm = animeEm;
    }

    public String getDemografia() {
        return demografia;
    }

    public void setDemografia(String demografia) {
        this.demografia = demografia;
    }

    public int getVentasTrim() {
        return ventasTrim;
    }

    public void setVentasTrim(int ventasTrim) {
        this.ventasTrim = ventasTrim;
    }
    
    
}
