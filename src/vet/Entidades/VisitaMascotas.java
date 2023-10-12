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
    private boolean enfermedad;
    private String descripcion;

    public VisitaMascotas(int idVisita, int idMascota, int idtrat, LocalDate fechaVisit, double peso, boolean estado,boolean enfermedad,String descripcion) {
        this.idVisita = idVisita;
        this.idMascota = idMascota;
        this.idtrat = idtrat;
        this.fechaVisit = fechaVisit;
        this.peso = peso;
        this.estado = estado;
        this.enfermedad=enfermedad;
        this.descripcion=descripcion;
    }

    public VisitaMascotas(int idMascota, int idtrat, LocalDate fechaVisit, double peso, boolean estado,boolean enfermedad,String descripcion) {
        this.idMascota = idMascota;
        this.idtrat = idtrat;
        this.fechaVisit = fechaVisit;
        this.peso = peso;
        this.estado = estado;
        this.enfermedad=enfermedad;
        this.descripcion=descripcion;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    public VisitaMascotas() {
    }   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdtrat() {
        return idtrat;
    }

    public void setIdtrat(int idtrat) {
        this.idtrat = idtrat;
    }

    public LocalDate getFechaVisit() {
        return fechaVisit;
    }

    public void setFechaVisit(LocalDate fechaVisit) {
        this.fechaVisit = fechaVisit;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
