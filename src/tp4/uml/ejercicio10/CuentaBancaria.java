/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio10;

/**
 *
 * @author Joel_
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular10 titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultModif) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultModif);
    }
    public Titular10 getTitular() {
        return titular;
    }
    public void setTitular(Titular10 titular) {
        this.titular = titular;
        if(titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
}
