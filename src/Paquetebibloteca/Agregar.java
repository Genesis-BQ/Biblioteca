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
public class Agregar extends javax.swing.JFrame {
    public final String Libro = "Libros.txt";

    /**
     * Creates new form Agregar
     */
    public Agregar() {
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

        jlbTitulo5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlbNombre = new javax.swing.JLabel();
        jlbAutor = new javax.swing.JLabel();
        jlbEdicion = new javax.swing.JLabel();
        jlbEditorial = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdicion = new javax.swing.JTextField();
        jTextFieldEditorial = new javax.swing.JTextField();
        jlbTipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jblCopia = new javax.swing.JLabel();
        jTextFieldCopia = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        jblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitulo5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbTitulo5.setText("  Registrar Libro");
        getContentPane().add(jlbTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolar", "Colegial", "Universitario", "Literatura", "Entretenimiento" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jlbNombre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbNombre.setText("Nombre:");
        getContentPane().add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jlbAutor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbAutor.setText("Autor:");
        getContentPane().add(jlbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jlbEdicion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbEdicion.setText("Edicion:");
        getContentPane().add(jlbEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jlbEditorial.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbEditorial.setText("Editorial:");
        getContentPane().add(jlbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jTextFieldNombre.setToolTipText("Ingrese Nombre");
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));

        jTextFieldEdicion.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jTextFieldEdicion.setToolTipText("Ingrese Edicion");
        getContentPane().add(jTextFieldEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        jTextFieldEditorial.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jTextFieldEditorial.setToolTipText("Ingrese Editorial");
        getContentPane().add(jTextFieldEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 130, -1));

        jlbTipo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbTipo.setText("Tipo");
        getContentPane().add(jlbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 90, 30));

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jblCopia.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jblCopia.setText("Numero Copia:");
        getContentPane().add(jblCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jTextFieldCopia.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        getContentPane().add(jTextFieldCopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 130, -1));

        jTextFieldAutor.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        getContentPane().add(jTextFieldAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 130, -1));

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelCodigo.setText("Codigo:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jTextFieldCodigo.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        getContentPane().add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 130, -1));

        Tabla.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Autor", "Edicion", "Editorial", "Numero Copia", "Codigo", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 610, 100));

        btnRegistrar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.png"))); // NOI18N
        jblFondo.setText("jLabel1");
        getContentPane().add(jblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Boton de registrar
        String nombre = jTextFieldNombre.getText().trim();
        String autor = jTextFieldAutor.getText().trim();
        String edicion = jTextFieldEdicion.getText().trim();
        String editorial = jTextFieldEditorial.getText().trim();
        String copia = jTextFieldCopia.getText().trim();
        String codigo = jTextFieldCodigo.getText().trim();
        String tipo = jComboBox1.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null,"Datos Guardados");
        
           try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(Libro, true));
            DataInputStream dis = new DataInputStream(new FileInputStream(Libro));
            intro(dos, nombre, autor, edicion, editorial, copia,codigo,tipo);

        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Boton para Salir
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton para Regresar a la ventana Libros
        dispose();
        new DatosLibros().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         // Boton para agregar datos
 DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        Object[] fila = new Object[7];
        fila[0] = jTextFieldNombre.getText();
        fila[1] = jTextFieldAutor.getText();
        fila[2] = jTextFieldEdicion.getText();
        fila[3] = jTextFieldEditorial.getText();
        fila[4] = jTextFieldCopia.getText();
        fila[5] = jTextFieldCodigo.getText();
        fila[6] = jComboBox1.getSelectedItem().toString();

        modelo.addRow(fila);
        Tabla.setModel(modelo);

        JOptionPane.showMessageDialog(null, "Datos Registrados");
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCopia;
    private javax.swing.JTextField jTextFieldEdicion;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel jblCopia;
    private javax.swing.JLabel jblFondo;
    private javax.swing.JLabel jlbAutor;
    private javax.swing.JLabel jlbEdicion;
    private javax.swing.JLabel jlbEditorial;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbTitulo5;
    // End of variables declaration//GEN-END:variables
public static void intro(DataOutputStream dos, String nombre, String autor, String edicion, String editorial, String copia,String codigo,String tipo) throws IOException {
        dos.writeUTF(nombre + "\n");
        dos.writeUTF(autor + "\n");
        dos.writeUTF(edicion + "\n");
        dos.writeUTF(editorial + "\n");
        dos.writeUTF(copia + "\n");
        dos.writeUTF(codigo + "\n");
        dos.writeUTF(tipo + "\n");

    }
}
