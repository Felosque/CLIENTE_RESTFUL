package estructural;

import java.io.Serializable;
import java.util.Date;
import org.json.simple.JSONObject;

public class Matricula implements Serializable{
    
    private int codigo;
    
    private String pkEstudiante;
    
    private int pkMateria;
    
    private Date fechaInscripcion;
    
    private Date fechaInicio;
    
    private Date fechaFinal;
    
    private double notaDefinitiva;
    
    private int estado;

    public Matricula(int pCodigo, String pkEstudiante, int pkMateria, Date fechaInscripcion, Date fechaInicio, Date fechaFinal, double notaDefinitiva, int estado) {
        this.codigo = pCodigo;
        this.pkEstudiante = pkEstudiante;
        this.pkMateria = pkMateria;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.notaDefinitiva = notaDefinitiva;
        this.estado = estado;
    }

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

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
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
    
    public JSONObject toJSON(){
        JSONObject matricula = new JSONObject();
        matricula.put("codigo", "" + this.codigo);
        matricula.put("estado", "" + this.estado);
        matricula.put("fechaFinal", this.fechaFinal.toString());
        matricula.put("fechaInicio", this.fechaInicio.toString());
        matricula.put("fechaInscripcion", this.fechaInscripcion.toString());
        matricula.put("notaDefinitiva", ""+ this.notaDefinitiva);
        matricula.put("pkEstudiante", ""+this.pkEstudiante);
        matricula.put("pkMateria", ""+this.pkMateria);
        System.out.print(matricula.toJSONString());
        return matricula;
    }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", pkEstudiante=" + pkEstudiante + ", pkMateria=" + pkMateria + ", fechaInscripcion=" + fechaInscripcion + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", notaDefinitiva=" + notaDefinitiva + ", estado=" + estado + '}';
    }
 
}