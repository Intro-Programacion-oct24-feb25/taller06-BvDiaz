/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1;
        double num2;
        String operacion;
        double respuesta;

        System.out.println("ingrese el valor del numero 1");
        num1 = entrada.nextDouble();
        System.out.println("ingrese el valor del numero 2");
        num2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("ingrese la operacion a realizar");
        operacion = entrada.nextLine();

        if (num1 > num2) {
            switch (operacion) {
                case "+":
                    respuesta = num1 + num2;
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;

                case "-":
                    respuesta = num1 - num2;
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;
                case "*":
                    respuesta = num1 * num2;
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;
                case "/":
                    respuesta = num1 / num2;
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;
                case "%":
                    respuesta = num1 % num2;
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;
                case "^":
                    respuesta = Math.pow(num1, num2);
                    System.out.printf("Valor 1: %.2f\n"
                            + "Valor 2: %.2f\n"
                            + "operacion: %s\n"
                            + "resultado: %.2f", num1, num2, operacion, respuesta);
                    break;

            }

        } else {
            System.out.println("ERROR, el numero 1 debe ser mayor el que numero 2");
        }

    }
}
