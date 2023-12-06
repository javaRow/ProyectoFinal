
package restaurat.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.InputMismatchException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinal.BaseDatos.MeseroData;
import proyectofinal.Tablas.Mesero;


public class AgregarMesero extends javax.swing.JInternalFrame {
private MeseroData meseData= new MeseroData();
private Mesero mesero=null;
    
    
    
    public AgregarMesero() {
        initComponents();
        this.setSize(795,600);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon  icon2=new ImageIcon(getClass().getResource("/Proyectofinal/recursos/abm2.png"));
        Image miImagen2=icon2.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen2,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTmesero = new javax.swing.JTextField();
        jBmodificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTidmesero = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTnuevoNombre = new javax.swing.JTextField();
        jBlimpiar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Mesero...");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTmesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmeseroActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesero Por ID");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar Nombre");

        jBlimpiar.setText("Limpiar Campos");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBeliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTmesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTidmesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnuevoNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBlimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTmesero, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jTidmesero)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jBbuscar)))
                        .addGap(16, 16, 16)))
                .addGap(64, 64, 64))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTidmesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTmesero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBguardar))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTmeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmeseroActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
   try {
        String nombre = jTmesero.getText(); // Obtén el nombre del campo de texto

        if (!nombre.isEmpty()) {
            // Validación: asegúrate de que el nombre solo contenga letras y espacios
            if (nombre.matches("^[a-zA-Z\\s]+$")) {
                Mesero nuevoMesero = new Mesero(); // Crea una nueva instancia de Mesero
                nuevoMesero.setNombre(nombre); // Establece el nombre del mesero

                meseData.agregarMesero(nuevoMesero); // Llama al método agregarMesero de tu MeseroData

                JOptionPane.showMessageDialog(null, "Mesero guardado con éxito.");
                 jTmesero.setText("");
                jTidmesero.setText("");
                 jTnuevoNombre.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre del mesero solo puede contener letras y espacios.");
                 jTmesero.setText("");
                    jTidmesero.setText("");
                     
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre del mesero no puede estar vacío.");
             jTmesero.requestFocus();
   
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar el mesero: " + ex.getMessage());
         jTmesero.setText("");
    jTidmesero.setText("");
   
    }
   
   
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        try {
        Integer id = Integer.parseInt(jTidmesero.getText());

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar a este mesero?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
         jTmesero.setText("");
          jTidmesero.setText("");
        jTnuevoNombre.setText("");
        if (confirmacion == JOptionPane.YES_OPTION) {
            Mesero mesero = meseData.buscarMesero(id);

            if (mesero != null) {
                meseData.eliminarMesero(id); // Supongamos que tienes un método para eliminar un mesero en tu clase meseData.
                JOptionPane.showMessageDialog(null, "Mesero eliminado con éxito.");
                 jTmesero.setText("");
                    jTidmesero.setText("");
                    jTnuevoNombre.setText("");
               
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el mesero con el ID proporcionado.");
                 
             jTidmesero.setText("");
   
             
   
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Ingrese un ID válido.");
        
    jTidmesero.setText("");
    
    }

     
        
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        dispose();
        
        
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
    try {
        Integer id = Integer.parseInt(jTidmesero.getText());
        String nuevoNombre = jTnuevoNombre.getText(); // Supongamos que tienes un campo de texto para el nuevo nombre.

        if (nuevoNombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nuevo nombre no puede estar vacío.");
                jTnuevoNombre.requestFocus();
                 
                
        } else {
            // Validación: asegúrate de que el nuevo nombre solo contenga letras y espacios
            if (nuevoNombre.matches("^[a-zA-Z\\s]+$")) {
                Mesero mesero = meseData.buscarMesero(id);

                if (mesero != null) {
                    mesero.setNombre(nuevoNombre);
                    meseData.actualizarMesero(mesero); // Supongamos que tienes un método para actualizar un mesero en tu clase meseData.
                    JOptionPane.showMessageDialog(null, "Mesero modificado con éxito.");
                     jTmesero.setText("");
                    jTidmesero.setText("");
                    jTnuevoNombre.setText("");
                   
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el mesero con el ID proporcionado.");
                    
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nuevo nombre solo puede contener letras y espacios.");               
                jTnuevoNombre.setText("");
                jTnuevoNombre.requestFocus();
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Ingrese un ID válido.");
         jTmesero.setText("");
            jTidmesero.setText("");
            jTnuevoNombre.setText("");
    }
        
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        try {
            Integer id = Integer.parseInt(jTidmesero.getText());
            mesero = meseData.buscarMesero(id);
            if (mesero != null) {
                jTmesero.setText(mesero.getNombre());

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, " Por favor, Ingrese Un ID valido");
            
             jTidmesero.setText("");
   
           
        }


    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        jTmesero.setText("");
    jTidmesero.setText("");
    jTnuevoNombre.setText("");
    }//GEN-LAST:event_jBlimpiarActionPerformed

    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTidmesero;
    private javax.swing.JTextField jTmesero;
    private javax.swing.JTextField jTnuevoNombre;
    // End of variables declaration//GEN-END:variables
}
