/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoarmas;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public abstract class Defensa implements Armas{
    float portecentajevida;
    public Defensa(float portecentajevida){
        this.portecentajevida=portecentajevida;
    }    
    public abstract void activar_defensa(Personaje personaje);
     
    }
