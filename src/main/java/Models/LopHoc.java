/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author homna
 */
@Entity
@Table(name = "lophoc")
public class LopHoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ma_lop")
    private int maLop;

    @Column(name = "ten_lop")
    private String tenLop;

    @OneToMany(mappedBy = "lopHoc", fetch = FetchType.EAGER)
    private List<SinhVien> listSinhVien;

    public LopHoc(int maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public LopHoc() {
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void setListSinhVien(List<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "maLop=" + maLop + ", tenLop=" + tenLop + '}';
    }

}
