/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoarmas;

/**
 *
 * @author Jacobo Bemposta Castro
 */
public class Arco extends Ataque {
    float porcentaje_ataque;
    public Arco(){
        this.porcentaje_ataque=0.15f;
    }
    
    @Override
    public void activar_defensa(Personaje personaje) {
        
    }

    @Override
    public void equipar_personaje(Personaje personaje) {
        
    }
    
}
