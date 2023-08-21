/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author federico.acenjo
 */
public class GestionProductos extends javax.swing.JInternalFrame {
    private DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    private boolean guardarNuevo = false;
    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
        crearItemComboBox();
        pruebaImgIcono();
        jBGuardar.disable();
        jBGuardar.setEnabled(false);
        jBEliminar.disable();
        jBEliminar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFDescripcion = new javax.swing.JTextField();
        jTFPrecio = new javax.swing.JTextField();
        jTFCodigo = new javax.swing.JTextField();
        jTFStock = new javax.swing.JTextField();
        jCBSeleccionRubro = new javax.swing.JComboBox<>();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBIconoBuscar = new javax.swing.JButton();
        jBModPrecio = new javax.swing.JButton();
        jBModStock = new javax.swing.JButton();

        setClosable(true);
        setTitle("GESTION DE PRODUCTOS");

        jLabel1.setFont(new java.awt.Font("David", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DE PRODUCTOS");

        jLabel2.setText("CODIGO");

        jLabel3.setText("DESCRIPCION");

        jLabel4.setText("PRECIO");

        jLabel5.setText("CATEGORIA");

        jLabel6.setText("STOCK");

        jTFStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFStockActionPerformed(evt);
            }
        });

        jCBSeleccionRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBIconoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej4/img/vecteezy_realistic-magnifying-glass-clip-art_9876398_646.png"))); // NOI18N
        jBIconoBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBIconoBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        jBIconoBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        jBIconoBuscar.setName(""); // NOI18N
        jBIconoBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        jBIconoBuscar.setRequestFocusEnabled(false);
        jBIconoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIconoBuscarActionPerformed(evt);
            }
        });

        jBModPrecio.setText("Modificar");
        jBModPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModPrecioActionPerformed(evt);
            }
        });

        jBModStock.setText("Modificar");
        jBModStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)
                        .addGap(31, 31, 31)
                        .addComponent(jBGuardar)
                        .addGap(34, 34, 34)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBModPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBModStock))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBSeleccionRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jBIconoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBIconoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBSeleccionRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFStockActionPerformed
        
    }//GEN-LAST:event_jTFStockActionPerformed

    private void jBIconoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIconoBuscarActionPerformed
        boolean encontrado = false;
        int codigo = 0;
        jBGuardar.disable();
        jBGuardar.setEnabled(false);
        jBEliminar.enable();
        jBEliminar.setEnabled(true);
        jBModPrecio.enable();
        jBModPrecio.setEnabled(true);
        jBModStock.enable();
        jBModStock.setEnabled(true);

        if (jTFCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha ingresado un codigo");
            return;
        } else {
            try {
                codigo = Integer.parseInt(jTFCodigo.getText());
            } catch(IllegalArgumentException ae){
                JOptionPane.showMessageDialog(this, "Ha ingresado una letra, intente nuevamente con un numero");
                limpiarCampos();
                return;
            }
            
            for (Producto producto : Menu.listaProductos) {
                if (producto.getCodigo() == codigo) {
                    encontrado = true;
                    jTFDescripcion.setText(producto.getDescripcion());
                    jTFDescripcion.setEditable(false);
                    jTFPrecio.setText(producto.getPrecio().toString());
                    jTFPrecio.setEditable(false);
                    jTFStock.setText(Integer.toString(producto.getStock()));
                    jTFStock.setEditable(false);
                    modeloComboBox.setSelectedItem(producto.getRubro());
                    modeloComboBox.removeAllElements();
                    modeloComboBox.addElement(producto.getRubro());
                    return;
                }
            }
        }
        if (!encontrado){
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "No se encuentra el producto buscado");
            jBEliminar.disable();
            jBEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_jBIconoBuscarActionPerformed

    private void jBModPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModPrecioActionPerformed
        if (jTFPrecio.getText().isEmpty()){
        }else {
            jTFPrecio.setEditable(true);
            jBGuardar.setEnabled(true);
            jBEliminar.disable();
            jBEliminar.setEnabled(false);
        }
        
    }//GEN-LAST:event_jBModPrecioActionPerformed

    private void jBModStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModStockActionPerformed
        if (!jTFStock.getText().isEmpty()){
            jTFStock.setEditable(true);
            jBGuardar.setEnabled(true);
            jBEliminar.disable();
            jBEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jBModStockActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        guardarDatos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
        guardarNuevo = true;
        jTFPrecio.setEditable(true);
        jTFDescripcion.setEditable(true);
        jTFStock.setEditable(true);
        jBGuardar.setEnabled(true);
        jBEliminar.disable();
        jBEliminar.setEnabled(false);
        jBModPrecio.disable();
        jBModPrecio.setEnabled(false);
        jBModStock.disable();
        jBModStock.setEnabled(false);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        for (Producto producto : Menu.listaProductos) {
            if (producto.getCodigo() == Integer.parseInt(jTFCodigo.getText())) {
                Menu.listaProductos.remove(producto);
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "El producto " + producto.getDescripcion() + " a sido eliminado!");
                jBEliminar.disable();
                jBEliminar.setEnabled(false);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "El producto no se encuentra en la base de datos");
                limpiarCampos();
                jBEliminar.disable();
                jBEliminar.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        try {
            setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GestionProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBIconoBuscar;
    private javax.swing.JButton jBModPrecio;
    private javax.swing.JButton jBModStock;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBSeleccionRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFPrecio;
    private javax.swing.JTextField jTFStock;
    // End of variables declaration//GEN-END:variables
    private void crearItemComboBox(){
        modeloComboBox.removeAllElements();
        jCBSeleccionRubro.setModel(modeloComboBox);
        for (Categoria categoria : Categoria.values()) {
            modeloComboBox.addElement(categoria);
        }
    }

    private void pruebaImgIcono(){
         BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File("src/ej4/img/vecteezy_realistic-magnifying-glass-clip-art_9876398_646.png"));
        } catch (IOException ex) {
            Logger.getLogger(GestionProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image image = bufferedImage.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        
        ImageIcon icon = new ImageIcon(image); 
        
        jBIconoBuscar.setIcon(icon);
    }
    
    private void limpiarCampos(){
        jTFCodigo.setText("");
        jTFDescripcion.setText("");
        jTFPrecio.setText("");
        jTFStock.setText("");
        crearItemComboBox();
    }
    
    private void guardarDatos(){
        int codigo = 0;
        Double precio = 0.0;
        int stock = 0;

        if (guardarNuevo) {
            
            if (jTFCodigo.getText().isEmpty()
                    || jTFDescripcion.getText().isEmpty()
                    || jTFPrecio.getText().isEmpty()
                    || jTFStock.getText().isEmpty() || jCBSeleccionRubro.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "No ha ingresado alguno de los datos necesarios");
                guardarNuevo = false;
                limpiarCampos();
                return;
            } else {
                try {
                    codigo = Integer.parseInt(jTFCodigo.getText());
                    stock = Integer.parseInt(jTFStock.getText());
                    precio = Double.parseDouble(jTFPrecio.getText());
                } catch (IllegalArgumentException ae) {
                    JOptionPane.showMessageDialog(this, "Ha ingresado un tipo de dato incorrecto, revise los datos e intente nuevamente");
                    limpiarCampos();
                    guardarNuevo = false;
                    return;
                }
            }
            for (Categoria categoria : Categoria.values()) {
                if (jCBSeleccionRubro.getSelectedItem().toString().equalsIgnoreCase(categoria.toString())){
                    Menu.listaProductos.add(new Producto(codigo, jTFDescripcion.getText(),precio, stock, categoria));
                }
            }
            JOptionPane.showMessageDialog(this, "Ha cargado el producto " + jTFDescripcion.getText() + " correctamente");
            guardarNuevo = false;
            limpiarCampos();
        } else {
            if (jTFCodigo.getText().isEmpty()
                    || jTFDescripcion.getText().isEmpty()
                    || jTFPrecio.getText().isEmpty()
                    || jTFStock.getText().isEmpty() || jCBSeleccionRubro.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "No ha ingresado alguno de los datos necesarios");
                guardarNuevo = false;
                limpiarCampos();
                return;
            } else {
                try {
                    codigo = Integer.parseInt(jTFCodigo.getText());
                    stock = Integer.parseInt(jTFStock.getText());
                    precio = Double.parseDouble(jTFPrecio.getText());
                } catch (IllegalArgumentException ae) {
                    JOptionPane.showMessageDialog(this, "Ha ingresado un tipo de dato incorrecto, revise los datos e intente nuevamente");
                    limpiarCampos();
                    guardarNuevo = false;
                    limpiarCampos();
                    return;
                }
            }

            for (Producto producto : Menu.listaProductos) {
                if (producto.getCodigo() == Integer.parseInt(jTFCodigo.getText())) {
                    producto.setDescripcion(jTFDescripcion.getText());
                    producto.setPrecio(Double.parseDouble(jTFPrecio.getText()));
                    producto.setStock(Integer.parseInt(jTFStock.getText()));
                    for (Categoria categoria : Categoria.values()) {
                        if (categoria.toString().equalsIgnoreCase(jCBSeleccionRubro.getSelectedItem().toString())) {
                            producto.setRubro(categoria);
                        }
                    }
                    producto.setCodigo(Integer.parseInt(jTFCodigo.getText()));
                }
            }
            JOptionPane.showMessageDialog(this, "Producto modificado exitosamente");
            limpiarCampos();
            guardarNuevo = false;
            jBGuardar.disable();
            jBGuardar.setEnabled(false);
            jBEliminar.disable();
            jBEliminar.setEnabled(false);
        }
        guardarNuevo = false;
    }

}
