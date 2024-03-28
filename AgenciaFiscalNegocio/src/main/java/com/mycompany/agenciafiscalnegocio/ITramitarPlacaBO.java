/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import com.mycompany.agenciafiscalexcepciones.ExcepcionConsultarVehiculo;

/**
 *
 * @author Usuario
 */
public interface ITramitarPlacaBO {

    public ClienteDTO consultarCliente();

    public VehiculoDTO consultarVehiculoPorPlaca() throws ExcepcionConsultarVehiculo;

    public VehiculoDTO consVehiculo() throws ExcepcionConsultarVehiculo;

    public void setCliente(ClienteDTO cliente);

    public void setVehiculo(VehiculoDTO vehiculo);

    public void setPlaca(PlacaDTO placa);

    public PlacaDTO solicitarPlacaVehiculo();

    public LicenciaDTO validacionLicenciaExistencia();

    public Vehiculo agregarVehiculo(Placa placa);

    public Float CalcularCosto(String estado);

    public VehiculoDTO getVehiculo();

    public ClienteDTO getCliente();

    public PlacaDTO consultarPlaca();

    public PlacaDTO getPlaca();

    public Float getCostoTramite();

    public void setTipoTramitePlaca(String tipoTramite);

    public String getTipoTramitePlaca();

}
