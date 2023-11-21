/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;
import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Registro_proveedor extends javax.swing.JInternalFrame {


    public Registro_proveedor() {
        initComponents();
        TxtIDPro.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        TxtIDPro.setText("");
        TxtNombrePro.setText("");
        TxtTelefonoPro.setText("");
        TxtDireccionPro.setText("");
        TxtFechaPro.setText("");
    }
    
    public void ObtenerDatos(){
        List<Proveedores> proveedor =new DAOProveedores().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas={"ID_Proveedor","Nom_pro",
            "tel_pro","Direc_pro","Fec_reg_pro"};
        modelo.setColumnIdentifiers(columnas);
        for(Proveedores au:proveedor){
            String[]renglon={Integer.toString(au.getID_Proveedor()),
                au.getNom_pro(), au.gettel_pro(), au.getDirec_pro(),
                au.getFec_reg_pro().toString()};
            modelo.addRow(renglon);
        }
        JTablePro.setModel(modelo);
    }
    
    public void actualizarProveedores(){
                int IDP= Integer.parseInt(this.TxtIDPro.getText());
        String nompr=this.TxtNombrePro.getText();
        String telpr=this.TxtTelefonoPro.getText();
        String direcpr=this.TxtDireccionPro.getText();
        Date fechapr=Date.valueOf(this.TxtFechaPro.getText());
        
        DAOProveedores dao=new DAOProveedores();
        int res=dao.Actualizar(IDP,nompr,
                telpr,direcpr,fechapr);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane,
                    "¡Proveedor actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Ocurrió un ERROR!");
        }
    }
    
    public void BuscarProveedores(List <Proveedores> proveedor){
            DefaultTableModel modelo = new DefaultTableModel();
            
            String[] columnas = {"ID_Proveedor", "Nom_pro", "tel_pro",
                "Direc_pro", "Fec_reg_pro"};
            modelo.setColumnIdentifiers(columnas);
            
            for(Proveedores prov: proveedor){
                String[] renglon = {Integer.toString(prov.getID_Proveedor()),
                    prov.getNom_pro(),
                    prov.gettel_pro(),
                    prov.getDirec_pro(),
                    prov.getFec_reg_pro().toString()};
                
                modelo.addRow(renglon);
            }
            JTablePro.setModel(modelo);
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        BtnBorrarPro = new java.awt.Button();
        BtnEditarPro = new java.awt.Button();
        BtnActualizarPro = new java.awt.Button();
        BtnAgregarPro = new java.awt.Button();
        BtnLimpiarPro = new java.awt.Button();
        BtnBuscarPro = new java.awt.Button();
        TxtBuscarPro = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TxtIDPro = new java.awt.TextField();
        label3 = new java.awt.Label();
        TxtNombrePro = new java.awt.TextField();
        label4 = new java.awt.Label();
        TxtTelefonoPro = new java.awt.TextField();
        label6 = new java.awt.Label();
        TxtDireccionPro = new java.awt.TextField();
        TxtFechaPro = new java.awt.TextField();
        label9 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTablePro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 168, 231));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("TRANSACCIONES");

        BtnBorrarPro.setActionCommand("EDITAR");
        BtnBorrarPro.setLabel("Borrar");
        BtnBorrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarProActionPerformed(evt);
            }
        });

        BtnEditarPro.setActionCommand("EDITAR");
        BtnEditarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEditarPro.setLabel("Editar");
        BtnEditarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarProActionPerformed(evt);
            }
        });

        BtnActualizarPro.setActionCommand("EDITAR");
        BtnActualizarPro.setLabel("Actualizar");
        BtnActualizarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarProActionPerformed(evt);
            }
        });

        BtnAgregarPro.setActionCommand("AGREGAR");
        BtnAgregarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregarPro.setLabel("Agregar");
        BtnAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProActionPerformed(evt);
            }
        });

        BtnLimpiarPro.setActionCommand("EDITAR");
        BtnLimpiarPro.setLabel("Limpiar");
        BtnLimpiarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarProActionPerformed(evt);
            }
        });

        BtnBuscarPro.setActionCommand("EDITAR");
        BtnBuscarPro.setLabel("Buscar");
        BtnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnEditarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnBorrarPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAgregarPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnLimpiarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnBuscarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtBuscarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 168, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("REGISTRAR PROVEEDOR");

        label2.setText("ID");

        label3.setText("Nombre");

        label4.setText("Teléfono");

        label6.setText("Dirección");

        label9.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtDireccionPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTelefonoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFechaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefonoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccionPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFechaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 168, 231));

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("PROVEEDORES REGISTRADOS");

        JTablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Teléfono", "Dirección", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTablePro);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProActionPerformed
        String nompro=TxtNombrePro.getText();
        String telpro=TxtTelefonoPro.getText();
        String direcpro=TxtDireccionPro.getText();
        String fechapro=TxtFechaPro.getText();
        if (nompro.contentEquals("")||telpro.contentEquals("")||
                direcpro.contentEquals("")||fechapro.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        }else{
            try{
                Date fech=Date.valueOf(fechapro);
                Proveedores au=new DAOProveedores().Insertar(nompro,
                        telpro, direcpro, fech);
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
    }//GEN-LAST:event_BtnAgregarProActionPerformed

    private void BtnBorrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarProActionPerformed
        int fila=this.JTablePro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
        } else {
            int IDP=Integer.parseInt((String)this.JTablePro.getValueAt(fila,0).toString());
            DAOProveedores dao= new DAOProveedores();
            dao.Eliminar(IDP);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBorrarProActionPerformed

    private void BtnEditarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarProActionPerformed
        int fila=this.JTablePro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
        } else{
            try{
            int IDP=Integer.parseInt((String)this.JTablePro.getValueAt(fila,0).toString());
            String nompr=(String)this.JTablePro.getValueAt(fila, 1);
            String telpr=(String)this.JTablePro.getValueAt(fila,2);
            String direcpr=(String)this.JTablePro.getValueAt(fila,3);
            Date fechapr=Date.valueOf((String)this.JTablePro.getValueAt(fila,4).toString());
            
            TxtIDPro.setText(""+IDP);
            TxtNombrePro.setText(nompr);
            TxtTelefonoPro.setText(telpr);
            TxtDireccionPro.setText(direcpr);
            TxtFechaPro.setText(String.valueOf(fechapr));
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_BtnEditarProActionPerformed

    private void BtnActualizarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarProActionPerformed
        actualizarProveedores();
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnActualizarProActionPerformed

    private void BtnLimpiarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarProActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BtnLimpiarProActionPerformed

    private void BtnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProActionPerformed
        String terminoBusqueda = TxtBuscarPro.getText().trim();
        
        if(!terminoBusqueda.isEmpty()){
            List<Proveedores> resultados = new DAOProveedores().Buscar(terminoBusqueda);
            BuscarProveedores(resultados);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Porfavor ingrese algo para buscar","Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBuscarProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnActualizarPro;
    private java.awt.Button BtnAgregarPro;
    private java.awt.Button BtnBorrarPro;
    private java.awt.Button BtnBuscarPro;
    private java.awt.Button BtnEditarPro;
    private java.awt.Button BtnLimpiarPro;
    private javax.swing.JTable JTablePro;
    private java.awt.TextField TxtBuscarPro;
    private java.awt.TextField TxtDireccionPro;
    private java.awt.TextField TxtFechaPro;
    private java.awt.TextField TxtIDPro;
    private java.awt.TextField TxtNombrePro;
    private java.awt.TextField TxtTelefonoPro;
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
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
