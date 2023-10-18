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
import javax.swing.JOptionPane;
import vet.Entidades.Tratamiento;
import vet.Entidades.VisitaMascotas;



public class VisitaData {
    private Connection con=null;
    private VisitaMascotas vm=new VisitaMascotas();
    
    
    public VisitaData(){
        con=Conexion.getConexion();
        
    }

     public void guardarVisita(VisitaMascotas visita) {
        String sql = "INSERT INTO visitamacostas(idMascota, fechaVisita, peso,descripcion,idTrat, estado,Enfermedad) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getIdMascota());
            ps.setDate(2, Date.valueOf(visita.getFechaVisit()));
            ps.setDouble(3, visita.getPeso());
            ps.setString(4, visita.getDescripcion());
            ps.setInt(5, visita.getIdtrat());
            ps.setBoolean(6, true);
            ps.setBoolean(7, visita.isEnfermedad());
            
            
            int respuesta = JOptionPane.showOptionDialog(null, "¿Quieres guardar esta visita?"+"\n"+" Luego de guardarla quedara en la base de datos "+"\n"+" no podra modificarse", "ADVERTENCIA", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
        
            if (respuesta == JOptionPane.YES_OPTION) {
            
                     ps.executeUpdate();     
             
            
        } else if (respuesta == JOptionPane.NO_OPTION) {
            
        }
            
            
            
           
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                visita.setIdVisita(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Visita guardada");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de visitamascotas");
        }
        
    }
    
    
    
    
    
    
}
