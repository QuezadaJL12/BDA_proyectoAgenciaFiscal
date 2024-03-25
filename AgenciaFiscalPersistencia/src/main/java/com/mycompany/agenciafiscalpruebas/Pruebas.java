/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalpruebas;

import com.mycompany.agenciafiscaldominio.Cliente;
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
        Calendar fecha = Calendar.getInstance();

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        EntityManager entityManager = emFactory.createEntityManager();

        Cliente cliente = new Cliente("ABC123456EGF", "Jose", "Quezada", "Renova", false, fecha, "555-432-3456");
        entityManager.getTransaction().begin();
        entityManager.persist(cliente); 
        entityManager.getTransaction().commit();

    }
}
