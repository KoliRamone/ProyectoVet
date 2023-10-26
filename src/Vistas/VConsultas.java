/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import vet.Acceso.*;
import vet.Entidades.*;

/**
 *
 * @author Exon
 */
public class VConsultas extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla;
    private ClienteData cd;
    private MascotaData md;
    private TratamientoData td;
    private VisitaData vd;
   
    private Clientes cl;
    private Mascotas m;
    private Tratamiento t;
    private VisitaMascotas vm;
    
    private ArrayList<Clientes> acl=new ArrayList<>();
    private ArrayList<Mascotas> am=new ArrayList<>();
    private ArrayList<VisitaMascotas> avm=new ArrayList<>();
    private ArrayList<Tratamiento> atrat=new ArrayList<>();
    private ArrayList<Tratamiento> atratfija=new ArrayList<>();
    FondoPanel fondo = new FondoPanel();
    
    
    
    public VConsultas() {
        tabla=new DefaultTableModel();
        cd=new ClienteData();
        md=new MascotaData();
        td=new TratamientoData();
        vd=new VisitaData();
        this.setContentPane(fondo);
        initComponents();
        armarCabeceraCL();
        cargarCombo();
          jLabelTrat.setText("Seleccione un Tratamiento");
    }
 private void cargarCombo(){
   
         jComboT.removeAllItems();
     atratfija=(ArrayList) td.obtenerTratamientos();
    for(Tratamiento t:atratfija){
    jComboT.addItem(t);
    
    }
        jComboT.setSelectedIndex(-1);
       
    
    }
    
     private void armarCabeceraCL(){
     cleanFilaTabla();
    ArrayList<Object> filacabecera=new ArrayList<>();
    filacabecera.add("ID");
    filacabecera.add("DNI");
    filacabecera.add("Apellido");
    filacabecera.add("Nombre");
    filacabecera.add("Dirección");
    filacabecera.add("Teléfono");
    filacabecera.add("Contacto Alternativo");
    filacabecera.add("Teléfono Alt");
    
    
    for(Object it:filacabecera){
    tabla.addColumn(it);
    
    
    }
    jTabla.setModel(tabla);
    
   
   
   }
    
      private void armarCabeceraMA(){
   cleanFilaTabla();
    ArrayList<Object> filacabecera=new ArrayList<>();
    filacabecera.add("ID");
    filacabecera.add("Alias");
    filacabecera.add("Sexo");
    filacabecera.add("Especie");
    filacabecera.add("Raza");
    filacabecera.add("Pelaje");
    filacabecera.add("Fecha de Nacimiento");
    filacabecera.add("CLiente");
    
    
    for(Object it:filacabecera){
    tabla.addColumn(it);
    
    
    }
    jTabla.setModel(tabla);
    
   
   
   }
      
      
       private void armarCabeceraVI(){
   cleanFilaTabla();
    ArrayList<Object> filacabecera=new ArrayList<>();
    filacabecera.add("ID");
    filacabecera.add("Mascota");
    filacabecera.add("Fecha de visita");
    filacabecera.add("Peso");
    filacabecera.add("Descripción");
    filacabecera.add("Tratamiento");
    filacabecera.add("Enfermedad");
    
    
    
    for(Object it:filacabecera){
    tabla.addColumn(it);
    
    
    }
    jTabla.setModel(tabla);
    
   
   
   }
    
       private void cleanFilaTabla(){
      tabla.setColumnCount(0);
      int indice=tabla.getRowCount()-1;
      
      for (int i=indice;i>=0;i--){
      
      tabla.removeRow(i);
      }
        
    }
        private void armarCabeceraTRA(){
        cleanFilaTabla();
    ArrayList<Object> filacabecera=new ArrayList<>();
    filacabecera.add("ID");
    filacabecera.add("Tipo de tratamiento");
    filacabecera.add("Descripción");
    filacabecera.add("Importe");
   
    
    
    for(Object it:filacabecera){
    tabla.addColumn(it);
    
    
    }
    jTabla.setModel(tabla);
    
   
   
   }
    
        
       

        
        
        
        
        
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBmascotas = new javax.swing.JButton();
        jBtrat = new javax.swing.JButton();
        jBvisitas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextIDCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIDM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboT = new javax.swing.JComboBox<>();
        jLabelTrat = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelPesoA = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 115, 133));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnSalir.png"))); // NOI18N
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBclientes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBclientes.setText("Clientes");
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });

        jBmascotas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBmascotas.setText("Mascotas");
        jBmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmascotasActionPerformed(evt);
            }
        });

        jBtrat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBtrat.setText("Tratamientos");
        jBtrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtratActionPerformed(evt);
            }
        });

        jBvisitas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBvisitas.setText("Visitas");
        jBvisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisitasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BannerVetConsul.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese id de cliente:");

        jTextIDCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIDClienteKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese id de Mascota:");

        jTextIDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIDMKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione tipo de tratamiento:");

        jLabelTrat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTrat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTrat.setText("jLabel5");

        jLabelPeso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPeso.setText("Peso Promedio:");

        jLabelPesoA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPesoA.setText("Peso Actual:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBclientes)
                        .addGap(33, 33, 33)
                        .addComponent(jBmascotas)
                        .addGap(31, 31, 31)
                        .addComponent(jBvisitas)
                        .addGap(34, 34, 34)
                        .addComponent(jBtrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIDM, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelPesoA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextIDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelPesoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTrat)
                    .addComponent(jLabelPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBsalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBmascotas)
                        .addComponent(jBclientes)
                        .addComponent(jBvisitas)
                        .addComponent(jBtrat)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        jTextIDM.setText("");
        cleanFilaTabla();
        armarCabeceraCL();
       
        try{ 
        int id=Integer.parseInt(jTextIDCliente.getText());
        cl=new Clientes();
       
        
        
            cl=cd.buscarCliente(id);
        tabla.addRow(new Object[] {cl.getIdCliente(),cl.getDni(),cl.getApellido(),cl.getNombre(),cl.getDire(),cl.getTel(),cl.getNombreAlt(),cl.getTelAlt()});
             jLabelTrat.setText("Cliente "+cl.getNombre());
              jTextIDM.setText("");
                jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
        }catch(NumberFormatException n){
         acl=(ArrayList) cd.listarClientes();
         jLabelTrat.setText("Lista de Clientes");
          jTextIDM.setText("");
            jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
         for(Clientes c: acl){
           tabla.addRow(new Object [] {c.getIdCliente(), c.getDni(), c.getApellido(),c.getNombre(),c.getDire(),c.getTel(),c.getNombreAlt(),c.getTelAlt()});
       }
       }catch(NullPointerException nu){
         acl=(ArrayList) cd.listarClientes();
         jLabelTrat.setText("Lista de Clientes");
          jTextIDM.setText("");
            jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
         for(Clientes c: acl){
           tabla.addRow(new Object [] {c.getIdCliente(), c.getDni(), c.getApellido(),c.getNombre(),c.getDire(),c.getTel(),c.getNombreAlt(),c.getTelAlt()});
       }
    
       } 
        
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmascotasActionPerformed
        jTextIDM.setText("");
        cleanFilaTabla();
        armarCabeceraMA();
        
         try{ 
        int id=Integer.parseInt(jTextIDCliente.getText());
         
        
               
        am=(ArrayList) md.listarMascotasPorCliente(id);
             System.out.println(am);
             boolean b = am.isEmpty();  // comprobar que el objeto este vacio
        if(b==false){
         for(Mascotas mas: am){
            tabla.addRow(new Object [] {mas.getIdMascota(), mas.getAlias(), mas.getSexo(),mas.getEspecie(),mas.getRaza(),mas.getPelaje(),mas.getFechaNac(),mas.getIdCliente()});
             jLabelTrat.setText("Mascota "+mas.getAlias());
              jTextIDM.setText("");
                jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
         }
        }else{  am=(ArrayList) md.listarMascotas();
        jLabelTrat.setText("Lista de Mascotas");
         jTextIDM.setText("");
           jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
        for(Mascotas mas: am){
            tabla.addRow(new Object [] {mas.getIdMascota(), mas.getAlias(), mas.getSexo(),mas.getEspecie(),mas.getRaza(),mas.getPelaje(),mas.getFechaNac(),mas.getIdCliente()});
        }}
         }catch(NullPointerException | NumberFormatException nu){
          am=(ArrayList) md.listarMascotas();
           jLabelTrat.setText("Lista de Mascotas");
            jTextIDM.setText("");
              jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
         for(Mascotas mas: am){
            tabla.addRow(new Object [] {mas.getIdMascota(), mas.getAlias(), mas.getSexo(),mas.getEspecie(),mas.getRaza(),mas.getPelaje(),mas.getFechaNac(),mas.getIdCliente()});
        }
         
         }
    }//GEN-LAST:event_jBmascotasActionPerformed

    private void jBvisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisitasActionPerformed
         cleanFilaTabla();
        armarCabeceraVI();
    
        if(!jTextIDM.getText().equalsIgnoreCase("") && jComboT.getSelectedIndex()!=-1){
       
             t=new Tratamiento();
             t=(Tratamiento) jComboT.getSelectedItem();
             int id=Integer.parseInt(jTextIDM.getText());
            
             if(jComboT.getSelectedIndex()==-1){
              jLabelTrat.setText("Seleccione un Tratamiento Para Buscar");
             }else{ jLabelTrat.setText(t.getTipoTrat());}
         
              avm=(ArrayList) vd.listarVisitasPorMascotas(id,t.getIdTrat());
              boolean b=avm.isEmpty();
              jLabelPeso.setText("Peso Promedio: "+vd.listarPromedioPeso(Integer.parseInt(jTextIDM.getText()))+" "+"KG");
              jLabelPesoA.setText("Peso Actual: "+String.valueOf(vd.listarPesoActual(Integer.parseInt(jTextIDM.getText())))+" KG");
        
               jTextIDM.setText("");
                jComboT.setSelectedIndex(-1); 
         if(b==false){
              jTextIDM.setText("");
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }
         }else{
              jTextIDM.setText("");
          avm=(ArrayList) vd.listarVisitas();
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }}
         
         
         
         }else if(jTextIDM.getText().equalsIgnoreCase("") && jComboT.getSelectedIndex()!=-1){
          t=new Tratamiento();
          t=(Tratamiento) jComboT.getSelectedItem();
          avm=(ArrayList) vd.listarVisitasPorTrat(t.getIdTrat());
          boolean b=avm.isEmpty();
          if(jComboT.getSelectedIndex()==-1){
              jLabelTrat.setText("Seleccione un Tratamiento");
               jTextIDM.setText("");
             }else{ jLabelTrat.setText(t.getTipoTrat());}
          jComboT.setSelectedIndex(-1);
          if(b==false){
              jTextIDM.setText("");
              jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
        
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }
         }else{
               jTextIDM.setText("");
                jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
        
          avm=(ArrayList) vd.listarVisitas();
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }}
          
          
          
          
          
          }else if(!jTextIDM.getText().equalsIgnoreCase("") && jComboT.getSelectedIndex()==-1){
         
          avm=(ArrayList) vd.listarVisitasPorMascotas2(Integer.parseInt(jTextIDM.getText()));
          m=new Mascotas();
          m= md.buscarMascota(Integer.parseInt(jTextIDM.getText()));
          boolean b=avm.isEmpty();
         jLabelPeso.setText("Peso Promedio: "+vd.listarPromedioPeso(Integer.parseInt(jTextIDM.getText()))+" "+"KG");
         jLabelPesoA.setText("Peso Actual: "+String.valueOf(vd.listarPesoActual(Integer.parseInt(jTextIDM.getText())))+" KG");
         if(jComboT.getSelectedIndex()==-1){
            //   jTextIDM.setText("");
             }else{ jLabelTrat.setText(t.getTipoTrat());}
         jComboT.setSelectedIndex(-1);
                 
         if(b==false){
              
             jLabelTrat.setText("Visitas de "+m.getAlias());
              jLabelPeso.setText("Peso Promedio: "+vd.listarPromedioPeso(Integer.parseInt(jTextIDM.getText()))+" "+"KG");
         jLabelPesoA.setText("Peso Actual: "+String.valueOf(vd.listarPesoActual(Integer.parseInt(jTextIDM.getText())))+" KG");
        jTextIDM.setText("");
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }
         }else{
             
                jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
          avm=(ArrayList) vd.listarVisitas();
           jTextIDM.setText("");
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
       
          }
                 }
             
             
    
        
                 }else{
               jTextIDM.setText("");
           avm=(ArrayList) vd.listarVisitas();
         boolean b=avm.isEmpty();
         if(jComboT.getSelectedIndex()==-1){
              jLabelTrat.setText("Seleccione un Tratamiento");
             }else{ jLabelTrat.setText(t.getTipoTrat());}
              jComboT.setSelectedIndex(-1);   
         if(b==false){
              jTextIDM.setText("");
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }
         }else{
              jTextIDM.setText("");
                jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
          avm=(ArrayList) vd.listarVisitas();
          for(VisitaMascotas visit: avm){
            tabla.addRow(new Object [] {visit.getIdVisita(),visit.getIdMascota(),visit.getFechaVisit(),visit.getPeso(),visit.getDescripcion(),visit.getIdtrat(),visit.isEnfermedad()});
        }
                 }
          
          
          
          
          }
            
    }//GEN-LAST:event_jBvisitasActionPerformed

    private void jBtratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtratActionPerformed
         jTextIDM.setText("");       
        cleanFilaTabla();
        armarCabeceraTRA();
        atrat=(ArrayList) td.obtenerTratamientos();
         jLabelTrat.setText("Lista de Tratamientos");
           jLabelPeso.setText("Peso Promedio: ");
              jLabelPesoA.setText("Peso Actual: ");
         for(Tratamiento tt: atrat){
            tabla.addRow(new Object [] {tt.getIdTrat(),tt.getTipoTrat(),tt.getDescripcion(),tt.getImporte()});
        }
        
        
    }//GEN-LAST:event_jBtratActionPerformed

    private void jTextIDClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIDClienteKeyTyped
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar())){
        evt.consume();
        }
        if(evt.getKeyChar()==KeyEvent.VK_SPACE){
        evt.consume();
    }//GEN-LAST:event_jTextIDClienteKeyTyped
    }
    private void jTextIDMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIDMKeyTyped
        // TODO add your handling code here:
         if(Character.isLetter(evt.getKeyChar())){
        evt.consume();
        }
        if(evt.getKeyChar()==KeyEvent.VK_SPACE){
        evt.consume();
    }//GEN-LAST:event_jTextIDMKeyTyped
    }
     class FondoPanel extends JPanel{
        private Image Imagen;
      
        @Override
        public void paint (Graphics g){
            Image imagen = new ImageIcon(getClass().getResource("/imagen/Fondo1.png")).getImage();
            
             g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBmascotas;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBtrat;
    private javax.swing.JButton jBvisitas;
    private javax.swing.JComboBox<Tratamiento> jComboT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelPesoA;
    private javax.swing.JLabel jLabelTrat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTextIDCliente;
    private javax.swing.JTextField jTextIDM;
    // End of variables declaration//GEN-END:variables
}
