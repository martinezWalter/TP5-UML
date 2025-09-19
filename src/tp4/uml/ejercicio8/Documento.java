/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio8;

/**
 *
 * @author Joel_
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String cHash, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        Usuario8 usuario = new Usuario8("Pepe", "pepe@email.com");
        this.firmaDigital = new FirmaDigital(cHash, fecha, usuario);
    }
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
}
