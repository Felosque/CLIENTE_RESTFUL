package estructural;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import constantes.UtilitiesFunctions;
import static constantes.UtilitiesFunctions.gregorianStringToDate;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

public class Matricula implements Serializable{
    
    private int codigo;
    
    private int estado;
    
    private String fechaFinal;
    
    private String fechaInicio;
    
    private  String fechaInscripcion;
    
    private double notaDefinitiva;
    
    private String pkEstudiante;
    
    private int pkMateria; 

    public Matricula(int codigo, int estado, String fechaFinal, String fechaInicio, String fechaInscripcion, double notaDefinitiva, String pkEstudiante, int pkMateria) {
        this.codigo = codigo;
        this.estado = estado;
        this.fechaFinal = fechaFinal;
        this.fechaInicio = fechaInicio;
        this.fechaInscripcion = fechaInscripcion;
        this.notaDefinitiva = notaDefinitiva;
        this.pkEstudiante = pkEstudiante;
        this.pkMateria = pkMateria;
    }
 
    
    
    /*public Matricula(JSONObject obj){
        codigo = (int) obj.get("codigo");
        estado = (int) obj.get("estado");
        fechaFinal = gregorianStringToDate((String) obj.get("fechaFinal"));
        fechaInicio = gregorianStringToDate((String) obj.get("fechaInicio"));
        fechaInscripcion = gregorianStringToDate((String) obj.get("fechaInscripcion"));
        notaDefinitiva = (double) obj.get("notaDefinitiva");
        pkEstudiante = (String) obj.get("estado");
        pkMateria = (int) obj.get("estado");
    }*/

    public Matricula() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getPkEstudiante() {
        return pkEstudiante;
    }

    public void setPkEstudiante(String pkEstudiante) {
        this.pkEstudiante = pkEstudiante;
    }

    public int getPkMateria() {
        return pkMateria;
    }

    public void setPkMateria(int pkMateria) {
        this.pkMateria = pkMateria;
    }

    

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public String toJSON(){
        Gson gson = new Gson();
        String matricula = gson.toJson(this);
        return matricula;
    }
    

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", pkEstudiante=" + pkEstudiante + ", pkMateria=" + pkMateria + ", fechaInscripcion=" + fechaInscripcion + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", notaDefinitiva=" + notaDefinitiva + ", estado=" + estado + '}';
    }
 
}