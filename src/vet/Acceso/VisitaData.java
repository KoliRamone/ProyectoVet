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
import java.util.List;
import javax.swing.JOptionPane;
import vet.Entidades.Mascotas;
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
    
     public List<VisitaMascotas> listarVisitas() {
        List<VisitaMascotas> vm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM visitamacostas WHERE estado = 1 ";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    VisitaMascotas visitas = new VisitaMascotas();
                    
                   visitas.setIdVisita(rs.getInt("idVisita"));
                   visitas.setIdMascota(rs.getInt("idMascota"));
                   visitas.setFechaVisit(rs.getDate("fechaVisita").toLocalDate());
                   visitas.setPeso(rs.getDouble("peso"));
                   visitas.setDescripcion(rs.getString("Descripcion"));
                   visitas.setIdtrat(rs.getInt("idTrat"));
                   visitas.setEstado(rs.getBoolean("estado"));
                   visitas.setEnfermedad(rs.getBoolean("enfermedad"));
                   
                
                    vm.add(visitas);
                }
                ps.close();
                
            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return vm;
    }
    
     public List<VisitaMascotas> listarVisitasPorMascotas(int id,int idTrat) {
        List<VisitaMascotas> visitas= new ArrayList<>();
         boolean entro=false;
            String sql = "SELECT * FROM visitamacostas WHERE estado=1 AND idMascota=? AND idTrat=?";
          try{  
              PreparedStatement ps = con.prepareStatement(sql);
                
                   ps.setInt(1,id);
                   ps.setInt(2, idTrat);
                 ResultSet rs = ps.executeQuery();
                
                    
                while (rs.next()) {
                    
                    VisitaMascotas vi = new VisitaMascotas();
                    entro=true;
                   vi.setIdVisita(rs.getInt("idVisita"));
                   vi.setIdMascota(rs.getInt("idMascota"));
                   vi.setFechaVisit(rs.getDate("fechaVisita").toLocalDate());
                   vi.setPeso(rs.getDouble("peso"));
                   vi.setDescripcion(rs.getString("Descripcion"));
                   vi.setIdtrat(rs.getInt("idTrat"));
                   vi.setEstado(rs.getBoolean("estado"));
                   vi.setEnfermedad(rs.getBoolean("enfermedad"));
                    
                    visitas.add(vi);
                }
                ps.close();
             if(entro==false){JOptionPane.showMessageDialog(null, "no existe la mascota");}
                       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return visitas;
    }
    
    public List<VisitaMascotas> listarVisitasPorTrat(int idTrat) {
        List<VisitaMascotas> visitas= new ArrayList<>();
         boolean entro=false;
            String sql = "SELECT * FROM visitamacostas WHERE estado=1 AND idTrat=?";
          try{  
              PreparedStatement ps = con.prepareStatement(sql);
                
                   
                   ps.setInt(1, idTrat);
                 ResultSet rs = ps.executeQuery();
                
                    
                while (rs.next()) {
                    
                    VisitaMascotas vi = new VisitaMascotas();
                    entro=true;
                   vi.setIdVisita(rs.getInt("idVisita"));
                   vi.setIdMascota(rs.getInt("idMascota"));
                   vi.setFechaVisit(rs.getDate("fechaVisita").toLocalDate());
                   vi.setPeso(rs.getDouble("peso"));
                   vi.setDescripcion(rs.getString("Descripcion"));
                   vi.setIdtrat(rs.getInt("idTrat"));
                   vi.setEstado(rs.getBoolean("estado"));
                   vi.setEnfermedad(rs.getBoolean("enfermedad"));
                    
                    visitas.add(vi);
                }
                ps.close();
             if(entro==false){JOptionPane.showMessageDialog(null, "no existe la mascota");}
                       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return visitas;
}

public List<VisitaMascotas> listarVisitasPorMascotas2(int id) {
        List<VisitaMascotas> visitas= new ArrayList<>();
         boolean entro=false;
            String sql = "SELECT * FROM visitamacostas WHERE estado=1 AND idMascota=?";
          try{  
              PreparedStatement ps = con.prepareStatement(sql);
                
                   ps.setInt(1,id);
                   
                 ResultSet rs = ps.executeQuery();
                
                    
                while (rs.next()) {
                    
                    VisitaMascotas vi = new VisitaMascotas();
                    entro=true;
                   vi.setIdVisita(rs.getInt("idVisita"));
                   vi.setIdMascota(rs.getInt("idMascota"));
                   vi.setFechaVisit(rs.getDate("fechaVisita").toLocalDate());
                   vi.setPeso(rs.getDouble("peso"));
                   vi.setDescripcion(rs.getString("Descripcion"));
                   vi.setIdtrat(rs.getInt("idTrat"));
                   vi.setEstado(rs.getBoolean("estado"));
                   vi.setEnfermedad(rs.getBoolean("enfermedad"));
                    
                    visitas.add(vi);
                }
                ps.close();
             if(entro==false){JOptionPane.showMessageDialog(null, "no existe la mascota");}
                       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return visitas;











}



public double listarPromedioPeso(int id) {
       
         boolean entro=false;
         double promedio=0;
         double peso=0;
         int contador=0;
            String sql = "SELECT * FROM visitamacostas WHERE estado=1 AND idMascota=?";
          try{  
              PreparedStatement ps = con.prepareStatement(sql);
                
                   ps.setInt(1,id);
                   
                 ResultSet rs = ps.executeQuery();
                
                    
                while (rs.next()) {
                    
                    VisitaMascotas vi = new VisitaMascotas();
                    entro=true;
                  
                   vi.setPeso(rs.getDouble("peso"));
                  
                 
                   contador++;
                   peso=vi.getPeso() +peso;
                   if(contador>0){
                   promedio= peso/contador;
                     
                   }
                    
                }
                ps.close();
             if(entro==false){JOptionPane.showMessageDialog(null, "no existe la mascota");}
                       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return promedio;











}




public double listarPesoActual(int id) {
       
        
         double peso=0;
         boolean entro=false;
            String sql = "SELECT * FROM visitamacostas WHERE estado=1 AND idMascota=?";
          try{  
              PreparedStatement ps = con.prepareStatement(sql);
                
                   ps.setInt(1,id);
                   
                 ResultSet rs = ps.executeQuery();
                
                    
                while (rs.next()) {
                    
                    VisitaMascotas vi = new VisitaMascotas();
                    entro=true;
                  
                 vi.setPeso(rs.getDouble("peso"));
                 peso=vi.getPeso();
                 
                 
                    
                }
                ps.close();
             if(entro==false){JOptionPane.showMessageDialog(null, "no existe la mascota");}
                       
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mascota "+ex.getMessage());
        }
        return peso;











}













}
