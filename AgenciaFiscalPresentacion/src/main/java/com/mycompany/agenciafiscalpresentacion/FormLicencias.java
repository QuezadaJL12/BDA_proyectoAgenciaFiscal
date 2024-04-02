/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import com.mycompany.agenciafiscalnegocio.ITramitarLicenciaBO;
import com.mycompany.agenciafiscalnegocio.TramitarLicenciaBO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormLicencias extends javax.swing.JFrame {
    
    private DefaultListModel<String> modeloLista;
    private ITramitarLicenciaBO tramitarLicenciaBO;
    private ClienteDTO clienteDTO;

    /**
     * Creates new form FormLicenciass
     */
    public FormLicencias() {
        initComponents();
         modeloLista = new DefaultListModel<>();
        this.tramitarLicenciaBO = new TramitarLicenciaBO();
        mostrarBotones(false);
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
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panCosto = new javax.swing.JPanel();
        txtCosto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();
        txtRfc = new javax.swing.JLabel();
        txfRfc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtVigencia = new javax.swing.JLabel();
        cbxVigencia = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Licencias");
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 36)); // NOI18N

        btnCerrar.setText("Cancelar");
        btnCerrar.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCosto.setText("Costo:");
        txtCosto.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N

        txtMonto.setText("$0.0");
        txtMonto.setFont(new java.awt.Font("Constantia", 0, 60)); // NOI18N

        javax.swing.GroupLayout panCostoLayout = new javax.swing.GroupLayout(panCosto);
        panCosto.setLayout(panCostoLayout);
        panCostoLayout.setHorizontalGroup(
            panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCostoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtCosto)
                .addGap(169, 169, 169)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCostoLayout.setVerticalGroup(
            panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCostoLayout.createSequentialGroup()
                .addGroup(panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtRfc.setText("RFC:");
        txtRfc.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N

        txfRfc.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N

        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtVigencia.setText("Vigencia:");
        txtVigencia.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N

        cbxVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Año", "2 Años", "3 Años" }));
        cbxVigencia.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        cbxVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVigenciaActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscalLgo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(260, 260, 260)
                .addComponent(btnCerrar)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtVigencia)
                        .addGap(47, 47, 47)
                        .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRfc)
                        .addGap(26, 26, 26)
                        .addComponent(txfRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(btnBuscar)
                .addGap(359, 359, 359))
            .addComponent(panCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar)
                            .addComponent(jLabel2))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(panCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRfc)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxVigencia)
                    .addComponent(txtVigencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(btnAceptar)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FormTramites ftl = new FormTramites();
        ftl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cbxVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVigenciaActionPerformed

    }//GEN-LAST:event_cbxVigenciaActionPerformed
public void limpiarDatos() {
        txtMonto.setText("$0.0");
        txfRfc.setText("");
        cbxVigencia.setSelectedIndex(0);
        modeloLista.clear();
        tramitarLicenciaBO = new TramitarLicenciaBO();
        clienteDTO = null;
    }

    public void actualizarCosto(String año) {
        if (clienteDTO == null) {
            return;
        }
        txtMonto.setText("$" + tramitarLicenciaBO.calcularCosto(año));
    }

    public void limpiarListaDatosCliente() {
        modeloLista.clear();
    }

    public void llenarListDatosClientes(ClienteDTO clienteDTO) {
        limpiarListaDatosCliente();
        modeloLista.addElement("Nombre: " + clienteDTO.getNombre() + " " + clienteDTO.getApellido_paterno() + " " + clienteDTO.getApellido_materno());
        modeloLista.addElement("RFC: " + clienteDTO.getRfc());
        modeloLista.addElement("Telefono: " + clienteDTO.getTelefono());
        modeloLista.addElement("Fecha de Nacimiento: " + formatoFecha(clienteDTO.getFecha_nacimiento()));
        if (clienteDTO.getDiscapacitado()) {
            modeloLista.addElement("Discapacitado: Si");
        } else {
            modeloLista.addElement("Discapacitado: No");
        }

      
    }

    public String formatoFecha(Calendar calendar) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(calendar.getTime());
        return fechaFormateada;
    }

    private int calcularEdad(Calendar nacimiento) {

        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;

    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        LicenciaDTO licenciaExistente = tramitarLicenciaBO.validacionLicenciaExistencia();
        
        if (licenciaExistente != null) {
            int response = JOptionPane.showConfirmDialog(this, "Existe una licencia vigente hasta " + formatoFecha(licenciaExistente.getFecha_vencimiento()) + "¿Desea registrar una nueva?");
            if (response != JOptionPane.YES_OPTION) {
                return;
            }
        }
        LicenciaDTO licenciaDTO = tramitarLicencia();

        if (licenciaDTO != null) {
            JOptionPane.showMessageDialog(this, "Licencia creada ");
            mostrarBotones(false);
            limpiarDatos();

        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido crear ");
        }
        limpiarDatos();

        }

        public void mostrarBotones(boolean flag) {
            txtVigencia.setVisible(flag);
            cbxVigencia.setVisible(flag);
            btnAceptar.setVisible(flag);
        }

        private LicenciaDTO tramitarLicencia() {
            String montoTexto = txtMonto.getText().substring(1);
            float monto = Float.parseFloat(montoTexto);
            LicenciaNuevaDTO licenciaNueva = new LicenciaNuevaDTO((String) cbxVigencia.getSelectedItem(), monto);
            tramitarLicenciaBO.setLicencia(licenciaNueva);
            char anios = String.valueOf(cbxVigencia.getSelectedItem()).charAt(0);
            LicenciaDTO licencia = tramitarLicenciaBO.solicitarLicencia(Integer.parseInt(String.valueOf(anios)));
            return licencia;
            
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txfRfc.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El RFC tiene que estar lleno");
            return;
        }
        ClienteDTO clienteRFC = new ClienteDTO(txfRfc.getText());
        tramitarLicenciaBO.setCliente(clienteRFC);
        clienteDTO = tramitarLicenciaBO.consultarCliente();
        if (clienteDTO == null) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado cliente con RFC " + txfRfc.getText());
            return;
        }
        if (calcularEdad(clienteDTO.getFecha_nacimiento()) < 18) {
            JOptionPane.showMessageDialog(this, "El cliente tiene que ser mayor de edad");
            return;
        }
        llenarListDatosClientes(clienteDTO);
        actualizarCosto((String) cbxVigencia.getSelectedItem());
        mostrarBotones(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbxVigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panCosto;
    private javax.swing.JTextField txfRfc;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtMonto;
    private javax.swing.JLabel txtRfc;
    private javax.swing.JLabel txtVigencia;
    // End of variables declaration//GEN-END:variables
}
