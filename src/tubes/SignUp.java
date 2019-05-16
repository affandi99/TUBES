package tubes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "sign_up", catalog = "klinik", schema = "")
@NamedQueries({
    @NamedQuery(name = "SignUp.findAll", query = "SELECT s FROM SignUp s")
    , @NamedQuery(name = "SignUp.findByNamaDepan", query = "SELECT s FROM SignUp s WHERE s.namaDepan = :namaDepan")
    , @NamedQuery(name = "SignUp.findByNamaBelakang", query = "SELECT s FROM SignUp s WHERE s.namaBelakang = :namaBelakang")
    , @NamedQuery(name = "SignUp.findByUsername", query = "SELECT s FROM SignUp s WHERE s.username = :username")
    , @NamedQuery(name = "SignUp.findByJenisKelamin", query = "SELECT s FROM SignUp s WHERE s.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "SignUp.findByEmail", query = "SELECT s FROM SignUp s WHERE s.email = :email")
    , @NamedQuery(name = "SignUp.findByTanggalLahir", query = "SELECT s FROM SignUp s WHERE s.tanggalLahir = :tanggalLahir")})
public class SignUp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "nama_depan")
    private String namaDepan;
    @Column(name = "nama_belakang")
    private String namaBelakang;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "tanggal_lahir")
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;

    public SignUp() {
    }

    public SignUp(String username) {
        this.username = username;
    }

    public SignUp(String username, Date tanggalLahir) {
        this.username = username;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        String oldNamaDepan = this.namaDepan;
        this.namaDepan = namaDepan;
        changeSupport.firePropertyChange("namaDepan", oldNamaDepan, namaDepan);
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        String oldNamaBelakang = this.namaBelakang;
        this.namaBelakang = namaBelakang;
        changeSupport.firePropertyChange("namaBelakang", oldNamaBelakang, namaBelakang);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        Date oldTanggalLahir = this.tanggalLahir;
        this.tanggalLahir = tanggalLahir;
        changeSupport.firePropertyChange("tanggalLahir", oldTanggalLahir, tanggalLahir);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SignUp)) {
            return false;
        }
        SignUp other = (SignUp) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tubes.SignUp[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
