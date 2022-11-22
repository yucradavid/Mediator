/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator1;

/**
 *
 * @author LENOVO
 */
        

public abstract class Colega {

    protected IMediador mediador;
    // -------------------------------

    public IMediador geIMediador() {
        return this.mediador;
    }
    // -------------------------------

    public void setMediador(IMediador m) {
        this.mediador = m;
    }
    // -------------------------------

    public void comunicar(String mensaje) {
        this.geIMediador().enviar(mensaje, this);
    }
    // -------------------------------
    // Método a implementar por las clases que hereden

    public abstract void recibir(String mensaje);
}
