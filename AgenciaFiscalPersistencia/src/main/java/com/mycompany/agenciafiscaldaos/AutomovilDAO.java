/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscaldaos;

import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Tramite;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class AutomovilDAO implements IAutomovilDAO {

    private IConexion conexion;

    public AutomovilDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Automovil agregar(Automovil automovil) {
        EntityManager entityManager = conexion.obtenerConexion();
        entityManager.getTransaction().begin();
        entityManager.persist(automovil);
        entityManager.getTransaction().commit();
        entityManager.refresh(automovil);
        entityManager.close();
        return automovil;
    }

    @Override
    public Automovil consultar(Long id) {
        EntityManager entityManager = conexion.obtenerConexion();
        Automovil automovil = entityManager.find(Automovil.class, id);
        entityManager.close();
        return automovil;

    }
}
