/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String lugar = "Buena via";
        String nombre;
        String tipo;
        double costo;
        double porcentaje;
        double peaje = 0;

        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingrese tipo de vehiculo");
        tipo = entrada.nextLine();
        System.out.println("Ingrese avaluo del vehiculo");
        costo = entrada.nextDouble();

        tipo = tipo.toLowerCase();

        switch (tipo) {
            case "vehículo liviano":
            case "liviano":
                tipo = "vehículo liviano particular";
                porcentaje = (costo * 0.01) / 100;
                peaje = porcentaje + 2;
                break;

            case "vehiculo grande":
            case "grande":
                tipo = "vehículo grande particular";
                porcentaje = (costo * 0.02) / 100;
                peaje = porcentaje + 2.5;
                break;

            case "vehiculo taxi":
            case "taxi":
                tipo = "vehiculo de transporte publico";
                porcentaje = (costo * 0.03) / 100;
                peaje = porcentaje + 1.5;
                break;

            case "vehiculo bus":
            case "bus urbano":
            case "bus":
                tipo = "vehiculo de transporte publico";
                porcentaje = (costo * 0.04) / 100;
                peaje = porcentaje + 2.2;
                break;
        }
        System.out.printf("Peaje: %s\n\t"
                + "Propietario: %s\n"
                + "Tipo: %s\n\t"
                + "Valor: %.2f\n\t"
                + "Peaje: %.2f\n", lugar, nombre, tipo, costo, peaje);
    }

}
