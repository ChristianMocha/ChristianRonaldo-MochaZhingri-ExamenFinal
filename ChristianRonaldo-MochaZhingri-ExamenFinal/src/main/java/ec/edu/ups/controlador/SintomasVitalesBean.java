/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.SignoVitalFacade;
import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.SignoVital;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.annotation.FacesConfig;

/**
 *
 * @author criss
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named(value = "sintomasVitalesBean")
@SessionScoped
public class SintomasVitalesBean implements Serializable {

    private CitaMedicaFacade citaMedicaFacade;
    private SignoVitalFacade signoVitalFacade;

    private String presion;
    private String frecuencia;
    private String cardiaca;
    private String frecuenciaRespiratoria;
    private String temperatura;
    private String saturacion;
    private SignoVital signoVital;
    private List<SignoVital> signoVitales;

    private CitaMedica citaMedica;

    @PostConstruct
    public void init() {
        this.signoVitales = new ArrayList<>();

        try {
            //this.pacientes = pacienteFacade.findAll();

            System.out.println("lista de categorias en el init..");

        } catch (Exception e) {
            System.out.println("Error --- " + e);
        }

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

    public SignoVital getSignoVital() {
        return signoVital;
    }

    public void setSignoVital(SignoVital signoVital) {
        this.signoVital = signoVital;
    }

    public List<SignoVital> getSignoVitales() {
        return signoVitales;
    }

    public void setSignoVitales(List<SignoVital> signoVitales) {
        this.signoVitales = signoVitales;
    }

    public void guardarSignoVital() {
        System.out.println("entrando al metodo de guardarsintoma vital--------------------------------------");

        SignoVital cm = new SignoVital();
        cm.setPresion(this.presion);
        cm.setFrecuencia(this.frecuencia);
        cm.setCardiaca(this.cardiaca);
        cm.setFrecuenciaRespiratoria(this.frecuenciaRespiratoria);
        cm.setTemperatura(this.temperatura);
        cm.setSaturacion(this.saturacion);

        //citaMedica.setPaciente(this.paciente);
        signoVitalFacade.create(cm);
    }

}
