/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.Direccion;
import Classes.Proveedor;
import Controller.CtrlProveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author quihuang
 */
public class frmProveedores extends javax.swing.JFrame {
    
    CtrlProveedor CtrlProveedor = new CtrlProveedor();

    /**
     * Creates new form frmProduct
     */
    public frmProveedores() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtRepresentante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSitioWeb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCllCra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Administración de Proveedores");

        jLabel2.setText("Nit");

        jLabel3.setText("Razón Social");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Correo Electrónico");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Representante");

        jLabel7.setText("Sitio Web");

        jLabel8.setText("Dirección");

        jLabel9.setText("Cll/Cra");

        jLabel10.setText("Número");

        jLabel11.setText("Barrio");

        jLabel12.setText("Ciudad");

        jButton1.setText("Volver al Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(txtCllCra))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(146, 157, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNumero)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRepresentante)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCorreo))
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(219, 219, 219)
                        .addComponent(txtCiudad)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCllCra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanForm(){
        this.txtNit.setText("");
        this.txtTelefono.setText("");
        this.txtRazonSocial.setText("");
        this.txtCorreo.setText("");
        this.txtRepresentante.setText("");
        this.txtSitioWeb.setText("");
        this.txtCllCra.setText("");
        this.txtNumero.setText("");
        this.txtBarrio.setText("");
        this.txtCiudad.setText("");       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        String barrio = this.txtBarrio.getText();
        String ciudad = this.txtCiudad.getText();
        String cllCra = this.txtCllCra.getText();
        String correo = this.txtCorreo.getText();
        String nit = this.txtNit.getText();
        String numero = this.txtNumero.getText();
        String razonSocial = this.txtRazonSocial.getText();
        String representante = this.txtRepresentante.getText();
        String sitioWeb = this.txtSitioWeb.getText();
        String telefono = this.txtTelefono.getText();
        
        if( nit.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el nit del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( razonSocial.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite la razon social del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( telefono.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el telefono del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( correo.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el correo del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( representante.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el representante del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( sitioWeb.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el sitioWeb del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( cllCra.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el cllCra de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( numero.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el numero de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( barrio.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el barrio de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( ciudad.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite la ciudad de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Proveedor proveedor = new Proveedor();
        Direccion direccion = new Direccion();
        
        proveedor.setNit(nit);
        proveedor.setRazonSocial(razonSocial);
        proveedor.setTelefono(telefono);
        proveedor.setCorreoElectronico(correo);
        proveedor.setRepresentante(representante);
        proveedor.setSitioWeb(sitioWeb);
        
        direccion.setCll_cra(cllCra);
        direccion.setNumero(numero);
        direccion.setBarrio(barrio);
        direccion.setCiudad(ciudad);
        
        proveedor.setDireccion(direccion);
                
        int result = CtrlProveedor.registrarProveedor(proveedor);
        
        
        if(result != 3){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al momento de intentar crear el usuario", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
        }else{
            
           this.cleanForm();
           
           JOptionPane.showMessageDialog(this, "El proveedor se agrego correctamente");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String nit = this.txtNit.getText();
        
         if( nit.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el nit del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        this.cleanForm();
         
        Proveedor proveedor = CtrlProveedor.buscarProveedor(nit);
        
        if(proveedor != null){
            this.txtNit.setText(proveedor.getNit());
            this.txtTelefono.setText(proveedor.getTelefono());
            this.txtRazonSocial.setText(proveedor.getRazonSocial());
            this.txtCorreo.setText(proveedor.getCorreoElectronico());
            this.txtRepresentante.setText(proveedor.getRepresentante());
            this.txtSitioWeb.setText(proveedor.getSitioWeb());
            this.txtCllCra.setText(proveedor.getDireccion().getCll_cra());
            this.txtNumero.setText(proveedor.getDireccion().getNumero());
            this.txtBarrio.setText(proveedor.getDireccion().getBarrio());
            this.txtCiudad.setText(proveedor.getDireccion().getCiudad());
        }else{
            JOptionPane.showMessageDialog(this, "No existe el proveedor con el nit " + nit, "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.cleanForm();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
        String barrio = this.txtBarrio.getText();
        String ciudad = this.txtCiudad.getText();
        String cllCra = this.txtCllCra.getText();
        String correo = this.txtCorreo.getText();
        String nit = this.txtNit.getText();
        String numero = this.txtNumero.getText();
        String razonSocial = this.txtRazonSocial.getText();
        String representante = this.txtRepresentante.getText();
        String sitioWeb = this.txtSitioWeb.getText();
        String telefono = this.txtTelefono.getText();
        
        if( nit.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el nit del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( razonSocial.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite la razon social del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( telefono.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el telefono del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( correo.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el correo del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( representante.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el representante del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( sitioWeb.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el sitioWeb del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( cllCra.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el cllCra de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( numero.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el numero de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( barrio.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el barrio de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if( ciudad.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite la ciudad de la direción", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        
        Proveedor proveedor = new Proveedor();
        Direccion direccion = new Direccion();
        
        proveedor.setNit(nit);
        proveedor.setRazonSocial(razonSocial);
        proveedor.setTelefono(telefono);
        proveedor.setCorreoElectronico(correo);
        proveedor.setRepresentante(representante);
        proveedor.setSitioWeb(sitioWeb);
        
        direccion.setCll_cra(cllCra);
        direccion.setNumero(numero);
        direccion.setBarrio(barrio);
        direccion.setCiudad(ciudad);
        
        proveedor.setDireccion(direccion);
                
        int result = CtrlProveedor.actualizar(proveedor);
        
        
        if(result != 3){
            JOptionPane.showMessageDialog(this, "El proveedor no existe", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
        }else{
            
           this.cleanForm();
           
           JOptionPane.showMessageDialog(this, "El proveedor se actualizo correctamente");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        String nit = this.txtNit.getText();
        
         if( nit.trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Digite el nit del proveedor", "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        this.cleanForm();
         
        int result = CtrlProveedor.eliminar(nit);
        
        if(result != 2){
            JOptionPane.showMessageDialog(this, "No existe el proveedor con el nit " + nit, "Gestión Proveedores", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Proveedor eliminado correctamente");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCllCra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtSitioWeb;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
