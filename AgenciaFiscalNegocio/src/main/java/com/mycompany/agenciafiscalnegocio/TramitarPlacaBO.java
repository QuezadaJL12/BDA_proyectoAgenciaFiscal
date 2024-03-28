/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.IAutomovilDAO;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ILicenciaDAO;
import com.mycompany.agenciafiscaldaos.IPlacaDAO;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.IVehiculoDAO;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Vehiculo;
import com.mycompany.agenciafiscaldtos.ClienteDTO;
import com.mycompany.agenciafiscaldtos.LicenciaDTO;
import com.mycompany.agenciafiscaldtos.PlacaDTO;
import com.mycompany.agenciafiscaldtos.VehiculoDTO;
import com.mycompany.agenciafiscalexcepciones.ExcepcionConsultarVehiculo;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class TramitarPlacaBO implements ITramitarPlacaBO {

    private IConexion conexion;

    private IClienteDAO clienteDAO;
    private IVehiculoDAO vehiculoDAO;
    private IPlacaDAO placaDAO;
    private IAutomovilDAO automovilDAO;
    private ITramiteDAO tramiteDAO;
    private ILicenciaDAO licenciaDAO;

    private VehiculoDTO vehiculoDTO;
    private PlacaDTO placaDTO;
    private ClienteDTO clienteDTO;

    private Placa placa;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Float costoTramite;
    private String tipoTramitePlaca;

    @Override
    public void setPlaca(PlacaDTO placa) {
        this.placaDTO = placa;
    }

    @Override
    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculoDTO = vehiculo;
    }

    @Override
    public PlacaDTO solicitarPlacaVehiculo() {
        Calendar fecha = Calendar.getInstance();
        Placa placa = new Placa(generarSeriePlaca(), fecha, placaDTO.getCosto(), true);
        placa.setCliente(cliente);

        Placa placaNueva = placaDAO.agregar(placa);
        Vehiculo vehiculo = this.agregarVehiculo(placaNueva);
        if (this.placa != null) {
            actualizarPlaca(this.placa);

        }
        return convertirAPlacaDTO(placaNueva);
    }

    private void actualizarPlaca(Placa placa) {
        Calendar fechaActual = Calendar.getInstance();
        placa.setFecha_recepcion(fechaActual);
        placa.setEstado(false);
        placaDAO.actualizar(placa);
    }

    private String generarSeriePlaca() {
        // generador de letras aleatorias
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        // Generar las 3 letras
        
        for (int i = 0; i < 3; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            sb.append(letra);
            
        }
        
        // Separador "-"
        sb.append("-");
        
        //Generador de numeros aleatorios
        String numeros= "0123456789";
        
        //Generar los 3 digitos
        for (int i = 0; i < 3; i++) {
            char numero = numeros.charAt(random.nextInt(numeros.length()));
            sb.append(numero);
        }
        return sb.toString();
    }
    
    private PlacaDTO convertirAPlacaDTO(Placa placa){
        PlacaDTO placaDTO= new PlacaDTO();
    }

}
