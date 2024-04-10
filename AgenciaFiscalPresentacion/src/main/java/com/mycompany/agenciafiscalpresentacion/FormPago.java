/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import com.mycompany.agenciafiscalnegocio.ITramitarPlacaBO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormPago extends javax.swing.JFrame {


    private ITramitarPlacaBO tramitarPlacaBO;
    private DefaultListModel<String> modeloLista;


    /**
     * Creates new form FormPagoo
     */
    public FormPago(ITramitarPlacaBO tramitarPlacaBO) {
        initComponents();
        modeloLista = new DefaultListModel<>();
        this.tramitarPlacaBO = tramitarPlacaBO;
        llenarListDatosClientes();
        calcularCosto();
        txtTramite.setText(tramitarPlacaBO.getTipoTramitePlaca());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCosto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();
        txtTituloTramite = new javax.swing.JLabel();
        txtTramite = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCerrar.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        btnCerrar.setText("Atras");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel2.setText("Pago");

        txtCosto.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        txtCosto.setText("Costo:");

        txtMonto.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        txtMonto.setText("$0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(txtCosto)
                .addGap(137, 137, 137)
                .addComponent(txtMonto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCosto)
                    .addComponent(txtMonto))
                .addGap(44, 44, 44))
        );

        txtTituloTramite.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        txtTituloTramite.setText("Tramite:");

        txtTramite.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        txtTramite.setText("Tramite");

        btnAceptar.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscalLgo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AutoLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(35, 35, 35))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTramite)
                            .addComponent(txtTituloTramite)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnAceptar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtTituloTramite)
                .addGap(63, 63, 63)
                .addComponent(txtTramite)
                .addGap(111, 111, 111)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FormPlacas fp = new FormPlacas();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        tramitarPlacaBO.solicitarPlacaVehiculo();
        if (JOptionPane.showConfirmDialog(null, "Pago Completado \n¿Quieres registrar otra placa?", "Pago Completado!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            FormPlacas fp = new FormPlacas();
            fp.setVisible(true);

        } else {
            FormMenuPrincipal fmp = new FormMenuPrincipal();
            fmp.setVisible(true);
            this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    }

    private void calcularCosto() {
        txtMonto.setText("$" + tramitarPlacaBO.getCostoTramite());

    }

    public void limpiarListaDatos() {
        modeloLista.clear();
    }

    public void llenarListDatosClientes() {
        limpiarListaDatos();
        VehiculoDTO vehiculoDTO = tramitarPlacaBO.getVehiculo();
        modeloLista.addElement("Numero de seria: " + vehiculoDTO.getSerie());
        modeloLista.addElement("Marca: " + vehiculoDTO.getMarca());
        modeloLista.addElement("Linea: " + vehiculoDTO.getLinea());
        modeloLista.addElement("Modelo: " + vehiculoDTO.getModelo());
        modeloLista.addElement("Color: " + vehiculoDTO.getColor());
        modeloLista.addElement("RFC del dueño: " + tramitarPlacaBO.getCliente().getRfc());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtMonto;
    private javax.swing.JLabel txtTituloTramite;
    private javax.swing.JLabel txtTramite;
    // End of variables declaration//GEN-END:variables
}
