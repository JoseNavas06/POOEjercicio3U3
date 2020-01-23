package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import Navas.BaseBLLCrud;
import Navas.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionMatricula extends Navas.BasePersistencia<Matricula>
        implements BaseBLLCrud {

    private Matricula mimatricula;
    private final String directorio = "matriculas";

    public GestionMatricula() {
    }

    public void setMimatricula(Matricula mimatricula) {
        this.mimatricula = mimatricula;
    }

    public String calificar(float valor) {
        String m = "";
//        int num = this.mimatricula.addCalificacion(valor);
        int num = this.mimatricula.addCalificacion(valor);
        switch (num) {
            case 0:
                m = "Todas las notas está registradas.\n";
                break;
            case 1:
                m = "Calificación de la Unidad I ingresada correctamente.\n";
                break;
            case 2:
                m = "Calificación de la Unidad II ingresada correctamente.\n";
                break;
            case 3:
                m = "Calificación de la Unidad III ingresada correctamente.\n";
                break;
        }
        return m;
    }

    public void promediar() {
        this.mimatricula.CalcularPromedio();
    }

    public String imprimir() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Estudiante: " + mimatricula.getEstudiante() + "\n");
//        sb.append("Curso: " + mimatricula.getCurso() + "\n");
//        sb.append("Promedio: "+ mimatricula.getPromedio()+"\n");
//        return sb.toString();
        return mimatricula.imprimirDetalle();
    }

    public String anularEstudiante() {
        mimatricula.setEstado(Estado.Anulada);

        float f = (mimatricula.getCurso().getCosto() * 0.10f);
        String r = "El estudiante " + mimatricula.getEstudiante().getNombre() + " "
                + "" + mimatricula.getEstudiante().getApellido()
                + " Se ha anulado la matrćula correctamente \n"
                + "Se le cobrara " + f + "$ por políticas internas\n";
        return r;
    }

    public void archivar() throws IOException {
        escribir(directorio, mimatricula.getNumeromatricula(), mimatricula);
    }

    public void Configurar(Curso cr, Estudiante est) {
        mimatricula.setCurso(cr);
        mimatricula.setEstudiante(est);
    }

    public List<Matricula> reportar(String titulo) throws IOException {
        List<Matricula> resultado = new ArrayList<>();
        List<String> contenidos = leerDirectorio(directorio, titulo);
        for (String texto : contenidos) {
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try{
            Matricula m = gson.fromJson(texto, Matricula.class);
            resultado.add(m);
            } 
            catch(JsonSyntaxException ex){
            Util.imprimir("No se pudo convertir en matrícula" );
            Util.imprimir(ex.toString()+"\n");
            }
        }
        return resultado;
    }

    @Override
    public void crear() {
        mimatricula = new Matricula();
    }

    @Override
    public void consultar(String id) throws IOException {

        String archivo = id + ".json";
        String contenido = leer(directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        mimatricula = gson.fromJson(contenido, Matricula.class);
    }

    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
