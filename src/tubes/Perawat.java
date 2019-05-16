package tubes;

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

@Entity
@Table(name = "perawat", catalog = "klinik", schema = "")
@NamedQueries({
    @NamedQuery(name = "Perawat.findAll", query = "SELECT p FROM Perawat p")
    , @NamedQuery(name = "Perawat.findByNama", query = "SELECT p FROM Perawat p WHERE p.nama = :nama")
    , @NamedQuery(name = "Perawat.findByJamMulai", query = "SELECT p FROM Perawat p WHERE p.jamMulai = :jamMulai")
    , @NamedQuery(name = "Perawat.findByJamSelesai", query = "SELECT p FROM Perawat p WHERE p.jamSelesai = :jamSelesai")
    , @NamedQuery(name = "Perawat.findByNoTelp", query = "SELECT p FROM Perawat p WHERE p.noTelp = :noTelp")})
public class Perawat implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jam_mulai")
    private String jamMulai;
    @Basic(optional = false)
    @Column(name = "jam_selesai")
    private String jamSelesai;
    @Basic(optional = false)
    @Column(name = "no_telp")
    private String noTelp;

    public Perawat() {
    }

    public Perawat(String nama) {
        this.nama = nama;
    }

    public Perawat(String nama, String jamMulai, String jamSelesai, String noTelp) {
        this.nama = nama;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        String oldJamMulai = this.jamMulai;
        this.jamMulai = jamMulai;
        changeSupport.firePropertyChange("jamMulai", oldJamMulai, jamMulai);
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        String oldJamSelesai = this.jamSelesai;
        this.jamSelesai = jamSelesai;
        changeSupport.firePropertyChange("jamSelesai", oldJamSelesai, jamSelesai);
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        String oldNoTelp = this.noTelp;
        this.noTelp = noTelp;
        changeSupport.firePropertyChange("noTelp", oldNoTelp, noTelp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nama != null ? nama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perawat)) {
            return false;
        }
        Perawat other = (Perawat) object;
        if ((this.nama == null && other.nama != null) || (this.nama != null && !this.nama.equals(other.nama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tubes.Perawat[ nama=" + nama + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
