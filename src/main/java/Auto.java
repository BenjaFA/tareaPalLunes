public class Auto {
    private String auto;

    public Auto(String auto){
        this.auto = auto;
    }

    public String getAuto(){
        return auto;
    }

    public double calcularTiempoAuto() {
        double distancia = 20;     //Km
        double autoV = 20;
        double tiempo = distancia/autoV;
        return tiempo;
    }
}
