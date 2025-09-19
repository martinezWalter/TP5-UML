/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio13;

/**
 *
 * @author Joel_
 */
public class GenerarQR {
    public void generar(String valor, UsuarioQR usuario) {
        CodigoQR codQR = new CodigoQR(valor);
        codQR.setUsuario(usuario);
        System.out.println("Generando Codigo QR...");
        System.out.println(codQR);
    }
}
