/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int tipoEmpleado;
        double sueldoBase;
        double incremento = 0;
        double sueldoFinal = 0;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado que es (1/2/3/4/5/...)");
        tipoEmpleado = entrada.nextInt();
        System.out.println("Ingrese su sueldo");
        sueldoBase = entrada.nextDouble();

        if (tipoEmpleado == 1) {
            incremento = (sueldoBase * 5) / 100;
            sueldoFinal = sueldoBase + incremento;

        } else {
            if (tipoEmpleado == 2) {
                incremento = (sueldoBase * 7) / 100;
                sueldoFinal = sueldoBase + incremento;

            } else {
                if (tipoEmpleado == 3) {
                    incremento = (sueldoBase * 9) / 100;
                    sueldoFinal = sueldoBase + incremento;

                } else {
                    if (tipoEmpleado == 4) {
                        incremento = (sueldoBase * 12) / 100;
                        sueldoFinal = sueldoBase + incremento;

                    } else {
                        if (tipoEmpleado >= 5) {
                            incremento = (sueldoBase * 15) / 100;
                            sueldoFinal = sueldoBase + incremento;

                        } else {

                        }
                    }
                }
            }
        }
        if (tipoEmpleado < 1) {
            System.out.println("ERROR, tipo no existente");
        } else {
            System.out.printf("Nombre: %s\n"
                    + "Sueldo inicial: %.2f\n"
                    + "Incremento: %.2f\n"
                    + "Sueldo final: %.2f\n", nombre, sueldoBase, incremento, sueldoFinal);
        }
    }

}
