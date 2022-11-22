/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator1;

/**
 *
 * @author LENOVO
 */



public class ColegaConcreto3 extends Colega {

    public ColegaConcreto3(IMediador m) {
        this.setMediador(m);
    }

    // -------------------------------
    @Override
    public void recibir(String mensaje) {
        System.out.println("ColegaConcreto1: " + mensaje);
    }
}
