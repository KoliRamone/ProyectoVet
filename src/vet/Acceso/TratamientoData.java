/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet.Acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vet.Entidades.Mascotas;
import vet.Entidades.Tratamiento;


public class TratamientoData {
    private Connection con=null;
    private MascotaData md= new MascotaData();
    
    public TratamientoData() {
        
       con=Conexion.getConexion();
    }        
 
    public void guardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO tratamiento(tipoTrat, descripcion, importe, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tratamiento.getTipoTrat());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setBoolean(4, tratamiento.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                tratamiento.setIdTrat(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Tratamiento guardado");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de tratamientos");
        }
        
    }
    
    public void modificarTratamiento(Tratamiento tratamiento){
        String sql= "UPDATE tratamiento SET tipoTrat=?, descripcion=?, importe=?, estado=? WHERE idTrat=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, tratamiento.getTipoTrat());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setBoolean(4, tratamiento.isEstado());
            ps.setInt(5, tratamiento.getIdTrat());
            
            int exito= ps.executeUpdate();
              if (exito==1){
                  JOptionPane.showMessageDialog(null,"Tratamiento modificado");
              }
              else {
                  JOptionPane.showMessageDialog(null,"El tratamiento no existe");
              }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de tratamientos");
        }
        
    }
    
    public void eliminarTratamiento(int id){
        String sql= "UPDATE tratamiento SET estado=0 WHERE idTratamiento=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            
               if(exito==1){
                   JOptionPane.showMessageDialog(null,"Tratamiento eliminado");
               }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de tratamientos");
        }
        
    }
    
    public Tratamiento buscarTratamiento(int id){
        String sql= "SELECT tipoTrat, descripcion, importe, estado FROM tratamiento WHERE idTrat=?";
        Tratamiento tratamiento=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
               if (rs.next()){
                tratamiento= new Tratamiento();
                tratamiento.setIdTrat(id);
                tratamiento.setTipoTrat(rs.getString("tipoTrat"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setImporte(rs.getDouble("importe"));
                tratamiento.setEstado(true);
               }
               else {
                JOptionPane.showMessageDialog(null, "No existe el tratamiento");
               }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de tratamientos");
        }
        return tratamiento;
    }
    
    public List<Tratamiento>obtenerTratamientos(){
        ArrayList<Tratamiento> ok= new ArrayList<>();
        String sql= "SELECT * FROM tratamiento";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
             Tratamiento trat=new Tratamiento();
             trat.setIdTrat(rs.getInt("idTrat"));
             trat.setTipoTrat(rs.getString("tipoTrat"));
             trat.setDescripcion(rs.getString("descripcion"));
             trat.setImporte(rs.getDouble("importe"));
             ok.add(trat);
             }
        } catch (SQLException ex) {
             JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla de tratamiento");
        }
        return ok;
    }
    public List<Tratamiento> obtenerTratamientosPorMascota(int idMascota){
        ArrayList<Tratamiento> ok=new ArrayList<>();
        String sql="SELECT * FROM tratamiento WHERE idMascota = ?";
        try{ 
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
              Tratamiento trat=new Tratamiento();
              trat.setIdTrat(rs.getInt("idTratamiento"));
              Mascotas ms=md.buscarMascota(rs.getInt("idMascota"));
              ok.add(trat);
             }
        } catch (SQLException ex){
             JOptionPane.showConfirmDialog(null, "Error al acceder a la tabla de Tratamientos");
        }
        return ok;
    }   
}
