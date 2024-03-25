/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalpruebas;

import com.mycompany.agenciafiscaldominio.Automovil;
import com.mycompany.agenciafiscaldominio.Cliente;
import com.mycompany.agenciafiscaldominio.Placa;
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

        entityManager.getTransaction().commit();
        entityManager.persist(cliente);
        entityManager.getTransaction().begin();
        Placa placa = new Placa("aaa-123", fecha, 2000F, true);
        entityManager.persist(placa);
        placa.setCliente(cliente);
        entityManager.getTransaction().commit();
        entityManager.refresh(placa);
        entityManager.getTransaction().begin();
        Automovil automovil = new Automovil("ABC-123", "Honda", " Civic", " Negro", "2003");
        automovil.setColor("negro");
        automovil.setPlaca(placa);
        entityManager.persist(automovil);

        entityManager.getTransaction().commit();
        entityManager.refresh(automovil);

    }
}
