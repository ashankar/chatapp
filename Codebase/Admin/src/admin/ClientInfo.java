/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;

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
 * @author Anand Shankar
 */
@Entity
@Table(name = "client_info", catalog = "chatdb", schema = "")
@NamedQueries({@NamedQuery(name = "ClientInfo.findAll", query = "SELECT c FROM ClientInfo c"), @NamedQuery(name = "ClientInfo.findById", query = "SELECT c FROM ClientInfo c WHERE c.id = :id"), @NamedQuery(name = "ClientInfo.findByName", query = "SELECT c FROM ClientInfo c WHERE c.name = :name"), @NamedQuery(name = "ClientInfo.findByDob", query = "SELECT c FROM ClientInfo c WHERE c.dob = :dob"), @NamedQuery(name = "ClientInfo.findBySex", query = "SELECT c FROM ClientInfo c WHERE c.sex = :sex"), @NamedQuery(name = "ClientInfo.findByQual", query = "SELECT c FROM ClientInfo c WHERE c.qual = :qual"), @NamedQuery(name = "ClientInfo.findByAddr", query = "SELECT c FROM ClientInfo c WHERE c.addr = :addr"), @NamedQuery(name = "ClientInfo.findByCity", query = "SELECT c FROM ClientInfo c WHERE c.city = :city"), @NamedQuery(name = "ClientInfo.findByState", query = "SELECT c FROM ClientInfo c WHERE c.state = :state"), @NamedQuery(name = "ClientInfo.findByCountry", query = "SELECT c FROM ClientInfo c WHERE c.country = :country"), @NamedQuery(name = "ClientInfo.findByZip", query = "SELECT c FROM ClientInfo c WHERE c.zip = :zip"), @NamedQuery(name = "ClientInfo.findByIp", query = "SELECT c FROM ClientInfo c WHERE c.ip = :ip"), @NamedQuery(name = "ClientInfo.findByRegdate", query = "SELECT c FROM ClientInfo c WHERE c.regdate = :regdate")})
public class ClientInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private String dob;
    @Column(name = "sex")
    private String sex;
    @Column(name = "qual")
    private String qual;
    @Column(name = "addr")
    private String addr;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "zip")
    private String zip;
    @Column(name = "ip")
    private String ip;
    @Column(name = "regdate")
    private String regdate;

    public ClientInfo() {
    }

    public ClientInfo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        String oldQual = this.qual;
        this.qual = qual;
        changeSupport.firePropertyChange("qual", oldQual, qual);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        String oldAddr = this.addr;
        this.addr = addr;
        changeSupport.firePropertyChange("addr", oldAddr, addr);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        String oldZip = this.zip;
        this.zip = zip;
        changeSupport.firePropertyChange("zip", oldZip, zip);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        String oldIp = this.ip;
        this.ip = ip;
        changeSupport.firePropertyChange("ip", oldIp, ip);
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        String oldRegdate = this.regdate;
        this.regdate = regdate;
        changeSupport.firePropertyChange("regdate", oldRegdate, regdate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientInfo)) {
            return false;
        }
        ClientInfo other = (ClientInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "admin.ClientInfo[id=" + id + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
