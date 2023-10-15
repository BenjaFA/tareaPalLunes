import java.util.Scanner;

public class Bici {
    private String bici;

    public Bici(String bici){
        this.bici = bici;
    }

    public String getBici(){
        return bici;
    }

    public double calcularTiempoBici() {
        System.out.println("¿Cual es la distancia del recorrido en kilometros?");
        Scanner teclado = new Scanner(System.in);
        double distancia = teclado.nextDouble();    //Km
        double biciV = 10;
        double tiempo = distancia/biciV;
        return tiempo;

    }
}
