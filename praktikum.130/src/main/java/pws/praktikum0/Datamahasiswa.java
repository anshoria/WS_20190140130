/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.praktikum0;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author msi gf75
 */
@Entity
@Table(name = "datamahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datamahasiswa.findAll", query = "SELECT d FROM Datamahasiswa d"),
    @NamedQuery(name = "Datamahasiswa.findByNim", query = "SELECT d FROM Datamahasiswa d WHERE d.nim = :nim"),
    @NamedQuery(name = "Datamahasiswa.findByNama", query = "SELECT d FROM Datamahasiswa d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datamahasiswa.findByAlamat", query = "SELECT d FROM Datamahasiswa d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Datamahasiswa.findByProdi", query = "SELECT d FROM Datamahasiswa d WHERE d.prodi = :prodi"),
    @NamedQuery(name = "Datamahasiswa.findByFakultas", query = "SELECT d FROM Datamahasiswa d WHERE d.fakultas = :fakultas")})
public class Datamahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NIM")
    private Long nim;
    @Column(name = "NAMA")
    private String nama;
    @Column(name = "ALAMAT")
    private String alamat;
    @Column(name = "PRODI")
    private String prodi;
    @Column(name = "FAKULTAS")
    private String fakultas;

    public Datamahasiswa() {
    }

    public Datamahasiswa(Long nim) {
        this.nim = nim;
    }

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datamahasiswa)) {
            return false;
        }
        Datamahasiswa other = (Datamahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pws.praktikum0.Datamahasiswa[ nim=" + nim + " ]";
    }
    
}
