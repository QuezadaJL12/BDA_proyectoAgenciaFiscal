/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;
import com.mycompany.agenciafiscaldtos.ClienteNuevoDTO;
import com.mycompany.agenciafiscaldominio.Cliente;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IRegistroClienteBO {
    
  public void poblarClientes();
    public List<Cliente> listaClientes();
}
