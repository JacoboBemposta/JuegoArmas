/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoarmas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Personaje {
   String nombre;
    float puntosvida;
    float puntosataque;
    boolean proteccionarquero,proteccioncuerpo;
    boolean ataquearquero,ataquecuerpo;
    ArrayList<Armas> listaarmas;
    
    public Personaje(String nombre,ArrayList<Armas> listaarmas,boolean proteccionarquero,boolean ataquearquero,boolean proteccioncuerpo,boolean ataquecuerpo){
        setPuntosvida();
        setPuntosataque();
        this.nombre=nombre;
        this.listaarmas=listaarmas;
        this.proteccionarquero=proteccionarquero;
        this.proteccioncuerpo=proteccioncuerpo;
        this.ataquearquero=ataquearquero;
        this.ataquecuerpo=ataquecuerpo;
        
    }
    
    public void equipar (Armas arma){
        equipar_personaje(Personaje personaje);
    }

    public float getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce puntos de vida");
        this.puntosvida = teclado.nextFloat();
    }

    public double getPuntosataque() {
        return puntosataque;
    }

    public void setPuntosataque() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce puntos de ataque");
        this.puntosataque = teclado.nextFloat();
    }

    public ArrayList getListaarmas() {
        return listaarmas;
    }

    public void setListaarmas(ArrayList listaarmas) {
        this.listaarmas = listaarmas;
    }
    public void engadir_armas(Armas arma){
        System.out.println("Indica el arma que vas a utilizar");
        listaarmas.add(arma);
    }
    public void eliminar_arma(Armas arma){
        System.out.println("Indica el arma");
        for (int i = 0; i < listaarmas.size(); i++) {
            if(listaarmas.nombre.equals.arma){
                listaarmas.remove(i);
            }
        }
    }    
}