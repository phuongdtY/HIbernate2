
package Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "monhoc")
public class MonHoc implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "ma_mon")
    private int maMon;
    @Column (name = "ten_mon")
    private String tenMon;
    
    @OneToMany (mappedBy = "monHoc", fetch = FetchType.LAZY)
    private List<Diem> listDiem;

    public MonHoc() {
    }

    public MonHoc(int maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public List<Diem> getListDiem() {
        return listDiem;
    }

    public void setListDiem(List<Diem> listDiem) {
        this.listDiem = listDiem;
    }
    
    
    
    
}
