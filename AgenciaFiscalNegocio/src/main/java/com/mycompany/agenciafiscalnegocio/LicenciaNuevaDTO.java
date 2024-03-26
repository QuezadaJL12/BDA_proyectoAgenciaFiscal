/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciafiscalnegocio;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class LicenciaNuevaDTO {
    
    private Calendar fecha_vencimiento;
    
    private Calendar fecha_expedicion;
    
    private String vigencia;
    
    private Float costo;

    public LicenciaNuevaDTO(Calendar fecha_vencimiento, String vigencia, Float costo) {
        this.fecha_vencimiento = fecha_vencimiento;
        this.vigencia = vigencia;
        this.costo = costo;
    }

    public LicenciaNuevaDTO(String vigencia, Float costo) {
        this.vigencia = vigencia;
        this.costo = costo;
    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Calendar getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(Calendar fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
    
    
    
}
