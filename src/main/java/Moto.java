import java.util.Scanner;

public class Moto {
    private String moto;

    public Moto(String moto){
        this.moto = moto;
    }

    public String getMoto(){
        return moto;
    }

    public double calcularTiempoMoto() {
        System.out.println("¿Cual es la distancia del recorrido en kilometros?");
        Scanner teclado = new Scanner(System.in);
        double distancia = teclado.nextDouble();    //Km
        double motoV = 40;
        double tiempo = distancia/motoV;
        return tiempo;
    }
}
