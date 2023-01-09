/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente_main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a22marcorr
 */
public class BaseDatos {

    private ArrayList<Cliente> BBDD = new ArrayList<Cliente>();
    Scanner leer = new Scanner(System.in);

    public void altaCliente() {
        System.out.println("Escriba el nombre del cliente");
        String nombre = leer.nextLine();
        System.out.println("Escriba el apellido del cliente");
        String apellido = leer.nextLine();
        System.out.println("Escriba el nif del cliente");
        String nif = leer.nextLine();
        System.out.println("");
        Cliente cliente1 = new Cliente(nif, nombre, apellido);
        BBDD.add(cliente1);

    }

    public void mostrarCliente() {
        for (int i = 0; i < BBDD.size(); i++) {
            System.out.println("Cliente " + (i + 1) + ": " + BBDD.get(i).getNif());

        }
        System.out.println("");
    }

    public void eliminarCliente(String nifelim) {
        for (int i = 0; i < BBDD.size(); i++) {

            if (BBDD.get(i).getNif().equals(nifelim)) {
                BBDD.remove(i);
                System.out.println("El usuario se ha eliminado con exito");
                System.out.println("");
            }

        }

    }

}
