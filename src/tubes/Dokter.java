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
@Table(name = "dokter", catalog = "klinik", schema = "")
@NamedQueries({
    @NamedQuery(name = "Dokter.findAll", query = "SELECT d FROM Dokter d")
    , @NamedQuery(name = "Dokter.findByIdDokter", query = "SELECT d FROM Dokter d WHERE d.idDokter = :idDokter")
    , @NamedQuery(name = "Dokter.findByNamaDokter", query = "SELECT d FROM Dokter d WHERE d.namaDokter = :namaDokter")
    , @NamedQuery(name = "Dokter.findByJamMulai", query = "SELECT d FROM Dokter d WHERE d.jamMulai = :jamMulai")
    , @NamedQuery(name = "Dokter.findByJamSelesai", query = "SELECT d FROM Dokter d WHERE d.jamSelesai = :jamSelesai")
    , @NamedQuery(name = "Dokter.findByNoTelp", query = "SELECT d FROM Dokter d WHERE d.noTelp = :noTelp")})
public class Dokter implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dokter")
    private String idDokter;
    @Column(name = "nama_dokter")
    private String namaDokter;
    @Basic(optional = false)
    @Column(name = "jam_mulai")
    private String jamMulai;
    @Basic(optional = false)
    @Column(name = "jam_selesai")
    private String jamSelesai;
    @Column(name = "no_telp")
    private String noTelp;

    public Dokter() {
    }

    public Dokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public Dokter(String idDokter, String jamMulai, String jamSelesai) {
        this.idDokter = idDokter;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        String oldIdDokter = this.idDokter;
        this.idDokter = idDokter;
        changeSupport.firePropertyChange("idDokter", oldIdDokter, idDokter);
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        String oldNamaDokter = this.namaDokter;
        this.namaDokter = namaDokter;
        changeSupport.firePropertyChange("namaDokter", oldNamaDokter, namaDokter);
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
        hash += (idDokter != null ? idDokter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokter)) {
            return false;
        }
        Dokter other = (Dokter) object;
        if ((this.idDokter == null && other.idDokter != null) || (this.idDokter != null && !this.idDokter.equals(other.idDokter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tubes.Dokter[ idDokter=" + idDokter + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
