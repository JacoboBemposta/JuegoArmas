/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoarmas;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public abstract class Ataque implements Armas{
    float porcentajeataque;
    public void Defensa(float porcentajeataque){
        this.porcentajeataque=porcentajeataque;
    }    
    public abstract void activar_defensa(Personaje personaje);
     
    }