/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3112;

/**
 *
 * @author ASUS
 */
public class AsistenPraktikum_3112 extends Mahasiswa_3112 {
String mkAsistensi;
int jmlPertemuan;
double totalPendapatanAsistenPraktikum; 
    Integer jmlJamKerja;

    public double totalPendapatanAsistenPraktikum_3112() {
        return totalPendapatanAsistenPraktikum = (jmlPertemuan * 50.000);
    }
    
    public void DataAsistenPraktikum_3112(){
        System.out.println("Jumlah Pertemuan : " + jmlPertemuan);
    }
}

