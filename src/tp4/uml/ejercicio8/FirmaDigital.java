/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio8;

/**
 *
 * @author Joel_
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario8 usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario8 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}
