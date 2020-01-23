package BEU;

import Navas.Persona;
import Navas.UNIDAD;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Matricula {

    private Calendar fecha;
    private Estado estado;
    private Persona estudiante;
    private Curso curso;
    private final List<Calificacion> calificaciones = new ArrayList<>();
    private final String numeromatricula;

    //Información
    private float promedio;

   

    public Matricula() {
        fecha = Calendar.getInstance();
        estado = Estado.Registrada;
        UUID numeroAleatorio = UUID.randomUUID();
        this.numeromatricula = numeroAleatorio.toString();
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeromatricula() {
        return numeromatricula;
    }

   
    
    

    public void CalcularPromedio() {
        
        if(this.calificaciones.isEmpty()){
        return;
        
        }
        float suma = 0;
        for (Calificacion c : calificaciones) {
            suma += c.valor; //Se puede acceder al atributo porque es una clase interna
        }
        int divisor = this.calificaciones.size();
        promedio = (float) suma / (float) divisor;
        
        if(divisor == 3){
        if(promedio>14){
        this.estado =Estado.Aprobada;
        }
        else{
        this.estado = Estado.Reprobada;
        }
        }

    }

    public int addCalificacion(float v) {
        Calificacion cal = new Calificacion();
        int nCali = this.calificaciones.size();
        switch (nCali) {
            case 0:
                cal.setUnidad(UNIDAD.I);
                break;
            case 1:
                cal.setUnidad(UNIDAD.II);
                break;
            case 2:
                cal.setUnidad(UNIDAD.III);
                break;
            default:
                return 0;
        }

        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        calificaciones.add(cal);
        this.CalcularPromedio();
        return this.calificaciones.size();
        
        
        
            }
    
    public String imprimirDetalle(){
    String str = "\n Nombre: \t\t" + this.estudiante + "\t\n Calificaciones:" ;
    for (Calificacion c: this.calificaciones){
    str += " \n\t\t" + c.getValor();
    
    }
    str += "\n Promedio: \n\t\t" + this.promedio;
    return str;
    
    }
    
 //Clase Interna
    class Calificacion {

        private Calendar fecha;
        private float valor;
        private UNIDAD unidad;

        public Calificacion() {
        }

        public Calendar getFecha() {
            return fecha;
        }

        public void setFecha(Calendar fecha) {
            this.fecha = fecha;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public UNIDAD getUnidad() {
            return unidad;
        }

        public void setUnidad(UNIDAD unidad) {
            this.unidad = unidad;
        }
        
        

    }
    
   
    
    
    @Override
     public String toString(){
         return estudiante.toString() + " #" + numeromatricula;
    
    }
     public String toSave(){
       GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);
     
     }
    
    
}
