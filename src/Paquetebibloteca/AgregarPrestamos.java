/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetebibloteca;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Genesis
 */
public class AgregarPrestamos extends javax.swing.JFrame {
    
    public final String  Prestamos= "Prestamos.txt";
    

    /**
     * Creates new form AgregarPrestamos
     */
    public AgregarPrestamos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTipo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextFieldCopia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlbApellido = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jlbCopia = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldcodigo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jlbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTipo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbTipo.setText("Tipo:");
        getContentPane().add(jlbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 40, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolar", "Colegial", "Universitario", "Literatura", "Entretenimiento" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 140, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jTextFieldCopia.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jTextFieldCopia.setToolTipText("Ingrese Autor");
        getContentPane().add(jTextFieldCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 140, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Registrar Prestamo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 140, 20));

        jlbApellido.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbApellido.setText("Cedula:");
        getContentPane().add(jlbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextFieldCedula.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jTextFieldCedula.setToolTipText("Ingrese Apellido");
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 140, -1));

        jlbCopia.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbCopia.setText("Copia:");
        getContentPane().add(jlbCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelCodigo.setText("Codigo:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextFieldcodigo.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        getContentPane().add(jTextFieldcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        Tabla.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Codigo", "Copia", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 520, 90));

        jlbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.png"))); // NOI18N
        jlbFondo.setText("jLabel1");
        getContentPane().add(jlbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Boton para Salir
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Boton para Regresar a la ventana Prestamos
        dispose();
        new DatosPrestamo().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Boton de Guardar Datos
        String cedula = jTextFieldCedula.getText().trim();
        String copia = jTextFieldCopia.getText().trim();
        String codigo = jTextFieldcodigo.getText().trim();
        String tipo = jComboBox1.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null,"Datos Guardados");
        
           try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(Prestamos, true));
            DataInputStream dis = new DataInputStream(new FileInputStream(Prestamos));
            intro(dos, cedula,copia,codigo,tipo);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Boton para agregar datos
       DefaultTableModel modelo=(DefaultTableModel) Tabla.getModel();
         Object [] fila=new Object[4]; 
        fila[0]=jTextFieldCedula.getText(); 
        fila[1]=jTextFieldcodigo.getText(); 
        fila[2]=jTextFieldCopia.getText(); 
        fila[3]=jComboBox1.getSelectedItem().toString(); 
        
        
          modelo.addRow(fila); 
           Tabla.setModel(modelo); 
           
         JOptionPane.showMessageDialog(null,"Datos Registrados");
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCopia;
    private javax.swing.JTextField jTextFieldcodigo;
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbCopia;
    private javax.swing.JLabel jlbFondo;
    private javax.swing.JLabel jlbTipo;
    // End of variables declaration//GEN-END:variables
public static void intro(DataOutputStream dos, String cedula, String copia,String codigo,String tipo) throws IOException {
        dos.writeUTF(cedula + "\n");
        dos.writeUTF(copia + "\n");
        dos.writeUTF(codigo + "\n");
        dos.writeUTF(tipo + "\n");
      
    }
}
