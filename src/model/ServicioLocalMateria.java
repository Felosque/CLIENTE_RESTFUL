/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import constantes.RequestJson;
import estructural.ListaMateria;
import estructural.Materia;
import java.util.ArrayList;


/**
 *
 * @author felip
 */
public class ServicioLocalMateria {
    
    
    private static final String defaultURL = "http://192.168.16.12:7101/ProyectoServiciosWeb/resources/serviciosWebMateria/";
    
    public static final String darMateriaPorCodigo = defaultURL + "darMateriaPorCodigo";
    public static final String darMateriasPorGrado = defaultURL + "darMateriasPorGrado";
    public static final String darMaterias = defaultURL + "darMaterias";
    public static final String cantidadMateriasRegistradas = defaultURL + "cantidadMateriasRegistradas";

    private ServicioLocalMateria() {
    }

    
    public static Materia darMateriaPorCodigo(String pCodigo){
        String peticion = darMateriaPorCodigo + "?codigo=" + pCodigo;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        Materia materia = gson.fromJson(estudianteJSON, Materia.class);
        return materia;
    }
    
    public static ArrayList<Materia> darMateriasPorGrado(String pGrado){
        String peticion = darMateriasPorGrado + "?grado=" + pGrado;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        ListaMateria materias = gson.fromJson(estudianteJSON, ListaMateria.class);
        if (materias == null) return new ArrayList<>();
        else return materias.getMateria();
    }
    
    public static ArrayList<Materia> darMaterias(){
        String peticion = darMaterias;
        String estudianteJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        Gson gson = new Gson();
        ListaMateria materias = gson.fromJson(estudianteJSON, ListaMateria.class);
        if (materias == null) return new ArrayList<>();
        else return materias.getMateria();
    }
    
    public static int cantidadMateriasRegistradas(){
        String peticion = cantidadMateriasRegistradas;
        String cantidadJSON = RequestJson.recibirPeticion(peticion, RequestJson.GET);
        JsonObject jobj = new Gson().fromJson(cantidadJSON, JsonObject.class);
        String cantidad = jobj.get("respuesta").getAsString();
        return Integer.parseInt(cantidad);
    }
    
    
}
