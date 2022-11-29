/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3112;

/**
 *
 * @author ASUS
 */
public class StudentStaff_3112 extends Mahasiswa_3112 {
int unitKerja;
int jmlJamKerja;
double totalPendapatanStudentStaff;

public double totalPendapatanStudentStaff_3112() {
        return totalPendapatanStudentStaff = (jmlJamKerja * 30.000);
    }
    
    public void DataStudentStaff_3112(){
        System.out.println("Jumlah Jam Kerja : " + jmlJamKerja);
    }
}




