/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author criss
 */
@Entity
public class CitaMedica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String fecha;
    private String hora;


    private List<String> sintomas;
    private List<String> alergias;
    private List<String> enfermedadesPrevias;

    
    @OneToOne(mappedBy = "citaMedica", cascade = CascadeType.ALL, orphanRemoval = true)
    private SignoVital signoVital;
    
    @ManyToOne
    private Paciente paciente;

    public CitaMedica() {
          
          this.sintomas = new ArrayList<>();
          this.alergias = new ArrayList<>();
          this.enfermedadesPrevias = new ArrayList<>();
    }

    public CitaMedica(String fecha, String hora, List<String> sintomas, List<String> alergias, List<String> enfermedadesPrevias, SignoVital signoVital, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.sintomas = sintomas;
        this.alergias = alergias;
        this.enfermedadesPrevias = enfermedadesPrevias;
        this.signoVital = signoVital;
        this.paciente = paciente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.codigo;
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
        final CitaMedica other = (CitaMedica) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "codigo=" + codigo + ", fecha=" + fecha + ", hora=" + hora + ", sintomas=" + sintomas + ", alergias=" + alergias + ", enfermedadesPrevias=" + enfermedadesPrevias + '}';
    }
    
   
    

}
