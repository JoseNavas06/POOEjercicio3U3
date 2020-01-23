package Navas;

public class Caratula {
    //Atributos

    private String Nombre;
    private String Fecha;
    private byte n_Ejercicios;
    private String Titulo;
    private String Descripcion;
    private UNIDAD Unidad;

    public Caratula() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public byte getN_Ejercicios() {
        return n_Ejercicios;
    }

    public void setN_Ejercicios(byte n_Ejercicios) {
        this.n_Ejercicios = n_Ejercicios;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public UNIDAD getUnidad() {
        return Unidad;
    }

    public void setUnidad(UNIDAD Unidad) {
        this.Unidad = Unidad;
    }
//Crea una cadena con los valores de inicio
    // de la caratula y la retorna
    public String imprimirInicio(){
    String resultado="";
    resultado+="=======================================================================\n";
    resultado+= " \t\tUniversidad de las Fuerzas Armadas\n";
    resultado+= "\t\t    ESPE Extensión-Latacunga\n";
    resultado+= "----------------------------------------------------------------------\n";
    resultado+= "\n";
    resultado += " \t\tCarrera de Ingeniería en Software\n";
    resultado += "\t\t       Periodo: SEP19-FEB20\n";
    resultado += "\n";
    resultado+="=======================================================================\n";
    resultado += "\t\t              Unidad " + Unidad + "\n";
    resultado += "\tNombre: " + Nombre + "\n";
    resultado += "\tFecha: " + Fecha + "\n";
    resultado += "\n";
    resultado+= "======================================================================\n";
    resultado += "\tTítulo: " + Titulo + "\n";
    resultado += "\tDescripcion: " + Descripcion + "\n";
    resultado+="=======================================================================\n";
    
    
    
    return resultado;
    }
}
