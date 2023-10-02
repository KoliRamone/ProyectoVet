/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet.Acceso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import vet.Entidades.Clientes;
import vet.Entidades.Mascotas;

/**
 *
 * @author ev978
 */
public class MascotaData {
     private Connection con=null;
            
    public MascotaData (){
        
        con=Conexion.getConexion();
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public void guardarMascota(Mascotas Mascota){
        String sql="INSERT INTO Mascota(Alias, Raza, Sexo, Pelaje, fechaNac, estado)"
                + "VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                
                ps.setString(1,Mascota.getAlias());
                ps.setString(2,Mascota.getRaza());
                ps.setString(3,Mascota.getSexo());
                ps.setString(4,Mascota.getPelaje());
                ps.setDate(5,Date.valueOf(Mascota.getFechaNac()));
                ps.setBoolean(6,Mascota.isEstado());
                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();
                if (rs.next()){
                    Mascota.setIdCliente(rs.getInt(1));
                    JOptionPane.showMessageDialog(null,"Mascota guardada exitosamente");
                }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"La mascota ya existe"); 
        }
    }
  
    public void modificarMascota(Mascotas Mascota){
        String sql = "UPDATE mascota SET Alias = ? , Raza = ?, Sexo = ?, Pelaje = ?,estado=?,fechaNac=? WHERE idMascota = ?";
        @SuppressWarnings("UnusedAssignment")
       PreparedStatement ps = null;
          try{
              
               ps = con.prepareStatement(sql);
               ps.setString(1, Mascota.getAlias());
               ps.setString(2, Mascota.getRaza());
               ps.setString(3, Mascota.getSexo());
               ps.setString(4, Mascota.getPelaje());
               ps.setDate(5, Date.valueOf(Mascota.getFechaNac()));
               ps.setBoolean(6, Mascota.isEstado());               
               ps.setInt(7, Mascota.getIdMascota());
               
               int exito = ps.executeUpdate();
               if (exito == 1) {
                   JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
               }
               else {
                   JOptionPane.showMessageDialog(null, "La mascota no existe");
               }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Mascota"+ex.getMessage());
               }
    }
  
    public void eliminarMascota(int id) {
        
        try {
            String sql = "UPDATE mascota SET estado = 0 WHERE idMascota = ? ";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                int fila=ps.executeUpdate();
                
                if(fila==1){
                    JOptionPane.showMessageDialog(null, " Mascota eliminada de la base de datos.");
                }
            ps.close();
            }
            }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de Mascotas");
        }
    }
    
    public Mascotas buscarMascota(int id) {
        Mascotas mascota = null;
        String sql = "SELECT Alias, Raza, Sexo,Pelaje,fechaNac FROM mascota WHERE idMascota = ?";
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mascota=new Mascotas();
                mascota.setIdMascota(id);
                mascota.setAlias(rs.getString("Alias"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setPelaje(rs.getString("pelaje"));                
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setEstado(true);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe la mascota");
            }
            ps.close();
        }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mascota "+ex.getMessage());
                    }
            return mascota;
        
    }
    
    public List<Mascotas> listarMascotas() {
        List<Mascotas> mascotas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mascota WHERE estado = 1 ";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Mascotas mascota = new Mascotas();
                    
                   mascota.setIdMascota(rs.getInt("idMascota"));
                   mascota.setAlias(rs.getString("Alias"));
                   mascota.setRaza(rs.getString("raza"));
                   mascota.setSexo(rs.getString("sexo"));
                   mascota.setPelaje(rs.getString("pelaje"));                
                   mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                   mascota.setEstado(true);
                    mascotas.add(mascota);
                }
                ps.close();
                
            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return mascotas;
    }

}
 