/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.cliente_main;

import java.util.Scanner;

/**
 *
 * @author a22marcorr
 */
public class Cliente_Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int respuesta;
        BaseDatos BBDD1 = new BaseDatos();
        
        do {
            System.out.println("Si quiere añadir un cliente pulse 1");
            System.out.println("Si quiere mostrtar los clientes pulse 2");
            System.out.println("Si quiere eliminar un cliente pulse 3");
            respuesta = leer.nextInt();
            if (respuesta == 1) {
                BBDD1.altaCliente();
            } else if (respuesta == 2) {
                BBDD1.mostrarCliente();
            } else if (respuesta == 3) {
                String nifEliminar;
                System.out.println("Esciba el nif de el cliente que quiera eliminar");
                nifEliminar = leer2.nextLine();
                BBDD1.eliminarCliente(nifEliminar);
                System.out.println("Hola mundo");
                System.out.println("111merdge2");
            }

        } while (respuesta != 0);
    }
}
