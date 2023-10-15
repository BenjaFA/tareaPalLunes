public class Persona {
    private String nombre;
    private Auto auto;
    private Moto moto;
    private Bici bici;
    private String destino;

    public String getNombre(){
        return nombre;
    }

    public Auto getAuto(){
        return auto;
    }

    public Moto getMoto(){
        return moto;
    }

    public Bici getBici(){
        return bici;
    }

    public String getDestino(){
        return destino;
    }

    //CONSTRUCTOR
    public Persona(String nombre, Auto auto, Moto moto, Bici bici, String destino){
        this.nombre   =  nombre;
        this.auto     =    auto;
        this.moto     =    moto;
        this.bici     =    bici;
        this.destino  = destino;

    }

    public double calcularTiempo(){
        double distancia = 20;     //Km
        double tiempoHora = 0.0;   //CONTADOR

        if (auto.getAuto().equals("auto")){
            double autoV = 20;
            tiempoHora = distancia/autoV;
        } else if (moto.getMoto().equals("moto")) {
            double motoV = 40;
            tiempoHora = distancia/motoV;
        } else if (bici.getBici().equals("bici")) {
            double biciV = 10;
            tiempoHora = distancia/biciV;
        }
        return tiempoHora;
    }
}
