/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.LicenciaNuevaDTO;

/**
 *
 * @author Usuario
 */
public interface ITramitarLicenciaBO {

    public LicenciaDTO solicitarLicencia(int años);

    public Float calcularCosto(String string);

    public ClienteDTO consultarCliente();

    public void setCliente(ClienteDTO cliente);

    public void setLicencia(LicenciaNuevaDTO licenciaNueva);

    public LicenciaDTO validacionLicenciaExistencia();

}
