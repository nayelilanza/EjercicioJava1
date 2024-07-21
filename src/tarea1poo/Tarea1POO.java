/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1poo;

/**
 *
 * @author 50497
 */
public class Tarea1POO {

    public static void main(String[] args) {
        // Ejercicio 1: Saludo
        System.out.println("Hola, soy Josselin Lanza");

        // Ejercicio 2: Operaciones aritméticas
        int numero1 = 8; // Cambia este valor
        int numero2 = 4; // Cambia este valor
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("División: " + (numero1 / numero2));
        System.out.println("Modulo: " + (numero1 % numero2));

        // Ejercicio 3: Evaluación de expresiones
        int M = 6, T = 1, K = -10;
        System.out.println("M > T: " + (M > T)); // Verdadero
        System.out.println("T / K == -5: " + (T / K == -5)); // Falso
        System.out.println("(M+T == 7) || (M-T == 5): " + ((M+T == 7) || (M-T == 5))); // Verdadero

        // Ejercicio 4: Arreglo de nombres
        String[] nombres = {"Cindy", "David", "Daniela", "Rixy", "Diana", "Elbin", "Enzo", "Carlos", "Jorge", "Junior"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Ejercicio 5: Arreglo multidimensional de datos personales
        String[][] datos = {
            {"Cindy", "Ramos", "Lic.Informatica","La Ceiba", "DETODO"},
            {"Gisel", "Gomez", "Computacion","Santa Barbara", "Municipalidad"},
            {"Josselin", "Ramos", "Ing.Industrial","La Ceiba", "Palmasa"},
            {"Abner", "Matamores", "Ing.Sistemas", "SPD","Diunsa"},
            {"Gisel", "Gomez", "Computacion","Tegucigalpa", "La Colonia"},
            // Añade más registros aquí
        };
        for (String[] persona : datos) {
            System.out.println("Nombre: " + persona[0] + ", Apellido: " + persona[1] + ", Carrera: " + persona[2] + ", Lugar: " + persona[3] + "Trabajo:"+ persona [4]);
        }

        // Ejercicio 6: Notas de estudiantes
        imprimirNota("Daniel", 65);
        imprimirNota("Monica", 89);

        // Ejercicio 7: Números pares del 2 al 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void imprimirNota(String nombre, int nota) {
        String resultado = nota >= 60 ? "Aprobado" : "Reprobado";
        System.out.println(nombre + " " + nota + " " + resultado);
    }
}




