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
public class ListaMatricula {

    private ArrayList<Matricula> matricula;

    public ListaMatricula() {
        this.matricula = new ArrayList<>();
    }
    
    public ArrayList<Matricula> getMatricula() {
        if(matricula == null) return new ArrayList<>();
        else return matricula;
    }

    public void setMatricula(ArrayList<Matricula> Matricula) {
        this.matricula = Matricula;
    }
    
}
