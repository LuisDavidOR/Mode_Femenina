
package Vista;
import Modelo.*;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Registrar_clientes extends javax.swing.JInternalFrame {

    public Registrar_clientes() {
        initComponents();
        TxtIDCli.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        TxtIDCli.setText("");
        TxtNombreCli.setText("");
        TxtApellidoCli.setText("");
        TxtTelefonoCli.setText("");
        TxtFechaCli.setText("");
    }
    
    public void ObtenerDatos(){
        List<Clientes> cliente = new DAOClientes().ObtenerDatos();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas= {"ID_clientes","Nom_cli","Apell_cli",
            "Tel_cli","Fec_reg_cli"};
        modelo.setColumnIdentifiers(columnas);
        for(Clientes cl:cliente){
            String[] renglon= {Integer.toString(cl.getID_cliente()),
                cl.getNom_cli(), cl.getApell_cli(), cl.getTel_cli(),
                cl.getFec_reg_cli().toString()};
            modelo.addRow(renglon);
        }
        JTableCli.setModel(modelo);
    }
    
    public void actualizarClientes(){
        int IDC= Integer.parseInt(this.TxtIDCli.getText());
        String nomcl=this.TxtNombreCli.getText();
        String apellcl=this.TxtApellidoCli.getText();
        String telcl=this.TxtTelefonoCli.getText();
        Date fechacl=Date.valueOf(this.TxtFechaCli.getText());
        
        DAOClientes dao=new DAOClientes();
        int res=dao.Actualizar(IDC,nomcl,apellcl,
                telcl,fechacl);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane,
                    "¡Cliente actualizado!");
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Ocurrió un ERROR!");
        }
    }
    
    public void BuscarClientes(List<Clientes> cliente){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas= {"ID_cliente","Nom_cli","Apell_cli",
            "Tel_cli","Fec_reg_cli"};
        modelo.setColumnIdentifiers(columnas);
        
        for(Clientes clie: cliente){
            String[] renglon = {Integer.toString(clie.getID_cliente()),
                clie.getNom_cli(),
                clie.getApell_cli(),
                clie.getTel_cli(),
                clie.getFec_reg_cli().toString()};
            
            modelo.addRow(renglon);
        }
        JTableCli.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        TxtIDCli = new java.awt.TextField();
        label5 = new java.awt.Label();
        TxtNombreCli = new java.awt.TextField();
        TxtTelefonoCli = new java.awt.TextField();
        TxtApellidoCli = new java.awt.TextField();
        TxtFechaCli = new java.awt.TextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        BtnAgregarCli = new java.awt.Button();
        BtnEditarCli = new java.awt.Button();
        BtnActualizarCli = new java.awt.Button();
        BtnBorrarCli = new java.awt.Button();
        BtnLimpiarCli = new java.awt.Button();
        BtnBuscarCli = new java.awt.Button();
        TxtBuscarCli = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCli = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 168, 231));

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("REGISTRAR CLIENTES");

        label4.setText("ID");

        TxtIDCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDCliActionPerformed(evt);
            }
        });

        label5.setText("Apellidos");

        TxtNombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreCliActionPerformed(evt);
            }
        });

        TxtTelefonoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoCliActionPerformed(evt);
            }
        });

        TxtApellidoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoCliActionPerformed(evt);
            }
        });

        TxtFechaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFechaCliActionPerformed(evt);
            }
        });

        label6.setText("Nombres");

        label7.setText("Télefono");

        label8.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFechaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFechaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 168, 231));
        jPanel2.setPreferredSize(new java.awt.Dimension(248, 251));

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("TRANSACCIONES");

        BtnAgregarCli.setActionCommand("AGREGAR");
        BtnAgregarCli.setLabel("Agregar");
        BtnAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarCliActionPerformed(evt);
            }
        });

        BtnEditarCli.setActionCommand("EDITAR");
        BtnEditarCli.setLabel("Editar");
        BtnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarCliActionPerformed(evt);
            }
        });

        BtnActualizarCli.setActionCommand("EDITAR");
        BtnActualizarCli.setLabel("Actualizar");
        BtnActualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarCliActionPerformed(evt);
            }
        });

        BtnBorrarCli.setActionCommand("Buscar");
        BtnBorrarCli.setLabel("Borrar");
        BtnBorrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarCliActionPerformed(evt);
            }
        });

        BtnLimpiarCli.setActionCommand("Limpiar");
        BtnLimpiarCli.setLabel("Limpiar");
        BtnLimpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarCliActionPerformed(evt);
            }
        });

        BtnBuscarCli.setActionCommand("EDITAR");
        BtnBuscarCli.setLabel("Buscar");
        BtnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarCliActionPerformed(evt);
            }
        });

        TxtBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEditarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnActualizarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgregarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 168, 231));
        jPanel3.setPreferredSize(new java.awt.Dimension(525, 188));

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("CLIENTES REGISTRADOS");

        JTableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Télefono", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(JTableCli);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCliActionPerformed
        String nomcli=TxtNombreCli.getText();
        String apellcli=TxtApellidoCli.getText();
        String telcli=TxtTelefonoCli.getText();
        String fechacli=TxtFechaCli.getText();
        if(nomcli.contentEquals("")||apellcli.contentEquals("")||
           telcli.contentEquals("")||fechacli.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane,
                    "Todos los campos son obligatorios");
        } else {
            try{
                Date fechcli=Date.valueOf(fechacli);
                Clientes cl=new DAOClientes().Insertar(nomcli,
                        apellcli, telcli, fechcli);
                JOptionPane.showMessageDialog(rootPane,
                        "Registro agregado");
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,
                        "No se agrego el registro");
            }
        }
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnAgregarCliActionPerformed

    private void BtnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarCliActionPerformed
        int fila=this.JTableCli.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else{
            try{
                int IDC=Integer.parseInt((String)this.JTableCli.getValueAt(fila,
                        0).toString());
                String nomcl=(String)this.JTableCli.getValueAt(fila,1);
                String apellcl=(String)this.JTableCli.getValueAt(fila,2);
                String telcl=(String)this.JTableCli.getValueAt(fila,3);
                Date fechacl=Date.valueOf((String)this.JTableCli.getValueAt(fila,
                        4).toString());
                
                TxtIDCli.setText(""+IDC);
                TxtNombreCli.setText(nomcl);
                TxtApellidoCli.setText(apellcl);
                TxtTelefonoCli.setText(telcl);
                TxtFechaCli.setText(String.valueOf(fechacl));
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtnEditarCliActionPerformed

    private void BtnActualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarCliActionPerformed
        actualizarClientes();
        ObtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_BtnActualizarCliActionPerformed

    private void BtnBorrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarCliActionPerformed
        int fila=this.JTableCli.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else{
            int IDC=Integer.parseInt((String)this.JTableCli.getValueAt(fila,
                    0).toString());
            DAOClientes dao= new DAOClientes();
            dao.Eliminar(IDC);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBorrarCliActionPerformed

    private void BtnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarCliActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_BtnLimpiarCliActionPerformed

    private void BtnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarCliActionPerformed
        String terminoBusqueda = TxtBuscarCli.getText().trim();
        
        if(!terminoBusqueda.isEmpty()){
            List<Clientes> resultados = new DAOClientes().Buscar(terminoBusqueda);
            BuscarClientes(resultados);
        } else{
            JOptionPane.showMessageDialog(null,
                    "Porfavor ingrese algo para buscar","Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            ObtenerDatos();
        }
    }//GEN-LAST:event_BtnBuscarCliActionPerformed

    private void TxtBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarCliActionPerformed
        
    }//GEN-LAST:event_TxtBuscarCliActionPerformed

    private void TxtIDCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDCliActionPerformed

    private void TxtNombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreCliActionPerformed

    private void TxtTelefonoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoCliActionPerformed

    private void TxtApellidoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoCliActionPerformed

    private void TxtFechaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFechaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFechaCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BtnActualizarCli;
    private java.awt.Button BtnAgregarCli;
    private java.awt.Button BtnBorrarCli;
    private java.awt.Button BtnBuscarCli;
    private java.awt.Button BtnEditarCli;
    private java.awt.Button BtnLimpiarCli;
    private javax.swing.JTable JTableCli;
    private java.awt.TextField TxtApellidoCli;
    private java.awt.TextField TxtBuscarCli;
    private java.awt.TextField TxtFechaCli;
    private java.awt.TextField TxtIDCli;
    private java.awt.TextField TxtNombreCli;
    private java.awt.TextField TxtTelefonoCli;
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
    // End of variables declaration//GEN-END:variables
}
