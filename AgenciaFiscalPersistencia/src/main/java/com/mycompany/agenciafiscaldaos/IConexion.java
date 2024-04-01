/**
 * IConexion.java
 */
package com.mycompany.agenciafiscaldaos;

import javax.persistence.EntityManager;

/**
 *
 * Esta interfaz define el contrato para obtener una conexión a la base de datos
 * a través de un EntityManager.
 *
 * Las implementaciones de esta interfaz proporcionan métodos para obtener y
 * manejar una conexión a la base de datos.
 *
 * @author Usuario
 */
public interface IConexion {

    /**
     * Obtiene una conexión a la base de datos a través de un EntityManager.
     *
     * @return La conexión a la base de datos.
     */
    public EntityManager obtenerConexion();

}
