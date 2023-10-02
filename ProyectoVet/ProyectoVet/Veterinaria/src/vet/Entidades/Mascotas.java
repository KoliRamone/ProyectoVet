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
public class Mascotas {
    private int idMascota;
    private String alias;
    private String sexo;
    private String raza;
    private LocalDate fechaNac;
    private String pelaje;
    private int idCliente;
    private boolean estado;

    public Mascotas(int idMascota, String alias, String sexo, String raza, LocalDate fechaNac, String pelaje, int idCliente) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.pelaje = pelaje;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public Mascotas(String alias, String sexo, String raza, LocalDate fechaNac, String pelaje, int idCliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.pelaje = pelaje;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public Mascotas() {
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
   @Override
    public String toString() {
        return   idMascota +"-" + alias + "," + fechaNac + "-" + idCliente ;
    }
    
    
    
    
    
    
    
    
}
