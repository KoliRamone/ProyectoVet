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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vet.Entidades.Tratamiento;


public class TratamientoData {
    private Connection con=null;
    
    public TratamientoData() {
        
       con=Conexion.getConexion();
    }        
 
    public void guardarTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO tratamiento(tipoTrat, descripcion, importe, estado"
                + "VALUES (?,?,?,?))";
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
        String sql= "UPDATE tratamiento SET tipoTrat=?, descripcion=?, importe=?, estado=? WHERE idTratamiento";
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
        String sql= "SELECT tipoTrat, descripcion, importe, estado FROM tratamiento WHERE idTratamiento=?";
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
    
    
    
    
    
    
    
}
