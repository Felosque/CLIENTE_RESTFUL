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
public class ListaMateria {
    
    private ArrayList<Materia> Materia;

    public ListaMateria() {
        this.Materia = new ArrayList<>();
    }
    
    public ArrayList<Materia> getEstudiantes() {
        if(Materia == null) return new ArrayList<>();
        else return Materia;
    }

    public void setEstudiantes(ArrayList<Materia> pMateria) {
        this.Materia = pMateria;
    }
    
}
