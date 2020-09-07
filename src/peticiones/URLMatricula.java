/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peticiones;

/**
 *
 * @author Estudiantes
 */
public class URLMatricula {
    
    private static final String defaultURL = "http://192.168.16.12:7101/ProyectoServiciosWeb/resources/serviciosWebMatricula/";
    
    public static final String matricularEstudiante = defaultURL + "matricularEstudiante";
    public static final String darMatriculas = defaultURL + "darMatriculas";
    public static final String darMatriculasEstudiante = defaultURL + "darMatriculasEstudiante";
    public static final String darMatriculasPorFecha = defaultURL + "darMatriculasPorFecha";
    public static final String darCantidadMateriasPorGradoCursado = defaultURL + "darCantidadMateriasPorGradoCursado";
    public static final String actualizarMatricula = defaultURL + "actualizarMatricula";
    public static final String darPazYSalvoEstudiante = defaultURL + "darPazYSalvoEstudiante";
    public static final String borrarMatriculaCodigo = defaultURL + "borrarMatriculaCodigo";
    public static final String darMatriculaCodigo = defaultURL + "darMatriculaCodigo";
    public static final String darPromedioEstudiante = defaultURL + "darPromedioEstudiante";
    public static final String darMatriculasEstudianteGrado  = defaultURL + "darMatriculasEstudianteGrado";
    public static final String cantidadMatriculasRegistradas = defaultURL + "cantidadMatriculasRegistradas";
    
}
