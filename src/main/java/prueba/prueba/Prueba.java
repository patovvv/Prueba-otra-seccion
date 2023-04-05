

package prueba.prueba;


public class Prueba {

    public static void main(String[] args) {
        ModDatos mod= new ModDatos();
  
        Manga manga1=new Manga();
        Manga manga2=new Manga();
        Manga manga3=new Manga();
        Manga manga4=new Manga();
        Manga manga5=new Manga();
        
        
        //Se le da una demografia aleatoria
        mod.RandomDemo(manga1);   
        mod.RandomDemo(manga2);
        mod.RandomDemo(manga3);
        mod.RandomDemo(manga4);
        mod.RandomDemo(manga5);
        
        //Se modifican datos de cada objeto
        mod.PideDatos(manga1);
        mod.PideDatos(manga2);
        mod.PideDatos(manga3);
        mod.PideDatos(manga4);
        mod.PideDatos(manga5);
        
        //Se evalua el mas vendido uno por uno
        mod.masVendido(manga1, manga2, manga3, manga4, manga5);
        mod.masVendido(manga2, manga1, manga3, manga4, manga5);
        mod.masVendido(manga3, manga2, manga1, manga4, manga5);
        mod.masVendido(manga4, manga2, manga3, manga1, manga5);
        mod.masVendido(manga5, manga2, manga3, manga4, manga1);
        
        //Se evalua el menos vendido uno por uno
        mod.menosVendido(manga1, manga2, manga3, manga4, manga5);
        mod.menosVendido(manga2, manga1, manga3, manga4, manga5);
        mod.menosVendido(manga3, manga2, manga1, manga4, manga5);
        mod.menosVendido(manga4, manga2, manga3, manga1, manga5);
        mod.menosVendido(manga5, manga2, manga3, manga4, manga1);
        
        mod.promVentas(manga1, manga2, manga3, manga4, manga5);
        
        
    }
}
