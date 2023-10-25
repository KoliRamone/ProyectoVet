/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Exon
 */
public class Menu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jLabelPrincipal = new javax.swing.JLabel();
        jBclientes = new javax.swing.JButton();
        jBmascotas = new javax.swing.JButton();
        jBtratamientos = new javax.swing.JButton();
        jBvisitas = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/fondo.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jBconsultas = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 115, 133));

        jLabelPrincipal.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BannerVet.png"))); // NOI18N

        jBclientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnCliente.png"))); // NOI18N
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });

        jBmascotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBmascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnMascots.png"))); // NOI18N
        jBmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmascotasActionPerformed(evt);
            }
        });

        jBtratamientos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBtratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnTratam.png"))); // NOI18N
        jBtratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtratamientosActionPerformed(evt);
            }
        });

        jBvisitas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBvisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnVisita.png"))); // NOI18N
        jBvisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisitasActionPerformed(evt);
            }
        });

        escritorio.setPreferredSize(new java.awt.Dimension(720, 520));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jBconsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnConsulta.png"))); // NOI18N
        jBconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultasActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Botones y vistas JAVA/BnSalir.png"))); // NOI18N
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtratamientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBconsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBvisitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBmascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelPrincipal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelPrincipal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBclientes)
                        .addGap(18, 18, 18)
                        .addComponent(jBmascotas)
                        .addGap(18, 18, 18)
                        .addComponent(jBvisitas)
                        .addGap(18, 18, 18)
                        .addComponent(jBtratamientos)
                        .addGap(18, 18, 18)
                        .addComponent(jBconsultas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VClientes cl= new VClientes();
        cl.setVisible(true);
        escritorio.add(cl);
        escritorio.moveToFront(cl);
        cl.move(10, 0);
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBvisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisitasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VVisitas v= new VVisitas();
        v.setVisible(true);
        escritorio.add(v);
        escritorio.moveToFront(v);
        v.move(10, 0);
    }//GEN-LAST:event_jBvisitasActionPerformed

    private void jBmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmascotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VMascotas m= new VMascotas();
        m.setVisible(true);
        escritorio.add(m);
        escritorio.moveToFront(m);
        m.move(10, 0);
    }//GEN-LAST:event_jBmascotasActionPerformed

    private void jBtratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtratamientosActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VTratamientos t= new VTratamientos();
        t.setVisible(true);
        escritorio.add(t);
        escritorio.moveToFront(t);
        t.move(10, 0);
    }//GEN-LAST:event_jBtratamientosActionPerformed

    private void jBconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VConsultas vc= new VConsultas();
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
        vc.move(10, 0);
     
            
           
    }//GEN-LAST:event_jBconsultasActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
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
    private java.awt.Button button1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBconsultas;
    private javax.swing.JButton jBmascotas;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBtratamientos;
    private javax.swing.JButton jBvisitas;
    private javax.swing.JLabel jLabelPrincipal;
    // End of variables declaration//GEN-END:variables
}
