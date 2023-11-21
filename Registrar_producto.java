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

public class Registrar_producto extends javax.swing.JInternalFrame {

    public Registrar_producto() {
        initComponents();
        TxtIDProd.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        TxtIDProd.setText("");
        TxtNombreProd.setText("");
        TxtDescripcionProd.setText("");
        TxtPCompraProd.setText("");
        TxtPVentaProd.setText("");
        TxtCantidadProd.setText("");
        TxtFechaProd.setText("");
    }
    
    public void ObtenerDatos(){
        List<Productos> producto =new DAOProductos().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas={"ID_producto","Nom_prod","Descr_prod",
            "prec_com_prod","prec_ven_prod","Cant_prod","Fecha_reg_prod"};
        modelo.setColumnIdentifiers(columnas);
        for(Productos prd:producto){
            String[]renglon={Integer.toString(prd.getID_producto()),prd.getNom_prod(),
                prd.getDescr_prod(), String.valueOf( prd.getPrec_comp_prod()), 
                String.valueOf(prd.getPrec_ven_prod()),
                Integer.toString(prd.getCant_prod()),
                prd.getFecha_reg_prod().toString()};
            modelo.addRow(renglon);
        }
        JTableProd.setModel(modelo);
    }
    
    public void actualizarProductos(){
                int IDd= Integer.parseInt(this.TxtIDProd.getText());
        String nompd=this.TxtNombreProd.getText();
        String descpd=this.TxtDescripcionProd.getText();
        double pcompd=Double.parseDouble(this.TxtPCompraProd.getText());
        double pvenpd=Double.parseDouble(this.TxtPVentaProd.getText());
        int cantpd=Integer.parseInt(this.TxtCantidadProd.getText());
        Date fechapd=Date.valueOf(this.TxtFechaProd.getText());
        
        DAOProductos dao=new DAOProductos();
        int res=dao.Actualizar(IDd, nompd, descpd, pcompd,
                pvenpd, cantpd, fechapd);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane,"¡Producto actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane,"¡Ocurrió un ERROR!");
        }
    }
    
    public void BuscarProductos(List <Productos> producto){
            DefaultTableModel modelo = new DefaultTableModel();
            
            String[] columnas = {"ID_producto", "Nom_prod", "Descr_prod",
                "prec_comp_prod", "prec_ven_prod", "Cant_prod", "Fecha_reg_prod"};
            modelo.setColumnIdentifiers(columnas);
            
            for(Productos pro: producto){
                String[] renglon = {Integer.toString(pro.getID_producto()),
                    pro.getNom_prod(),
                    pro.getDescr_prod(),
                    Double.toString(pro.getPrec_comp_prod()),
                    Double.toString(pro.getPrec_ven_prod()),
                    Integer.toString(pro.getCant_prod()),
                    pro.getFecha_reg_prod().toString()};
                
                modelo.addRow(renglon);
            }
            JTableProd.setModel(modelo);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableProd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TxtIDProd = new java.awt.TextField();
        label3 = new java.awt.Label();
        TxtNombreProd = new java.awt.TextField();
        label4 = new java.awt.Label();
        TxtDescripcionProd = new java.awt.TextField();
        label6 = new java.awt.Label();
        TxtPCompraProd = new java.awt.TextField();
        label5 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        TxtPVentaProd = new java.awt.TextField();
        TxtCantidadProd = new java.awt.TextField();
        TxtFechaProd = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        BtnBorrarProd = new java.awt.Button();
        BtnEditarProd = new java.awt.Button();
        BtnActualizarProd = new java.awt.Button();
        BtnAgregarProd = new java.awt.Button();
        BtnBuscarProd = new java.awt.Button();
        BtnLimpiarProd = new java.awt.Button();
        TxtBuscarProd = new java.awt.TextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel3.setBackground(new java.awt.Color(255, 168, 231));

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("PRODUCTOS REGISTRADOS");

        JTableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "P compra", "P venta", "Cantidad", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(JTableProd);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
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

        jPanel1.setBackground(new java.awt.Color(255, 168, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("REGISTRAR PRODUCTOS");

        label2.setText("ID");

        label3.setText("Nombre");

        label4.setText("Descripción");

        label6.setText("P Compra");

        label5.setText("P Venta");

        label9.setText("Cantidad");

        label10.setText("Fecha");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDescripcionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPCompraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtFechaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIDProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDescripcionProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPCompraProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtPVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFechaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 168, 231));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("TRANSACCIONES");

        BtnBorrarProd.setActionCommand("EDITAR");
        BtnBorrarProd.setLabel("Borrar");
        BtnBorrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarProdActionPerformed(evt);
            }
        });

        BtnEditarProd.setActionCommand("EDITAR");
        BtnEditarProd.setLabel("Editar");
        BtnEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarProdActionPerformed(evt);
            }
        });

        BtnActualizarProd.setActionCommand("EDITAR");
        BtnActualizarProd.setLabel("Actualizar");
        BtnActualizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarProdActionPerformed(evt);
            }
        });

        BtnAgregarProd.setActionCommand("AGREGAR");
        BtnAgregarProd.setLabel("Agregar");
        BtnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarProdActionPerformed(evt);
            }
        });

        BtnBuscarProd.setActionCommand("Buscar");
        BtnBuscarProd.setLabel("Buscar");
        BtnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProdActionPerformed(evt);
            }
        });

        BtnLimpiarProd.setActionCommand("EDITAR");
        BtnLimpiarProd.setLabel("Limpiar");
        BtnLimpiarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnActualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBorrarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBuscarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpiarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtBuscarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLimpiarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarProdActionPerformed
        String nomprd=TxtNombreProd.getText();
        String descrprd=TxtDescripcionProd.getText();
        String pcomprd=TxtPCompraProd.getText();
        String pvenprd=TxtPVentaProd.getText();
        String cantprd=TxtCantidadProd.getText();
        String fechaprd=TxtFechaProd.getText();
        if (nomprd.contentEquals("")||descrprd.contentEquals("")||
                pcomprd.contentEquals("")||pvenprd.contentEquals("")||
                cantprd.contentEquals("")||fechaprd.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, 
                    "Todos los campos son obligatorios");
        }else{
            try{
                Date fechprd=Date.valueOf(fechaprd);
                double comprd=Double.parseDouble(pcomprd);
                double venprd=Double.parseDouble(pvenprd);
                int canprd=Integer.parseInt(cantprd);
                Productos pd=new DAOProductos().Insertar(nomprd,
                        descrprd, comprd, venprd,
                        canprd, fechprd);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,
                        "No se agrego el resgistro");
            }
        }
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnAgregarProdActionPerformed

    private void BtnEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarProdActionPerformed
        int fila=this.JTableProd.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,"Seleccione un registro de la tabla");
        } else{
            try{
            int IDd=Integer.parseInt((String)this.JTableProd.getValueAt(fila,0).toString());
            String nompd=(String)this.JTableProd.getValueAt(fila, 1);
            String descrpd=(String)this.JTableProd.getValueAt(fila,2);
            String pcompd=(String)this.JTableProd.getValueAt(fila,3);
            String pvenpd=(String)this.JTableProd.getValueAt(fila,4);
            String cantpd=(String)this.JTableProd.getValueAt(fila,5).toString();
            Date fechacl=Date.valueOf((String)this.JTableProd.getValueAt(fila,6).toString());
            
            TxtIDProd.setText(""+IDd);
            TxtNombreProd.setText(nompd);
            TxtDescripcionProd.setText(descrpd);
            TxtPCompraProd.setText(pcompd);
            TxtPVentaProd.setText(pvenpd);
            TxtCantidadProd.setText(cantpd);
            TxtFechaProd.setText(String.valueOf(fechacl));
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_BtnEditarProdActionPerformed

    private void BtnActualizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarProdActionPerformed
        actualizarProductos();
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnActualizarProdActionPerformed

    private void BtnBorrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarProdActionPerformed
        int fila=this.JTableProd.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else {
            int IDd=Integer.parseInt((String)this.JTableProd.getValueAt(fila,0).toString());
            DAOProductos dao= new DAOProductos();
            dao.Eliminar(IDd);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBorrarProdActionPerformed

    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed
        String terminoBusqueda = TxtBuscarProd.getText().trim();
        
        if(!terminoBusqueda.isEmpty()){
            List<Productos> resultados = new DAOProductos().Buscar(terminoBusqueda);
            BuscarProductos(resultados);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Porfavor ingrese algo para buscar","Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBuscarProdActionPerformed

    private void BtnLimpiarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarProdActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BtnLimpiarProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnActualizarProd;
    private java.awt.Button BtnAgregarProd;
    private java.awt.Button BtnBorrarProd;
    private java.awt.Button BtnBuscarProd;
    private java.awt.Button BtnEditarProd;
    private java.awt.Button BtnLimpiarProd;
    private javax.swing.JTable JTableProd;
    private java.awt.TextField TxtBuscarProd;
    private java.awt.TextField TxtCantidadProd;
    private java.awt.TextField TxtDescripcionProd;
    private java.awt.TextField TxtFechaProd;
    private java.awt.TextField TxtIDProd;
    private java.awt.TextField TxtNombreProd;
    private java.awt.TextField TxtPCompraProd;
    private java.awt.TextField TxtPVentaProd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
