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

/**
 *
 * @author ev978
 */
public class ClienteData {
     private Connection con=null;
            
    public ClienteData (){
        
        con=Conexion.getConexion();
    }
    //comentar
    
    @SuppressWarnings("ConvertToTryWithResources")
    public void guardarCliente(Clientes cliente){
        String sql="INSERT INTO cliente(dni, apellido, nombre,dirección,telefono,nombreAlt,telefonoAlt, estado)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,cliente.getDni());
                ps.setString(2,cliente.getApellido());
                ps.setString(3,cliente.getNombre());
                ps.setString(4,cliente.getDire());
                ps.setInt(5, cliente.getTel());
                ps.setString(6, cliente.getNombreAlt());
                ps.setInt(7,cliente.getTelAlt());
                ps.setBoolean(8,cliente.isEstado());
                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();
                if (rs.next()){
                    cliente.setIdCliente(rs.getInt(1));
                    JOptionPane.showMessageDialog(null,"Cliente guardado exitosamente");
                }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"El Cliente ya existe"); 
        }
    }
  
    public void modificarCliente(Clientes cliente){
        String sql = "UPDATE cliente SET dni = ? , apellido = ?, nombre = ?, dirección = ?, telefono=?, nombreAlt=?,telefonoAlt=?,estado=? ";
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement ps = null;
        try{
                ps=con.prepareStatement(sql);
                ps.setInt(1,cliente.getDni());
                ps.setString(2,cliente.getApellido());
                ps.setString(3,cliente.getNombre());
                ps.setString(4,cliente.getDire());
                ps.setInt(5, cliente.getTel());
                ps.setString(6, cliente.getNombreAlt());
                ps.setInt(7,cliente.getTelAlt());
                ps.setBoolean(8,cliente.isEstado());
                
                
               int exito = ps.executeUpdate();
               if (exito == 1) {
                   JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
               }
               else {
                   JOptionPane.showMessageDialog(null, "El cliente no se modificó");
               }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente "+ex.getMessage());
               }
    }
  
    public void eliminarCliente(int id) {
        
        try {
            String sql = "UPDATE cliente SET estado = 0 WHERE idCliente = ? ";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                int exito=ps.executeUpdate();
                
                if(exito==1){
                    JOptionPane.showMessageDialog(null, " Se elimina el cliente.");
                }
            ps.close();
            }
            }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de Clientes");
        }
    }
    
    public Clientes buscarCliente(int id) {
        Clientes cliente = null;
        String sql = "SELECT dni, apellido, nombre,dirección, telefono, nombreAlt, telefonoAlt FROM cliente WHERE idCliente = ?";
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                cliente=new Clientes();
                cliente.setIdCliente(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDire(rs.getString("dirección"));
                cliente.setTel(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setTelAlt(rs.getInt("telefonoAlt"));
            
                
                cliente.setEstado(true);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
            }
            ps.close();
        }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente "+ex.getMessage());
                    }
            return cliente;
        
    }
     
    public Clientes buscarClientePorDni(int dni) {
        Clientes cliente = null;
        String sql = "SELECT idCliente, dni, apellido, nombre, dirección, telefono, nombreAlt, telefonoAlt ,estado FROM cliente WHERE dni=?";
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                cliente=new Clientes();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDire(rs.getString("dirección"));
                cliente.setTel(rs.getInt("telefono"));
                cliente.setNombreAlt(rs.getString("nombreAlt"));
                cliente.setTelAlt(rs.getInt("telefonoAlt"));
                  int a=rs.getInt("estado");
                    if(a==1){
                    cliente.setEstado(true);
                    }else if(a==0){cliente.setEstado(false);}
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
            } ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente "+ex.getMessage());
        }
        return cliente;
    }
    
    public List<Clientes> listarClientes() {
        List<Clientes> clientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cliente WHERE estado = 1 ";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Clientes cliente = new Clientes();
                    
                    cliente.setIdCliente(rs.getInt("idCliente"));
                    cliente.setDni(rs.getInt("dni"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setEstado(rs.getBoolean("estado"));
                    clientes.add(cliente);
                }
                ps.close();
                
            }            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cliente "+ex.getMessage());
        }
        return clientes;
    }   
}
