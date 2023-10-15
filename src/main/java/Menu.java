import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //NOMBRE
        System.out.println("Ingrese su nombre: ");
        String nombre   = lector.nextLine();

        //DESTINO
        System.out.println("¿Cual es su destino?");
        String destino  = lector.nextLine();


        //OBJETOS
        Auto auto = new Auto("auto");
        Moto moto = new Moto("moto");
        Bici bici = new Bici("bici");
        Persona persona = new Persona(nombre, auto, moto, bici, destino);


        //OPCIONES DE VEHICULOS
        String opcion;
        do {
            System.out.println("========================================");
            System.out.println("               CALCULADORA              ");
            System.out.println("               DE   TIEMPO              ");
            System.out.println("========================================");
            System.out.println("    auto                                ");
            System.out.println("    moto                                ");
            System.out.println("    bici                                ");
            System.out.println("    salir                               ");
            System.out.println("========================================");
            System.out.print("        Escriba una de las opciones  :    ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion) {
                case "auto":
                    System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " + persona.getDestino() + " en " + auto.getAuto() + " es de: " + auto.calcularTiempoAuto());
                    break;

                case "moto":
                    System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " + persona.getDestino() + " en " + moto.getMoto() + " es de: " + moto.calcularTiempoMoto());
                    break;

                case "bici":
                    System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " + persona.getDestino() + " en " + bici.getBici() + " es de: " + bici.calcularTiempoBici());
                    break;

                case "salir":
                    System.out.println("        Adios ");
                    break;

                default:
                    System.out.println("        Ingrese una opción válida ");
                    break;
            }
        } while (!opcion.equals("salir"));
    }
}
