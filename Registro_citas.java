/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;
import Modelo.*;
import java.util.*;
import java.sql.Date;
import java.sql.Time;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Registro_citas extends javax.swing.JInternalFrame {

    public Registro_citas() {
        initComponents();
        TxtIDCit.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        TxtIDCit.setText("");
        TxtFechaCit.setText("");
        TxtHoraCit.setText("");
        TxtIDClienteCit.setText("");
        TxtIDServicioCit.setText("");
        TxtIDEmpleadoCit.setText("");
    }
    
    public void ObtenerDatos(){
        List<Citas> cita =new DAOCitas().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas={"ID_Cita","Fecha_Cit",
            "Hora_Cit","ID_clientes","ID_servicio","ID_Empleado"};
        modelo.setColumnIdentifiers(columnas);
        for(Citas ci:cita){
            String[]renglon={Integer.toString(ci.getID_Cita()),
                ci.getFecha_Cit().toString(),
                ci.getHora_Cit().toString(),
                Integer.toString(ci.getID_cliente()),
                Integer.toString(ci.getID_servicio()),
                Integer.toString(ci.getID_Empleado())};
            modelo.addRow(renglon);
        }
        JTableCit.setModel(modelo);
    }
    
    public void actualizarCitas(){
                int IDc= Integer.parseInt(this.TxtIDCit.getText());
        Date fech=Date.valueOf(this.TxtFechaCit.getText());
        Time hor=Time.valueOf(this.TxtHoraCit.getText());
        int IDC=Integer.parseInt(this.TxtIDClienteCit.getText());
        int IDS=Integer.parseInt(this.TxtIDServicioCit.getText());
        int IDE=Integer.parseInt(this.TxtIDEmpleadoCit.getText());
        
        DAOCitas dao=new DAOCitas();
        int res=dao.Actualizar(IDc, fech, hor, IDC,
                IDS,IDE);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane,"¡Cita actualizada!");
        } else {
            JOptionPane.showMessageDialog(rootPane,"¡Ocurrió un ERROR!");
        }
    }
    
    public void BuscarCita(List <Citas> cita){
            DefaultTableModel modelo = new DefaultTableModel();
            
            String[] columnas = {"ID_Cita", "Fecha_Cit", "Hora_Cit",
                "ID_cliente", "ID_servicio","ID_Empleado"};
            modelo.setColumnIdentifiers(columnas);
            
            for(Citas ci: cita){
                String[] renglon = {Integer.toString(ci.getID_Cita()),
                    ci.getFecha_Cit().toString(),
                    ci.getHora_Cit().toString(),
                    Integer.toString(ci.getID_cliente()),
                    Integer.toString(ci.getID_servicio()),
                    Integer.toString(ci.getID_Empleado())};
                
                modelo.addRow(renglon);
            }
            JTableCit.setModel(modelo);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        TxtIDCit = new java.awt.TextField();
        label3 = new java.awt.Label();
        TxtFechaCit = new java.awt.TextField();
        label4 = new java.awt.Label();
        TxtHoraCit = new java.awt.TextField();
        label5 = new java.awt.Label();
        TxtIDClienteCit = new java.awt.TextField();
        label6 = new java.awt.Label();
        TxtIDServicioCit = new java.awt.TextField();
        label8 = new java.awt.Label();
        TxtIDEmpleadoCit = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        BtnAgregarCit = new java.awt.Button();
        BtnEditarCit = new java.awt.Button();
        BtnActualizarCit = new java.awt.Button();
        BtnBorrarCit = new java.awt.Button();
        BtnLimpiarCit = new java.awt.Button();
        BtnBuscarCit = new java.awt.Button();
        TxtBuscarCit = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCit = new javax.swing.JTable();
        label9 = new java.awt.Label();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(549, 507));

        jPanel1.setBackground(new java.awt.Color(242, 168, 231));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("REGISTRAR CITAS");

        label2.setText("ID");

        label3.setText("Fecha");

        label4.setText("Hora");

        label5.setText("ID Cliente");

        label6.setText("ID Servicio");

        label8.setText("ID Empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIDCit, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(TxtFechaCit, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(TxtHoraCit, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(TxtIDClienteCit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtIDServicioCit, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(TxtIDEmpleadoCit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFechaCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHoraCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDClienteCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDServicioCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDEmpleadoCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(242, 168, 231));

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("TRANSACCIONES");

        BtnAgregarCit.setActionCommand("AGREGAR");
        BtnAgregarCit.setLabel("Agregar");
        BtnAgregarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarCitActionPerformed(evt);
            }
        });

        BtnEditarCit.setActionCommand("EDITAR");
        BtnEditarCit.setLabel("Editar");
        BtnEditarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarCitActionPerformed(evt);
            }
        });

        BtnActualizarCit.setActionCommand("EDITAR");
        BtnActualizarCit.setLabel("Actualizar");
        BtnActualizarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarCitActionPerformed(evt);
            }
        });

        BtnBorrarCit.setActionCommand("EDITAR");
        BtnBorrarCit.setLabel("Borrar");
        BtnBorrarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarCitActionPerformed(evt);
            }
        });

        BtnLimpiarCit.setActionCommand("Limpiar");
        BtnLimpiarCit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLimpiarCit.setLabel("Limpiar");
        BtnLimpiarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarCitActionPerformed(evt);
            }
        });

        BtnBuscarCit.setActionCommand("EDITAR");
        BtnBuscarCit.setLabel("Buscar");
        BtnBuscarCit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAgregarCit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarCit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnActualizarCit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnLimpiarCit, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(BtnBorrarCit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBuscarCit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtBuscarCit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarCit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 168, 231));

        JTableCit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Hora", "ID Cliente", "ID Servicio", "ID Empleado"
            }
        ));
        jScrollPane1.setViewportView(JTableCit);

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("CITAS REGISTRADAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCitActionPerformed
        String fec=TxtFechaCit.getText();
        String hor=TxtHoraCit.getText();
        String IDC=TxtIDClienteCit.getText();
        String IDS=TxtIDServicioCit.getText();
        String IDE=TxtIDEmpleadoCit.getText();
        if (fec.contentEquals("")||hor.contentEquals("")||
            IDC.contentEquals("")||IDS.contentEquals("")||
            IDE.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane,
                "Todos los campos son obligatorios");
        }else{
            try{
                Date fech=Date.valueOf(fec);
                Time hora=Time.valueOf(hor);
                int IDCl=Integer.parseInt(IDC);
                int IDSe=Integer.parseInt(IDS);
                int IDEm=Integer.parseInt(IDE);
                Citas ci=new DAOCitas().Insertar(fech,
                    hora, IDCl, IDSe, IDEm);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el resgistro");
            }
        }
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnAgregarCitActionPerformed

    private void BtnEditarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarCitActionPerformed
        int fila=this.JTableCit.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                "Seleccione un registro de la tabla");
        } else{
            try{
                int IDCi=Integer.parseInt((String)this.JTableCit.getValueAt(fila,0).toString());
                Date feci=Date.valueOf((String)this.JTableCit.getValueAt(fila, 1));
                Time horci=Time.valueOf((String)this.JTableCit.getValueAt(fila,2));
                int IDCci=Integer.parseInt((String)this.JTableCit.getValueAt(fila,3));
                int IDSci=Integer.parseInt((String)this.JTableCit.getValueAt(fila,4));
                int IDEci=Integer.parseInt((String)this.JTableCit.getValueAt(fila,5));

                TxtIDCit.setText(""+IDCi);
                TxtFechaCit.setText(String.valueOf(feci));
                TxtHoraCit.setText(String.valueOf(horci));
                TxtIDClienteCit.setText(String.valueOf(IDCci));
                TxtIDServicioCit.setText(String.valueOf(IDSci));
                TxtIDEmpleadoCit.setText(String.valueOf(IDEci));
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtnEditarCitActionPerformed

    private void BtnActualizarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarCitActionPerformed
        actualizarCitas();
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnActualizarCitActionPerformed

    private void BtnBorrarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarCitActionPerformed
        int fila=this.JTableCit.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                "Seleccione un registro de la tabla");
        } else {
            int IDCi=Integer.parseInt((String)this.JTableCit.getValueAt(fila,0).toString());
            DAOCitas dao= new DAOCitas();
            dao.Eliminar(IDCi);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBorrarCitActionPerformed

    private void BtnLimpiarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarCitActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BtnLimpiarCitActionPerformed

    private void BtnBuscarCitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCitActionPerformed
        String terminoBusqueda = TxtBuscarCit.getText().trim();

        if(!terminoBusqueda.isEmpty()){
            List<Citas> resultados = new DAOCitas().Buscar(terminoBusqueda);
            BuscarCita(resultados);
        }else {
            JOptionPane.showMessageDialog(null,
                "Porfavor ingrese algo para buscar","Advertencia",
                JOptionPane.WARNING_MESSAGE);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBuscarCitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnActualizarCit;
    private java.awt.Button BtnAgregarCit;
    private java.awt.Button BtnBorrarCit;
    private java.awt.Button BtnBuscarCit;
    private java.awt.Button BtnEditarCit;
    private java.awt.Button BtnLimpiarCit;
    private javax.swing.JTable JTableCit;
    private java.awt.TextField TxtBuscarCit;
    private java.awt.TextField TxtFechaCit;
    private java.awt.TextField TxtHoraCit;
    private java.awt.TextField TxtIDCit;
    private java.awt.TextField TxtIDClienteCit;
    private java.awt.TextField TxtIDEmpleadoCit;
    private java.awt.TextField TxtIDServicioCit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
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
