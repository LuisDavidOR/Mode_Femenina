/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;
import Modelo.*;
import java.util.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Registrar_Servicios extends javax.swing.JInternalFrame {

    public Registrar_Servicios() {
        initComponents();
        TxtIDSer.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        TxtIDSer.setText("");
        TxtNombreSer.setText("");
        TxtPrecioSer.setText("");
        TxtDescripcionSer.setText("");
    }
    
    public void ObtenerDatos(){
        List<CatalogoServicios> catalogoser =new DAOCatalogoServicios().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas={"ID_servicio","Nom_ser","Prec_ser","Descr_ser"};
        modelo.setColumnIdentifiers(columnas);
        for(CatalogoServicios cs:catalogoser){
            String[]renglon={Integer.toString(cs.getID_servicio()),cs.getNom_ser(),
                Double.toString(cs.getPrec_ser()), cs.getDescr_ser()};
            modelo.addRow(renglon);
        }
        JTableSer.setModel(modelo);
    }
    
        public void actualizarCatalogoServicios(){
                int IDS= Integer.parseInt(this.TxtIDSer.getText());
        String nomse=this.TxtNombreSer.getText();
        double precse=Double.parseDouble(this.TxtPrecioSer.getText());
        String descrse=this.TxtDescripcionSer.getText();
        
        DAOCatalogoServicios dao=new DAOCatalogoServicios();
        int res=dao.Actualizar(IDS,nomse,(double)precse,descrse);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane,"¡Servicio actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane,"¡Ocurrió un ERROR!");
        }
    }
        
        public void BuscarServicios(List <CatalogoServicios> Servicios){
            DefaultTableModel modelo = new DefaultTableModel();
            
            String[] columnas = {"ID_servicio", "Nom_ser", "Prec_ser", "Descr_ser"};
            modelo.setColumnIdentifiers(columnas);
            
            for(CatalogoServicios servi: Servicios){
                String[] renglon = {Integer.toString(servi.getID_servicio()),
                    servi.getNom_ser(),
                    Double.toString(servi.getPrec_ser()),
                    servi.getDescr_ser()};
                
                modelo.addRow(renglon);
            }
            JTableSer.setModel(modelo);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        BtnEditarSer = new java.awt.Button();
        BtnActualizarSer = new java.awt.Button();
        BtnAgregarSer = new java.awt.Button();
        BtnBuscarSer = new java.awt.Button();
        TxtBuscarSer = new java.awt.TextField();
        BtnLimpiarSer = new java.awt.Button();
        BtnBorrarSer = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TxtIDSer = new java.awt.TextField();
        label3 = new java.awt.Label();
        TxtNombreSer = new java.awt.TextField();
        label4 = new java.awt.Label();
        TxtPrecioSer = new java.awt.TextField();
        label6 = new java.awt.Label();
        TxtDescripcionSer = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableSer = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 168, 231));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("TRANSACCIONES");

        BtnEditarSer.setActionCommand("EDITAR");
        BtnEditarSer.setLabel("Editar");
        BtnEditarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarSerActionPerformed(evt);
            }
        });

        BtnActualizarSer.setActionCommand("EDITAR");
        BtnActualizarSer.setLabel("Actualizar");
        BtnActualizarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarSerActionPerformed(evt);
            }
        });

        BtnAgregarSer.setActionCommand("AGREGAR");
        BtnAgregarSer.setLabel("Agregar");
        BtnAgregarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarSerActionPerformed(evt);
            }
        });

        BtnBuscarSer.setActionCommand("EDITAR");
        BtnBuscarSer.setLabel("Buscar");
        BtnBuscarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarSerActionPerformed(evt);
            }
        });

        TxtBuscarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarSerActionPerformed(evt);
            }
        });

        BtnLimpiarSer.setActionCommand("Limpiar");
        BtnLimpiarSer.setLabel("Limpiar");
        BtnLimpiarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarSerActionPerformed(evt);
            }
        });

        BtnBorrarSer.setActionCommand("Buscar");
        BtnBorrarSer.setLabel("Borrar");
        BtnBorrarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarSerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnEditarSer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizarSer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnAgregarSer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnLimpiarSer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscarSer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBuscarSer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBorrarSer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 168, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("REGISTRAR SERVICIOS");

        label2.setText("ID");

        TxtIDSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDSerActionPerformed(evt);
            }
        });

        label3.setText("Nombre");

        label4.setText("Precio");

        label6.setText("Descripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDescripcionSer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioSer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDSer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreSer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDescripcionSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 168, 231));

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("SERVICIOS REGISTRADOS");

        JTableSer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Teléfono", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(JTableSer);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIDSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDSerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDSerActionPerformed

    private void BtnBorrarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarSerActionPerformed
        int fila=this.JTableSer.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else {
            int IDS=Integer.parseInt((String)this.JTableSer.getValueAt
        (fila,0).toString());
            DAOCatalogoServicios dao= new DAOCatalogoServicios();
            dao.Eliminar(IDS);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBorrarSerActionPerformed

    private void BtnActualizarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarSerActionPerformed
        actualizarCatalogoServicios();
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnActualizarSerActionPerformed

    private void BtnEditarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarSerActionPerformed
        int fila=this.JTableSer.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else{
            try{
                int IDS=Integer.parseInt((String)this.JTableSer.getValueAt(fila,0).toString());
                String nomsr=(String)this.JTableSer.getValueAt(fila, 1);
                String presr=(String)this.JTableSer.getValueAt(fila,2);
                String descrsr=(String)this.JTableSer.getValueAt(fila,3);

                TxtIDSer.setText(""+IDS);
                TxtNombreSer.setText(nomsr);
                TxtPrecioSer.setText(presr);
                TxtDescripcionSer.setText(descrsr);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtnEditarSerActionPerformed

    private void BtnAgregarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarSerActionPerformed
        String nomser=TxtNombreSer.getText();
        String preser=TxtPrecioSer.getText();
        String descrser=TxtDescripcionSer.getText();
        if (nomser.contentEquals("")||preser.contentEquals("")||
            descrser.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        }else{
            try{
                double precser=Double.parseDouble(preser);
                CatalogoServicios sr=new DAOCatalogoServicios().Insertar(nomser,
                        (float) precser, descrser);
                JOptionPane.showMessageDialog(rootPane,
                        "Registro agregado");
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,
                        "No se agrego el resgistro");
            }
        }
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnAgregarSerActionPerformed

    private void BtnBuscarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarSerActionPerformed
        String terminoBusqueda = TxtBuscarSer.getText().trim();
        
        if(!terminoBusqueda.isEmpty()){
            List<CatalogoServicios> resultados = new DAOCatalogoServicios().
                    Buscar(terminoBusqueda);
            BuscarServicios(resultados);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Porfavor ingrese algo para buscar","Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBuscarSerActionPerformed

    private void BtnLimpiarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarSerActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BtnLimpiarSerActionPerformed

    private void TxtBuscarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarSerActionPerformed
        //String terminoBusqueda = JtxtBuscarSer.getText().trim();
        
        //if(terminoBusqueda.isEmpty()){
            //ObtenerDatos();
        //} else {
            //List<CatalogoServicios> resultados = new DAOCatalogoServicios().Buscar(terminoBusqueda);
            //BuscarServicios(resultados);
        //}
    }//GEN-LAST:event_TxtBuscarSerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnActualizarSer;
    private java.awt.Button BtnAgregarSer;
    private java.awt.Button BtnBorrarSer;
    private java.awt.Button BtnBuscarSer;
    private java.awt.Button BtnEditarSer;
    private java.awt.Button BtnLimpiarSer;
    private javax.swing.JTable JTableSer;
    private java.awt.TextField TxtBuscarSer;
    private java.awt.TextField TxtDescripcionSer;
    private java.awt.TextField TxtIDSer;
    private java.awt.TextField TxtNombreSer;
    private java.awt.TextField TxtPrecioSer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    // End of variables declaration//GEN-END:variables
}
