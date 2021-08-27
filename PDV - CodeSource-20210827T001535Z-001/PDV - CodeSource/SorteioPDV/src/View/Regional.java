/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author yargorodrigues
 */
@Entity
@Table(name = "regional", catalog = "bdsorteiopdv", schema = "")
@NamedQueries({
    @NamedQuery(name = "Regional.findAll", query = "SELECT r FROM Regional r")
    , @NamedQuery(name = "Regional.findByIdRegional", query = "SELECT r FROM Regional r WHERE r.idRegional = :idRegional")
    , @NamedQuery(name = "Regional.findByNomeRegional", query = "SELECT r FROM Regional r WHERE r.nomeRegional = :nomeRegional")
    , @NamedQuery(name = "Regional.findByResponsavelRegional", query = "SELECT r FROM Regional r WHERE r.responsavelRegional = :responsavelRegional")
    , @NamedQuery(name = "Regional.findByEndereco", query = "SELECT r FROM Regional r WHERE r.endereco = :endereco")
    , @NamedQuery(name = "Regional.findByTelefone", query = "SELECT r FROM Regional r WHERE r.telefone = :telefone")})
public class Regional implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_regional")
    private Integer idRegional;
    @Basic(optional = false)
    @Column(name = "nome_regional")
    private String nomeRegional;
    @Basic(optional = false)
    @Column(name = "responsavel_regional")
    private String responsavelRegional;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;

    public Regional() {
    }

    public Regional(Integer idRegional) {
        this.idRegional = idRegional;
    }

    public Regional(Integer idRegional, String nomeRegional, String responsavelRegional) {
        this.idRegional = idRegional;
        this.nomeRegional = nomeRegional;
        this.responsavelRegional = responsavelRegional;
    }

    public Integer getIdRegional() {
        return idRegional;
    }

    public void setIdRegional(Integer idRegional) {
        Integer oldIdRegional = this.idRegional;
        this.idRegional = idRegional;
        changeSupport.firePropertyChange("idRegional", oldIdRegional, idRegional);
    }

    public String getNomeRegional() {
        return nomeRegional;
    }

    public void setNomeRegional(String nomeRegional) {
        String oldNomeRegional = this.nomeRegional;
        this.nomeRegional = nomeRegional;
        changeSupport.firePropertyChange("nomeRegional", oldNomeRegional, nomeRegional);
    }

    public String getResponsavelRegional() {
        return responsavelRegional;
    }

    public void setResponsavelRegional(String responsavelRegional) {
        String oldResponsavelRegional = this.responsavelRegional;
        this.responsavelRegional = responsavelRegional;
        changeSupport.firePropertyChange("responsavelRegional", oldResponsavelRegional, responsavelRegional);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegional != null ? idRegional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regional)) {
            return false;
        }
        Regional other = (Regional) object;
        if ((this.idRegional == null && other.idRegional != null) || (this.idRegional != null && !this.idRegional.equals(other.idRegional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Regional[ idRegional=" + idRegional + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
