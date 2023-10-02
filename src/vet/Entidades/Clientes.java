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
public class Clientes {
    
    private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String dire;
    private int tel;
    private String nombreAlt;
    private int telAlt;
    private boolean estado;

    // Documento, Apellido, nombre, dirección, telefono y nombre persona Alt.
    public Clientes(int dni, String apellido, String nombre, String nombreAlt, String dire, int tel, int telAlt) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreAlt = nombreAlt;
        this.dire = dire;
        this.tel = tel;
        this.telAlt = telAlt;
        this.estado = estado;
    }

    public Clientes(int idCliente, int dni, String apellido, String nombre, String nombreAlt, String dire, int tel, int telAlt) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreAlt = nombreAlt;
        this.dire = dire;
        this.tel = tel;
        this.telAlt = telAlt;
        this.estado = estado;
    }

    public Clientes() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAlt() {
        return nombreAlt;
    }

    public void setNombreAlt(String nombreAlt) {
        this.nombreAlt = nombreAlt;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTelAlt() {
        return telAlt;
    }

    public void setTelAlt(int telAlt) {
        this.telAlt = telAlt;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
 @Override
    public String toString() {
        return   idCliente +"-" + apellido + "," + nombre + "-" +dni ;
    }
       
  


}
    