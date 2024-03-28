/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ITramiteDAO {
    
    public Tramite consultarLicencias(Tramite tramite);
    
    public Tramite consultarPlacasCliente(Tramite tramite);
    
    public List<Tramite> consultarTramites();
    
    public List<Tramite> consultarTramiteClientes();
    
    public List<Tramite> consultarTramitesClienteNombre(String nombre);
    
    public String obtenerTipoTramite (Tramite tramite);
    
    public List<Tramite> consultarTramitesConCliente();
    
    public List<Tramite> consultarTramitesConFiltro(String tipo, String nombre, Calendar desde, Calendar hasta);
    
}
