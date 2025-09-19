/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio10;

/**
 *
 * @author Joel_
 */
public class Titular10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular10(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if(cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
}
