public class Moto {
    private String moto;

    public Moto(String moto){
        this.moto = moto;
    }

    public String getMoto(){
        return moto;
    }

    public double calcularTiempoMoto() {
        double distancia = 20;     //Km
        double motoV = 40;
        double tiempo = distancia/motoV;
        return tiempo;
    }
}
