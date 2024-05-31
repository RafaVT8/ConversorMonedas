import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccionCambio = 0;
        String tipoCambio="";
        double cantidadMoneda;
        ConsultarTipoCambio consultar = new ConsultarTipoCambio();

        while (eleccionCambio != 8) {

        System.out.println("Operaciones que se pueden realizar");
        System.out.println("**********************************************");
        System.out.println("1. USD - MXN");
        System.out.println("2. EUR - USD");
        System.out.println("3. MXN - EUR");
        System.out.println("4. ARS - USD");
        System.out.println("5. VES - USD");
        System.out.println("6. BOB - USD");
        System.out.println("7. BRL - USD");
        System.out.println("8. Salir");
        System.out.println("**********************************************");
        eleccionCambio = entrada.nextInt();

        switch (eleccionCambio){
            case 1:
                tipoCambio = "USD/MXN";
                break;
            case 2:
                tipoCambio = "EUR/USD";
                break;
            case 3:
                tipoCambio = "MXN/EUR";
                break;
            case 4:
                tipoCambio = "ARS/USD";
                break;
            case 5:
                tipoCambio = "VES/USD";
                break;
            case 6:
                tipoCambio = "BOB/USD";
                break;
            case 7:
                tipoCambio = "BRL/USD";
                break;
            case 8:
                break;
            default:
                System.out.println("No se selecciono una opcion correcta");
        }

        try {

            if (tipoCambio.equals("")) {
                System.out.println("La opcion seleccionada no es valida");
            } else if (eleccionCambio==8) {
                break;
            } else {
                System.out.println("Que cantidad desea convertir");
                cantidadMoneda = entrada.nextDouble();
                Moneda moneda = consultar.consultarCambio(cantidadMoneda, tipoCambio);
                GeneradorArchivo archivo = new GeneradorArchivo();
                archivo.guardarArchivo(moneda);
                System.out.println("La cantidad de: "+cantidadMoneda + tipoCambio.substring(0,3) + " equivale a "+ moneda.conversion_result() + tipoCambio.substring(4,7));
            }


        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }

        }
    }
}
