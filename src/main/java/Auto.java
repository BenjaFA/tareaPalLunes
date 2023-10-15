import java.util.Scanner;

public class Auto {
    private String auto;

    public Auto(String auto){
        this.auto = auto;
    }

    public String getAuto(){
        return auto;
    }

    public double calcularTiempoAuto() {
        System.out.println("¿Cual es la distancia del recorrido?");
        Scanner teclado = new Scanner(System.in);
        double distancia = teclado.nextDouble();     //Km
        double autoV = 20;
        double tiempo = distancia/autoV;
        return tiempo;
    }
}
