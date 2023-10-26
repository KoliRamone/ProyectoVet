/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vet.Acceso.MascotaData;
import vet.Acceso.TratamientoData;
import vet.Acceso.VisitaData;
import vet.Entidades.Mascotas;
import vet.Entidades.Tratamiento;
import vet.Entidades.VisitaMascotas;

/**
 *
 * @author Exon
 */
public class VVisitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Visitas
     */
    Mascotas mas;
    Tratamiento trat;
    ArrayList<Tratamiento> listtrat;
    ArrayList<Mascotas>    listmas;
    TratamientoData tratdat;
    MascotaData  masdat;
    VisitaMascotas vm;
    VisitaData vd;
    
FondoPanel fondo = new FondoPanel();
    
    
    public VVisitas() {
        mas=new Mascotas();
        trat=new Tratamiento();
        tratdat=new TratamientoData();
        masdat=new MascotaData();
        vm=new VisitaMascotas();
        vd=new VisitaData();
        
        listtrat=(ArrayList) tratdat.obtenerTratamientos();
        listmas=(ArrayList) masdat.listarMascotas();
        this.setContentPane(fondo);
        initComponents();
        cargarComboM();
        cargarComboT();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboM = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboT = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioPato = new javax.swing.JRadioButton();
        jBNueva = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 115, 133));

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnSalir.png"))); // NOI18N
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BannerVetvisita.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(216, 227, 240));
        jLabel3.setText("Id Mascota:");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(216, 227, 240));
        jLabel4.setText("Tipo de Tratamiento:");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(216, 227, 240));
        jLabel5.setText("Peso:");

        jTextPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPesoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(216, 227, 240));
        jLabel6.setText("Detalle visita:");

        jLabel7.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(216, 227, 240));
        jLabel7.setText("Requiere Seguimiento");

        jRadioPato.setBackground(new java.awt.Color(0, 115, 133));

        jBNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnNuevo.png"))); // NOI18N
        jBNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnGuardar.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioPato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboT, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboM, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBsalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNueva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBguardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)
                                .addGap(18, 70, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioPato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(jBsalir)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaActionPerformed
          
            jComboM.setSelectedIndex(-1);
            jTextPeso.setText("");
            jTextArea.setText("");
            jRadioPato.setSelected(false);
            jComboT.setSelectedIndex(-1);
            
            




        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevaActionPerformed

    private void jTextPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPesoKeyTyped
        // TODO add your handling code here:
         if(Character.isLetter(evt.getKeyChar())){
        evt.consume();
        }
        if(evt.getKeyChar()==KeyEvent.VK_SPACE){
        evt.consume();
        
        
    }//GEN-LAST:event_jTextPesoKeyTyped
    }
    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        trat=(Tratamiento)jComboT.getSelectedItem();
         int respuesta = JOptionPane.showOptionDialog(null, "El importe a abonar es de: "+trat.getImporte(), "Visita Finalizada", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Pagar", "Cancelar"}, "Cancelar");
        
        if (respuesta == JOptionPane.YES_OPTION) {
            
                   
              try{
              mas=(Mascotas)jComboM.getSelectedItem();
              trat=(Tratamiento) jComboT.getSelectedItem();
              double peso=Double.parseDouble(jTextPeso.getText());
              String des=jTextArea.getText();
              boolean patologia=jRadioPato.isSelected();
              LocalDate fechaVisita= LocalDate.now();
              vm=new VisitaMascotas(mas.getIdMascota(), trat.getIdTrat(), fechaVisita, peso, true, patologia,des);
              
              vd.guardarVisita(vm);
               
        
        
        
        }catch(NullPointerException b){
            JOptionPane.showMessageDialog(null, "falta completar campos");
        
        
        }
             
             
             
             
             
             
             
            
        } else if (respuesta == JOptionPane.NO_OPTION) {
            
        }
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_jBguardarActionPerformed
    

      private void cargarComboM(){
   
         jComboM.removeAllItems();
     listmas=(ArrayList) masdat.listarMascotas();
    for(Mascotas m:listmas){
    jComboM.addItem(m);
    
    }
        jComboM.setSelectedIndex(-1);
       
    
    }
    
    
      private void cargarComboT(){
   
         jComboT.removeAllItems();
     listtrat=(ArrayList) tratdat.obtenerTratamientos();
    for(Tratamiento t:listtrat){
    jComboT.addItem(t);
    
    }
        jComboT.setSelectedIndex(-1);
       
    
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
    private javax.swing.JButton jBNueva;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Mascotas> jComboM;
    private javax.swing.JComboBox<Tratamiento> jComboT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioPato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextPeso;
    // End of variables declaration//GEN-END:variables
}
