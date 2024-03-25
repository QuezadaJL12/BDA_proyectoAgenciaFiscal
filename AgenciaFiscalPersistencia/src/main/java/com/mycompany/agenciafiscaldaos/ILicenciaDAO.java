/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Licencia;

/**
 *
 * @author Usuario
 */
public interface ILicenciaDAO {

    public Licencia agregar(Licencia licencia);

    public Licencia consultar(Long id);

}
