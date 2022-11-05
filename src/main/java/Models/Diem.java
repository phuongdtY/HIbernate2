/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author homna
 */
@Entity
@Table (name = "diem")
public class Diem implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int maDiem;
    
    @ManyToOne
    @JoinColumn (name = "ma_sinh_vien", nullable = false)
    private SinhVien SinhVien;
    
    @ManyToOne
    @JoinColumn (name = "ma_mon", nullable = false)
    private MonHoc monHoc;
    
    @Column (name = "diem")
    private float diem;

    public Diem() {
    }

    public Diem(int maDiem, SinhVien SinhVien, MonHoc monHoc, float diem) {
        this.maDiem = maDiem;
        this.SinhVien = SinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    

    public int getMaDiem() {
        return maDiem;
    }

    public void setMaDiem(int maDiem) {
        this.maDiem = maDiem;
    }

    public SinhVien getSinhVien() {
        return SinhVien;
    }

    public void setSinhVien(SinhVien SinhVien) {
        this.SinhVien = SinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }


    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
    
    
}
