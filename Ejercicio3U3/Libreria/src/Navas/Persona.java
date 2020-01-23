package Navas;

import java.util.Calendar;

public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private Calendar fecha_nacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, Calendar fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return   nombre +" " + apellido +" ";
    }

    
    
    
}
