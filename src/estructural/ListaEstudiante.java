/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class ListaEstudiante {
    
    private ArrayList<Estudiante> Estudiante;

    public ListaEstudiante() {
        this.Estudiante = new ArrayList<>();
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        if(Estudiante == null) return new ArrayList<>();
        else return Estudiante;
    }

    public void setEstudiantes(ArrayList<Estudiante> pEstudiante) {
        this.Estudiante = pEstudiante;
    }
    
}
