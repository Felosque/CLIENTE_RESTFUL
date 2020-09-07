/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import constantes.RequestJson;
import estructural.Estudiante;
import estructural.ListaEstudiante;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ServicioLocalEstudiante {
    
    private static final String defaultURL = "http://192.168.16.12:7101/ProyectoServiciosWeb/resources/servicioWebEstudiante/";
    
    public static final String insertarEstudiante = defaultURL + "insertarEstudiante";
    public static final String eliminarEstudiante = defaultURL + "eliminarEstudiante";
    public static final String buscarEstudiante = defaultURL + "buscarEstudiante";
    public static final String actualizarEstudiante = defaultURL + "actualizarEstudiante";
    public static final String darEstudiantes = defaultURL + "darEstudiantes";
    public static final String cantidadEstudiantesPorGenero = defaultURL + "cantidadEstudiantesPorGenero";
    public static final String darEstudiantesPorNombre = defaultURL + "darEstudiantesPorNombre";
    public static final String darGradoEstudiante = defaultURL + "darGradoEstudiante";
    public static final String cantidadEstudiantesRegistrados = defaultURL + "cantidadEstudiantesRegistrados";
    
    
    private ServicioLocalEstudiante() {
        
    }
    
    public static int insertarEstudiante(Estudiante pEstudiante){ //Listo
        return RequestJson.sendRequest(pEstudiante.toJSON(), insertarEstudiante, RequestJson.POST);
    }
    
    public static int eliminarEstudiante(String pDocumento){ //Fallando
        String peticion = eliminarEstudiante + "?documento=" + pDocumento;
        return RequestJson.sendRequest(null, peticion, RequestJson.GET);
    }
    
    public static int actualizarEstudiante(Estudiante pEstudiante){ //Funcionando
        return RequestJson.sendRequest(pEstudiante.toJSON(), actualizarEstudiante, RequestJson.PUT);
    }
    
     public static Estudiante buscarEstudiante(String pDocumento){ //Funcionando
        String peticion = buscarEstudiante + "?documento=" + pDocumento;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        Estudiante estu = gson.fromJson(estudianteJSON, Estudiante.class);
        return estu;
    }
    
    
    public static ArrayList<Estudiante> darEstudiantes(){ //Funcionando
        String peticion = darEstudiantes;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        ListaEstudiante estudiantes = gson.fromJson(estudianteJSON, ListaEstudiante.class);
        if (estudiantes == null) return new ArrayList<>();
        else return estudiantes.getEstudiantes();
    }
    
    public static ArrayList<Integer> cantidadEstudiantesPorGenero(){
        return new ArrayList<>();
    }
    
    public static ArrayList<Estudiante> darEstudiantesPorNombre(String pNombre){ //Funcionando
        String peticion = darEstudiantesPorNombre + "?nombre=" + pNombre;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        ListaEstudiante estudiantes = gson.fromJson(estudianteJSON, ListaEstudiante.class);
        return estudiantes.getEstudiantes();
    }
    
    public static int darGradoEstudiante(String pDocumento){ //Faltan condicionales
        String peticion = darGradoEstudiante + "documento?=" + pDocumento;
        String cantidadJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        JsonObject jobj = new Gson().fromJson(cantidadJSON, JsonObject.class);
        String cantidad = jobj.get("respuesta").getAsString();
        return Integer.parseInt(cantidad);
    }
    
    public static int cantidadEstudiantesRegistrados(){ //Funcionando
        String peticion = cantidadEstudiantesRegistrados;
        String cantidadJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        JsonObject jobj = new Gson().fromJson(cantidadJSON, JsonObject.class);
        String cantidad = jobj.get("respuesta").getAsString();
        return Integer.parseInt(cantidad);
    }
    


}
