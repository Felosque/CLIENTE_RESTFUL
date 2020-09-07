/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constantes.RequestJson;
import estructural.Matricula;
import java.util.ArrayList;
import peticiones.URLMatricula;
import servicioWebMatriculas.ServicioMatriculaSW;
import servicioWebMatriculas.ServicioMatriculaSW_Service;

/**
 *
 * @author felip
 */
public class ServicioLocalMatricula {
   
    private ServicioLocalMatricula() {
        
    }
    
    public static int matricularEstudiante(Matricula pMatricula){
        return RequestJson.sendRequest(pMatricula.toJSON(), URLMatricula.matricularEstudiante, "POST");
    }
    
    public static int actualizarMatricula(Matricula pMatricula){
        return RequestJson.sendRequest(pMatricula.toJSON(), URLMatricula.actualizarMatricula, "PUT");
    }
    
    public static int borrarMatriculaCodigo(String pCodigo){
        return RequestJson.sendRequest(null, URLMatricula.borrarMatriculaCodigo, "DELETE");
    }
    
    public static ArrayList<Matricula> darMatriculasEstudiante(String pDocumento){
        String peticion = URLMatricula.darMatriculasEstudiante + "?documento=" + pDocumento;
        String matriculasJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        ArrayList<Matricula> matriculas = gson.fromJson(matriculasJSON, new TypeToken<ArrayList<Matricula>>(){}.getType());
        return matriculas;
    }
    
    public static ArrayList<Matricula> darMatriculasEstudianteGrado(String pDocumento, String pGrado){
        String peticion = URLMatricula.darMatriculasEstudianteGrado + "?documento=" + pDocumento + "?grado=" + pGrado;
        String matriculasJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        ArrayList<Matricula> matriculas = gson.fromJson(matriculasJSON, new TypeToken<ArrayList<Matricula>>(){}.getType());
        return matriculas;
    }
    
    public static Matricula darMatriculaCodigo(String pCodigo){
        String peticion = URLMatricula.darMatriculaCodigo + "?codigo=" + pCodigo;
        String matriculaJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        Matricula matri = gson.fromJson(matriculaJSON, Matricula.class);
        return matri;
    }
    
    public static double darPromedioEstudiante(String pDocumento){
        String peticion = URLMatricula.darPromedioEstudiante;
        String cantidadJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        double cantidad = gson.fromJson(cantidadJSON, Double.TYPE);
        return cantidad;
    }
    
    public static ArrayList<Matricula> darMatriculas(){
        String peticion = URLMatricula.darMatriculas;
        String matriculasJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        ArrayList<Matricula> matriculas = gson.fromJson(matriculasJSON, new TypeToken<ArrayList<Matricula>>(){}.getType());
        return matriculas;
    }
    
    
    public static ArrayList<Integer> darCantidadMateriasPorGradoCursado(){
        String peticion = URLMatricula.darCantidadMateriasPorGradoCursado;
        String matriculasJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        ArrayList<Integer> materiasPorGrado = gson.fromJson(matriculasJSON, new TypeToken<ArrayList<Integer>>(){}.getType());
        return materiasPorGrado;
    }

    public static int cantidadMatriculasRegistradas(){
        String peticion = URLMatricula.cantidadMatriculasRegistradas;
        String cantidadJSON = RequestJson.recibirPeticion(peticion, "GET");
        Gson gson = new Gson();
        int cantidad = gson.fromJson(cantidadJSON, Integer.TYPE);
        return cantidad;
    }
    
}
