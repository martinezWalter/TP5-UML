/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio13;

/**
 *
 * @author Joel_
 */
public class CodigoQR {
    private String valor;
    private UsuarioQR usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }
    public void setUsuario(UsuarioQR usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}
