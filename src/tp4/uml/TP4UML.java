/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.uml;

import tp4.uml.ejercicio3.*;
import tp4.uml.ejercicio1.*;
import tp4.uml.ejercicio2.*;
import tp4.uml.ejercicio4.*;
import tp4.uml.ejercicio5.*;
import tp4.uml.ejercicio6.*;
import tp4.uml.ejercicio7.*;
import tp4.uml.ejercicio8.*;
import tp4.uml.ejercicio9.*;
import tp4.uml.ejercicio10.*;
import tp4.uml.ejercicio11.*;
import tp4.uml.ejercicio12.*;
import tp4.uml.ejercicio13.*;
import tp4.uml.ejercicio14.*;

/**
 *
 * @author Joel_
 */
public class TP4UML {

    public static void main(String[] args) {
        // Ejercicio 1
        Titular t = new Titular("Jose", "30.303.333");
        Pasaporte p = new Pasaporte(1, "10/10/2020", "urlImage", "png");
        p.setTitular(t);
        System.out.println(p);
        
        // Ejercicio 2
        Bateria bateria = new Bateria("bat-23", "4500");
        Usuario usuario = new Usuario("Pepe", "39.232.444");
        Celular cel = new Celular("imei-1234", "Samsung", "s24 ultra", bateria);
        usuario.setCelular(cel);
        System.out.println(cel);
        
        // Ejercicio 3
        Autor aut = new Autor("J Rowling", "Argentina");
        Editorial ed = new Editorial("Paco Editorial", "Calle falsa 123");
        Libro libro = new Libro("Harry porteño", "isbn", ed);
        libro.setAutor(aut);
        System.out.println(libro);
        
        // Ejercicio 4
        Cliente cl = new Cliente("Pepe", "23.111.222");
        Banco bc = new Banco("Galicia", "20-34111222-2");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("454611112222", "09/31", bc);
        tarjeta.setCliente(cl);
        System.out.println(tarjeta);
        
        // Ejercicio 5
        Propietario prop = new Propietario("Juan", "34111222");
        Computadora pc = new Computadora("Asus", 10023, "mAsus", "chipset123");
        pc.setPropietario(prop);
        System.out.println(pc);
        
        // Ejercicio 6
        Mesa mesa = new Mesa(17, 4);
        ClienteRes cliente = new ClienteRes("Pepe", "+541122334455");
        Reserva reserva = new Reserva("17/09/2025", "10pm", mesa);
        reserva.setCliente(cliente);
        System.out.println(reserva);
        
        // Ejercicio 7
        Motor motor = new Motor("motor", 123);
        Conductor cond = new Conductor("Pepe", "licencia");
        Vehiculo vehiculo = new Vehiculo("PAT123", "Chevi", motor);
        vehiculo.setConductor(cond);
        System.out.println(vehiculo);
        
        // Ejercicio 8
        Documento doc = new Documento("Titulo", "contenido...", "hash", "10/10/2025");
        System.out.println(doc);
        
        // Ejercicio 9
        Paciente paciente = new Paciente("Pepe", "Swiss");
        Profesional profesional = new Profesional("Xavi", "General");
        CitaMedica cita = new CitaMedica("19/10/2025", "10:00");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);        
        System.out.println(cita);
        
        // Ejercicio 10
        Titular10 titular = new Titular10("Jose", "34.333.222");
        CuentaBancaria cnt = new CuentaBancaria("cbu123", 200.0, "codigo", "10/07/2025");     
        cnt.setTitular(titular);
        System.out.println(cnt);
        
        // Ejercicio 11
        Artista art = new Artista("The weekend", "pop");
        Cancion cancion = new Cancion("After hours");
        cancion.setArtista(art);
        Reproductor rep = new Reproductor();
        rep.reproducir(cancion);
        System.out.println(cancion);
        
        // Ejercicio 12
        Contribuyente cont = new Contribuyente("Pepe", "cuil123");
        Impuesto imp = new Impuesto(200.0);
        imp.setContribuyente(cont);
        Calculadora calc = new Calculadora();
        calc.calcular(imp);
        System.out.println(imp);
        
        // Ejercicio 13
        UsuarioQR usuarioQR = new UsuarioQR("Alex", "al@email.com");
        GenerarQR generarQR = new GenerarQR();
        generarQR.generar("valorDeQR", usuarioQR);
        
        // Ejercicio 14
        Proyecto proyecto = new Proyecto("primer proyecto", 15);
        EditorVideo editor = new EditorVideo();
        editor.exportar(".avi", proyecto);
    }
}
