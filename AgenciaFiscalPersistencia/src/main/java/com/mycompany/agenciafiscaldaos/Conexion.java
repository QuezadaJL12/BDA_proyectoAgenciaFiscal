/*
 * Conexion.java
 */
package com.mycompany.agenciafiscaldaos;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * La clase Conexion implementa la interfaz {@link IConexion} y proporciona
 * métodos para obtener una conexión a la base de datos utilizando JPA (Java
 * Persistence API).
 *
 * La conexión se establece utilizando el nombre de unidad de persistencia
 * "AgenciaFiscalPU", que está configurada en el archivo persistence.xml.
 *
 * Esta clase es responsable de crear y devolver una instancia de EntityManager
 * que se utiliza para realizar operaciones en la base de datos.
 *
 * La clase Conexion es parte del conjunto de clases DAO (Data Access Object)
 * utilizadas para interactuar con la capa de persistencia de la aplicación.
 *
 */
public class Conexion implements IConexion {

    /**
     * Obtiene una conexión a la base de datos utilizando JPA (Java Persistence
     * API).
     *
     * @return Una instancia de EntityManager que representa la conexión a la
     * base de datos.
     */
    @Override
    public EntityManager obtenerConexion() {
        //obtenemos acceso a la fabrica de entitymanagers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        //solicitamos una entity manager (acceso a la bd)
        EntityManager entityManager = emFactory.createEntityManager();

        return entityManager;
    }

    /**
     * Constructor por defecto
     */
    public Conexion() {
    }

}
