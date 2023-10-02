/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet.Entidades;

/**
 *
 * @author ev978
 * 
 * 
 * tratamientos: Vacunación, Enfermedad, Curaciones, Baño, corte de pelo, Castración, ETC.
 * 
 * 
 */
public class Tratamiento {
    
    private int idTrat;
    private String descripcion;
    private String tipoTrat;
    private boolean estado;
    private double importe;

    public Tratamiento(int idTrat, String descripcion, String tipoTrat, boolean estado, double importe) {
        this.idTrat = idTrat;
        this.descripcion = descripcion;
        this.tipoTrat = tipoTrat;
        this.estado = estado;
        this.importe = importe;
    }

    public Tratamiento(String descripcion, String tipoTrat, boolean estado, double importe) {
        this.descripcion = descripcion;
        this.tipoTrat = tipoTrat;
        this.estado = estado;
        this.importe = importe;
    }

    public Tratamiento() {
    }

    public int getIdTrat() {
        return idTrat;
    }

    public void setIdTrat(int idTrat) {
        this.idTrat = idTrat;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoTrat() {
        return tipoTrat;
    }

    public void setTipoTrat(String tipoTrat) {
        this.tipoTrat = tipoTrat;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
    
    
}
