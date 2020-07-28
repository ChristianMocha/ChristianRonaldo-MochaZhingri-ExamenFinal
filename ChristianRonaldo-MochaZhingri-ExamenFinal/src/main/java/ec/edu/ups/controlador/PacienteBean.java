/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignoVitalFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;

/**
 *
 * @author criss
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named(value = "pacienteBean")
@SessionScoped
public class PacienteBean implements Serializable {

    @EJB
    private CitaMedicaFacade citaMedicaFacade;
    @EJB
    private PacienteFacade pacienteFacade;
    @EJB
    private SignoVitalFacade signoVitalfacade;
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    
    
    public PacienteBean() {
    }
    
}
