/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import com.mycompany.agenciafiscaldaos.ClienteDAO;
import com.mycompany.agenciafiscaldaos.Conexion;
import com.mycompany.agenciafiscaldaos.IClienteDAO;
import com.mycompany.agenciafiscaldaos.IConexion;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscalutileria.Encriptacion;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Esta clase representa un objeto de negocio para el manejo de clientes.
 * Implementa la interfaz IClienteBO.
 * 
 * @author Usuario
 */
public class ClienteBO implements IClienteBO {

    private IClienteDAO clienteDAO;
    private IConexion conexion;
    
    
    public ClienteBO(){
        conexion=new Conexion();
        this.clienteDAO = new ClienteDAO(conexion);
    }
    
    /**
     * Método para poblar la base de datos con clientes. Verifica si un cliente
     * ya existe antes de agregarlo a la base de datos.
     *
     * @return true si se pudieron poblar los clientes correctamente, false si
     * no.
     */

    @Override
    public Boolean poblarClientes() {
        List<Cliente> listaClientes = this.listaClientes();

        for (int i = 0; i < listaClientes.size(); i++) {
            if (clienteDAO.consultar(listaClientes.get(i).getRfc()) != null) {
                return false;
            }
            clienteDAO.agregar(listaClientes.get(i));
        }
        return true;
    }
    
      /**
     * Método para obtener una lista de clientes predefinidos.
     *
     * @return Una lista de objetos Cliente.
     */

    @Override
    public List<Cliente> listaClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Calendar fechaNacimientoMayor = Calendar.getInstance();
        fechaNacimientoMayor.set(1990, Calendar.JANUARY, 1);

        Calendar fechaNacimientoMenor = Calendar.getInstance();
        fechaNacimientoMenor.set(2007, Calendar.JANUARY, 1);

        try {

            listaClientes.add(new Cliente("GHI123456KL21", "Jose ", "Quezada", "Valenzuela", false, fechaNacimientoMenor, Encriptacion.encrypt("55551234567")));
            listaClientes.add(new Cliente("JKL123456MN22", "Sergio", "Castro", "Morales", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234588")));
            listaClientes.add(new Cliente("LMN123456OP23", "Carmen", "Morales", "Ruiz", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234589")));
            listaClientes.add(new Cliente("MNO123456PQ24", "Ricardo", "Ruiz", "Jiménez", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234590")));
            listaClientes.add(new Cliente("NOP123456QR25", "Verónica", "Jiménez", "Fernando", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234591")));
            listaClientes.add(new Cliente("OPQ123456RS26", "Marcos", "Fernando", "Herrera", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234592")));
            listaClientes.add(new Cliente("PQR123456ST27", "Patricia", "Herrera", "Mendoza", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234593")));
            listaClientes.add(new Cliente("QRS123456TU28", "Omar", "Mendoza", "Vargas", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234594")));
            listaClientes.add(new Cliente("RST123456UV29", "Claudia", "Vargas", "Reyes", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234595")));
            listaClientes.add(new Cliente("STU123456VW30", "Jose", "Quezada", "Renova", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234596")));
            listaClientes.add(new Cliente("TUV123456WX31", "Brenda", "Bravo", "Cruz", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234597")));
            listaClientes.add(new Cliente("UVW123456XY32", "Gustavo", "Cruz", "Ortiz", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234598")));
            listaClientes.add(new Cliente("VWX123456YZ33", "Teresa", "Ortiz", "Gil", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234599")));
            listaClientes.add(new Cliente("WXY123456ZA34", "Yosef", "Quezada", "Renova", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234600")));
            listaClientes.add(new Cliente("XYZ123456AB35", "Natalia", "Luna", "Molina", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234601")));
            listaClientes.add(new Cliente("YZA123456BC36", "Adrián", "Molina", "Prieto", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234602")));
            listaClientes.add(new Cliente("ZAB123456CD37", "Lucía", "Prieto", "Vázquez", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234603")));
            listaClientes.add(new Cliente("ABC123456DE38", "Hugo", "Vázquez", "Blanco", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234604")));
            listaClientes.add(new Cliente("BCD123456EF39", "Silvia", "Blanco", "Navarro", false, fechaNacimientoMenor, Encriptacion.encrypt("5551234605")));
            listaClientes.add(new Cliente("CDE123456FG40", "Álvaro", "Navarro", "Torres", true, fechaNacimientoMayor, Encriptacion.encrypt("5551234606")));

        } catch (Exception e) {
            System.out.println("Error en la encriptacion: " + e.getMessage());

        }

        return listaClientes;

    }

}
