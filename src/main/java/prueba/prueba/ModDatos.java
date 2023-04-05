package prueba.prueba;
import java.util.Scanner;
import java.util.Random;

public class ModDatos {
    Scanner leer=new Scanner(System.in);
    
    /*public void Demo(Manga a,Manga b, Manga c, Manga d, Manga e){
        if (a.getDemografia()=="seinen"){
            
    }}*/
    
    public void RandomDemo(Manga a){
        Random dado = new Random();
        int numero = dado.nextInt(2);
        
        if (numero==0){
        a.setDemografia("shonen"); }
        
        if (numero==1){
        a.setDemografia("seinen"); }
        
        if (numero==2){
        a.setDemografia("shojo"); }
    }
    
    public void PideDatos(Manga a){
        System.out.println("Ingrese el nombre del manga:");
        a.setNombre(leer.next());
        System.out.println("\n");
        
        System.out.println("Ingrese nombre del autor:");
        a.setAutor(leer.next());
        System.out.println("\n");
        
        System.out.println("Ingrese fecha de publicacion (Formato: Dia/Mes/a;o)");
        a.setFechap(leer.next());
        System.out.println("\n");
        
        System.out.println("Ingrese cantidad de ventas por trimeste");
        a.setVentasTrim(leer.nextInt());
        System.out.println("\n");
        
        System.out.println("El manga tiene anime en emision? Ingrese 'si' o 'no'");
        a.setAnimeEm(leer.next());
        System.out.println("\n");
        
        System.out.println("Ingrese numero segun demografia:\n1.shonen\n2.seinen\n3.shojo");
        int demo=leer.nextInt();
        
        if (demo==1){
            a.setDemografia("shonen");
        }
        
        if (demo==2){
            a.setDemografia("seinen");
        }
        
        if (demo==3){
            a.setDemografia("shojo");
        }     
        System.out.println("\n");
    }
    
    public void masVendido(Manga a,Manga b, Manga c, Manga d, Manga e){
        if (a.getVentasTrim()>b.getVentasTrim()){
            if (a.getVentasTrim()>c.getVentasTrim()){
                if (a.getVentasTrim()>d.getVentasTrim()){
                    if (a.getVentasTrim()>e.getVentasTrim()){
                        System.out.println("El manga mas vendido es "+a.getNombre());
                    }
                }
            }   
        }
    }
    
    public void menosVendido(Manga a,Manga b, Manga c, Manga d, Manga e){
        if (a.getVentasTrim()<b.getVentasTrim()){
            if (a.getVentasTrim()<c.getVentasTrim()){
                if (a.getVentasTrim()<d.getVentasTrim()){
                    if (a.getVentasTrim()<e.getVentasTrim()){
                        System.out.println("El manga menos vendido es "+a.getNombre());
                    }
                }
            }   
        }
    }
    
    
    public void promVentas(Manga a, Manga b, Manga c,Manga d,Manga e){
        int totalvent=a.getVentasTrim()+b.getVentasTrim()+c.getVentasTrim()+d.getVentasTrim()+e.getVentasTrim();
        double promedio= totalvent/5;
        System.out.println("El promedio de ventas por trimestre es: "+promedio);
    }
}
