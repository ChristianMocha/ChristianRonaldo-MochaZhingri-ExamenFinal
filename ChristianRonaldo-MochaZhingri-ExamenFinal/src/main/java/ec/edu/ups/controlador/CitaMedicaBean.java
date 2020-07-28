/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignoVitalFacade;
import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.SignoVital;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;
import javax.persistence.ManyToOne;

/**
 *
 * @author criss
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named(value = "citaMedicaBean")
@SessionScoped
public class CitaMedicaBean implements Serializable {

    @EJB
    private PacienteFacade pacienteFacade;
    @EJB
    private SignoVitalFacade signoVitalFacade;
    @EJB
    private CitaMedicaFacade citaMedicaFacade;

    private String fecha;
    private String hora;

    private List<String> sintomas;
    private List<String> alergias;
    private List<String> enfermedadesPrevias;
    private SignoVital signoVital;

    private Paciente paciente;
    private List<CitaMedica> citaMecicas;
    private CitaMedica citaMedica;

    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    
    private List<Paciente> pacientes;

    public CitaMedicaBean() {
    }

    @PostConstruct
    public void init() {
        this.citaMecicas = new ArrayList<>();
        this.sintomas = new ArrayList<>();
        this.enfermedadesPrevias = new ArrayList<>();
        this.alergias = new ArrayList<>();

        try {
            this.pacientes = pacienteFacade.findAll();

            System.out.println("lista de categorias en el init..");

        } catch (Exception e) {
            System.out.println("Error --- " + e);
        }

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public List<String> getEnfermedadesPrevias() {
        return enfermedadesPrevias;
    }

    public void setEnfermedadesPrevias(List<String> enfermedadesPrevias) {
        this.enfermedadesPrevias = enfermedadesPrevias;
    }

    public SignoVital getSignoVital() {
        return signoVital;
    }

    public void setSignoVital(SignoVital signoVital) {
        this.signoVital = signoVital;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<CitaMedica> getCitaMecicas() {
        return citaMecicas;
    }

    public void setCitaMecicas(List<CitaMedica> citaMecicas) {
        this.citaMecicas = citaMecicas;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    
    

    public void guardarCita() {
        System.out.println("entrando al metodo de guardar cita medica --------------------------------------");

        CitaMedica cm = new CitaMedica();
        cm.setFecha(this.fecha);
        cm.setHora(this.hora);
        
        //citaMedica.setPaciente(this.paciente);
        citaMedicaFacade.create(cm);
    }

    public void guardarPaciente() {
        /*Paciente p = new Paciente();
        p.setNombres(this.nombres);
        p.setApellidos(this.apellidos);
        p.setTelefono(this.telefono);
        p.setDireccion(this.direccion);
        p.setCorreoElectronico(this.correoElectronico);
        */
        
       // paciente.addCita(this.citaMedica);
       // pacienteFacade.edit(this.paciente);

    }

}
