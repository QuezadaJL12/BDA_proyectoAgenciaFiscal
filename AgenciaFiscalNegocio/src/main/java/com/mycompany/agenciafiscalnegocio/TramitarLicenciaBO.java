/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Licencia;
import com.mycompany.agenciafiscaldominio.Tramite;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class TramitarLicenciaBO implements ITramitarLicenciaBO {

    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;
    private ITramiteDAO tramiteDAO;
    private IConexion conexion;

    private ClienteDTO clienteDTO;
    private LicenciaNuevaDTO licenciaNueva;
    private Cliente cliente;
    
    public TramitarLicenciaBO(){
        conexion = new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        this.licenciaDAO = new LicenciaDAO(conexion);
        this.tramiteDAO= new TramiteDAO(conexion);
        
    }

    @Override
    public LicenciaDTO solicitarLicencia(int años) {
        Calendar fechaActual = Calendar.getInstance();
        String vigencia = this.licenciaNueva.getVigencia();
        Float costo = this.licenciaNueva.getCosto();
        Calendar fecha_vencimiento = Calendar.getInstance();
        fecha_vencimiento.add(Calendar.YEAR, años);
        Licencia licenciaNueva = new Licencia(fecha_vencimiento, fecha_vencimiento, vigencia, costo);
        licenciaNueva.setCliente(this.cliente);
        Licencia licenciaCreada = this.licenciaDAO.agregar(licenciaNueva);

        return convertirALicenciaDTO(licenciaCreada);

    }

    @Override
    public LicenciaDTO validacionLicenciaExistencia() {
        Tramite tramite = new Tramite();
        tramite.setCliente(this.cliente);
        Tramite tramiteConsultado = tramiteDAO.consultarLicencias(tramite);
        if (tramiteConsultado == null) {
            return null;
        }
        Licencia licencia = licenciaDAO.consultar(tramiteConsultado.getId());

        return convertirALicenciaDTO(licencia);

    }

    private LicenciaDTO convertirALicenciaDTO(Licencia licencia) {
        LicenciaDTO licenciaDTO = new LicenciaDTO();
        licenciaDTO.setCosto(licencia.getCosto());
        licenciaDTO.setFecha_expedicion(licencia.getFecha_expedicion());
        licenciaDTO.setFecha_vencimiento(licencia.getFecha_vencimiento());
        return licenciaDTO;
    }

    @Override
    public void setCliente(ClienteDTO cliente) {
        this.clienteDTO = cliente;
    }

    @Override
    public ClienteDTO consultarCliente() {

        this.cliente = clienteDAO.consultar(clienteDTO.getRfc());
        if (cliente == null) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO(cliente.getRfc(), cliente.getNombre(), cliente.getApellido_paterno(), cliente.getApellido_materno(), cliente.getDiscapacitado(), cliente.getFecha_nacimiento(), cliente.getTelefono());

        return clienteDTO;

    }

    @Override
    public void setLicencia(LicenciaNuevaDTO licenciaNueva) {
        this.licenciaNueva = licenciaNueva;
    }

    @Override
    public Float calcularCosto(String año) {

        Map<String, Float> costoNormal = new HashMap<String, Float>() {
            {
                put("1 AÑÓ", 200.0F);
                put("2 AÑOS", 900.0F);
                put("3 AÑOS", 1100.0F);

            }
        };

        Map<String, Float> costoDiscapacitado = new HashMap<String, Float>() {
            {
                put("1 AÑÓ", 200.0F);
                put("2 AÑOS", 500.0F);
                put("3 AÑOS", 700.0F);
            }
        };

        if (cliente.getDiscapacitado()) {
            return costoDiscapacitado.get(año);

        } else {
            return costoNormal.get(año);
        }

    }
}
