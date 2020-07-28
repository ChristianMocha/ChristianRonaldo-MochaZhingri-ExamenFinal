/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author criss
 */
@Entity
public class SignoVital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String presion;
    private String frecuencia;
    private String cardiaca;
    private String frecuenciaRespiratoria;
    private String temperatura;
    private String saturacion;

    @OneToOne
    private CitaMedica citaMedica;

    public SignoVital() {
    }

    public SignoVital(String presion, String frecuencia, String cardiaca, String frecuenciaRespiratoria, String temperatura, String saturacion, CitaMedica citaMedica) {
        this.presion = presion;
        this.frecuencia = frecuencia;
        this.cardiaca = cardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacion = saturacion;
        this.citaMedica = citaMedica;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getCardiaca() {
        return cardiaca;
    }

    public void setCardiaca(String cardiaca) {
        this.cardiaca = cardiaca;
    }

    public String getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(String saturacion) {
        this.saturacion = saturacion;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SignoVital other = (SignoVital) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SignoVital{" + "codigo=" + codigo + ", presion=" + presion + ", frecuencia=" + frecuencia + ", cardiaca=" + cardiaca + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperatura=" + temperatura + ", saturacion=" + saturacion + '}';
    }
    
    
    

}
