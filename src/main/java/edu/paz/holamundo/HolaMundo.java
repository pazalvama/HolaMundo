/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.paz.holamundo;

/**
 *
 * @author Paz
 */
public class HolaMundo {

    public static void main(String[] args) {
        EntradaTeclado introducir=new EntradaTeclado();
        String respuesta;
        String pregunta = "Introduce texto";
        respuesta=introducir.introduceTeclado(pregunta);
        System.out.println("La respuesta es " + respuesta);
    }
}
