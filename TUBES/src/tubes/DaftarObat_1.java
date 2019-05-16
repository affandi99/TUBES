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
@Table(name = "daftar_obat", catalog = "klinik", schema = "")
@NamedQueries({
    @NamedQuery(name = "DaftarObat_1.findAll", query = "SELECT d FROM DaftarObat_1 d")
    , @NamedQuery(name = "DaftarObat_1.findByIdObat", query = "SELECT d FROM DaftarObat_1 d WHERE d.idObat = :idObat")
    , @NamedQuery(name = "DaftarObat_1.findByNamaObat", query = "SELECT d FROM DaftarObat_1 d WHERE d.namaObat = :namaObat")
    , @NamedQuery(name = "DaftarObat_1.findByHarga", query = "SELECT d FROM DaftarObat_1 d WHERE d.harga = :harga")})
public class DaftarObat_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_obat")
    private String idObat;
    @Column(name = "nama_obat")
    private String namaObat;
    @Column(name = "harga")
    private Integer harga;

    public DaftarObat_1() {
    }

    public DaftarObat_1(String idObat) {
        this.idObat = idObat;
    }

    public String getIdObat() {
        return idObat;
    }

    public void setIdObat(String idObat) {
        String oldIdObat = this.idObat;
        this.idObat = idObat;
        changeSupport.firePropertyChange("idObat", oldIdObat, idObat);
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        String oldNamaObat = this.namaObat;
        this.namaObat = namaObat;
        changeSupport.firePropertyChange("namaObat", oldNamaObat, namaObat);
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        Integer oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObat != null ? idObat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DaftarObat_1)) {
            return false;
        }
        DaftarObat_1 other = (DaftarObat_1) object;
        if ((this.idObat == null && other.idObat != null) || (this.idObat != null && !this.idObat.equals(other.idObat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tubes.DaftarObat_1[ idObat=" + idObat + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
