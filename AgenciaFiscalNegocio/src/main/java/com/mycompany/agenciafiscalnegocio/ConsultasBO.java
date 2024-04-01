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
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.LicenciaDAO;
import com.mycompany.agenciafiscaldaos.PlacaDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ConsultasBO implements IConsultasBO{
    
    private IConexion conexion;
    private IClienteDAO clienteDAO;
    private ILicenciaDAO licenciaDAO;
    private ITramiteDAO tramiteDAO;
    private IPlacaDAO placaDAO;
    private ClienteDTO filtroClienteDTO;
    private Cliente cliente;
    private ClienteDTO clienteDTO;
    

    public ConsultasBO(){
        this.conexion= new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
        licenciaDAO = new LicenciaDAO(conexion);
        tramiteDAO= new TramiteDAO(conexion);
        placaDAO= new PlacaDAO(conexion);
    }

    @Override
    public List<ClienteDTO> buscarListaCliente() {
        List<Cliente> clientes = clienteDAO.con
        
    }

    @Override
    public void setFiltroCliente(ClienteDTO filtroCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setClienteDTO(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClienteDTO getClienteDTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LicenciaDTO> licenciasCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PlacaDTO> placasCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
