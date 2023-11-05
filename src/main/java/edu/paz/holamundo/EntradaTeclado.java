/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.paz.holamundo;

import java.util.Scanner;

/**
 *
 * @author Paz
 */
public class EntradaTeclado {
    
    public String introduceTeclado(String peticion){
	Scanner lectura = new Scanner (System.in);
	System.out.println(peticion);
	//String texto = lectura.next();
        //int numero=lectura.nextInt();
	String texto = lectura.nextLine();
        return texto;
    }
}
