/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet.Entidades;

import java.time.LocalDate;

/**
 *
 * @author ev978
 */
public class VisitaMascotas {
    
    private int idVisita;
    private int idMascota;
    private int idtrat;
    private LocalDate fechaVisit;
    private double peso;
    private boolean estado;

    public VisitaMascotas(int idVisita, int idMascota, int idtrat, LocalDate fechaVisit, double peso, boolean estado) {
        this.idVisita = idVisita;
        this.idMascota = idMascota;
        this.idtrat = idtrat;
        this.fechaVisit = fechaVisit;
        this.peso = peso;
        this.estado = estado;
    }

    public VisitaMascotas(int idMascota, int idtrat, LocalDate fechaVisit, double peso, boolean estado) {
        this.idMascota = idMascota;
        this.idtrat = idtrat;
        this.fechaVisit = fechaVisit;
        this.peso = peso;
        this.estado = estado;
    }

    public VisitaMascotas() {
    }   
    
}
