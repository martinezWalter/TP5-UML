/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.uml.ejercicio9;

/**
 *
 * @author Joel_
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", profesional=" + profesional + ", paciente=" + paciente + '}';
    }
}
