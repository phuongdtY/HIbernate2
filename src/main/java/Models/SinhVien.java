/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
/**
 *
 * @author homna
 */
@Entity
@Table(name = "sinhvien")
public class SinhVien implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_sinh_vien")
    private int maSinhVien;
    
    @Column(name = "ten_sinh_vien")
    private String tenSinhVien;
    
    @Column(name = "dia_chi")
    private String diaChi;
    
    @ManyToOne
    @JoinColumn(name = "ma_lop", nullable = true)
    private LopHoc lopHoc;
    
    @OneToMany(mappedBy = "SinhVien", fetch = FetchType.EAGER)
    private List<Diem> listDiem;
    

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String tenSinhVien, String diaChi, LopHoc lopHoc) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diaChi = diaChi;
        this.lopHoc = lopHoc;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<Diem> getListDiem() {
        return listDiem;
    }

    public void setListDiem(List<Diem> listDiem) {
        this.listDiem = listDiem;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

   

}
