/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

/**
 *
 * @author diego
 */
public class dtDireccion {
    
    String calle1;
    String calle2;
    String numero;
    String ciudad;
    String departamento;
    int cp;
    String pais;

    public dtDireccion() {
    }
    

    public dtDireccion(String calle1, String calle2, String numero, String ciudad, String departamento, int cp, String pais) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.cp = cp;
        this.pais = pais;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
}
