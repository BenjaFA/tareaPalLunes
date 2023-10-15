public class Bici {
    private String bici;

    public Bici(String bici){
        this.bici = bici;
    }

    public String getBici(){
        return bici;
    }

    public double calcularTiempoBici() {
        double distancia = 20;     //Km
        double biciV = 10;
        double tiempo = distancia/biciV;
        return tiempo;
    }
}
