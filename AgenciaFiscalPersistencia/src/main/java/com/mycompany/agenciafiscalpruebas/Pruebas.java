/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalpruebas;

import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldaos.ITramiteDAO;
import com.mycompany.agenciafiscaldaos.TramiteDAO;
import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Placa;
import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class Pruebas {

     public static void main(String[] args) {
    IConexion conexion = new Conexion();

        Calendar fechaHoy = Calendar.getInstance();

        Calendar fechaAyer = Calendar.getInstance();
        fechaAyer.add(Calendar.DAY_OF_YEAR, -1); // Restar un día

        Calendar fechaManana = Calendar.getInstance();
        fechaManana.add(Calendar.DAY_OF_YEAR, 1); // Sumar un día
        String nombre = "Juan";

        ITramiteDAO tramiteDAO = new TramiteDAO(conexion);
        Tramite tramiteXD = new Tramite();
        tramiteXD.setFecha_expedicion(fechaHoy);

        for (Tramite tramite : tramiteDAO.consultarTramitesConFiltro("licencia", nombre, fechaAyer, fechaManana)) {
            System.out.println("ID: " + tramite.getId() + " Cliente nombre: " + tramite.getCliente().getNombre() + " Costo: " + tramite.getCosto() + " Tipo: " + tramite.getClass().getSimpleName() + " Fecha: " + tramite.getFecha_expedicion().getTime());

        }
        }
    }
