/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class UTS_NO3_A_3112 {

    public static void main(String[] args) {
        AsistenPraktikum_3112 n1 = new AsistenPraktikum_3112();
        AsistenPraktikum_3112 n2 = new AsistenPraktikum_3112();
        StudentStaff_3112 d1 = new StudentStaff_3112();
        StudentStaff_3112 d2 = new StudentStaff_3112();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("NIM : ");
            n1.nim = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Jurusan : ");
            n1.jurusan = br.readLine();
            System.out.println("IPK : ");
            n1.ipk = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pertemuan : ");
            n1.jmlPertemuan = Integer.parseInt(br.readLine());
                     
            System.out.println();
            
            System.out.println("NIM : ");
            n2.nim = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Jurusan : ");
            n2.jurusan = br.readLine();
            System.out.println("IPK : ");
            n2.ipk = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Pertemuan : ");
            n2.jmlPertemuan = Integer.parseInt(br.readLine());
            
            System.out.println("NIM : ");
            n1.nim = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Jurusan : ");
            n1.jurusan = br.readLine();
            System.out.println("IPK : ");
            n1.ipk = Integer.parseInt( br.readLine());
            System.out.println("Jumlah Jam Kerja : ");
            n1.jmlJamKerja = Integer.parseInt(br.readLine());
                     
            System.out.println();
            
            System.out.println("NIM : ");
            n2.nim = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Jurusan : ");
            n2.jurusan = br.readLine();
            System.out.println("IPK : ");
            n2.ipk = Integer.parseInt(br.readLine());
            System.out.println("Jumlah Jam Kerja : ");
            n2.jmlJamKerja = Integer.parseInt(br.readLine());
            
            System.out.println("=========== DATA ASISTEN PRAKTIKUM ===========");
            n1.tampilDataMahasiswa_3112();
            n1.DataAsistenPraktikum_3112();
            n1.totalPendapatanAsistenPraktikum_3112();
            
            System.out.println();
            
            n2.tampilDataMahasiswa_3112();
            n2.DataAsistenPraktikum_3112();
            n2.totalPendapatanAsistenPraktikum_3112();
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataMahasiswa_3112();
            d1.DataStudentStaff_3112();
            d1.totalPendapatanStudentStaff_3112();
            
            System.out.println();
            
            d2.tampilDataMahasiswa_3112();
            d2.DataStudentStaff_3112();
            d2.totalPendapatanStudentStaff_3112();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    
    }
}



        
        
        
        
        
        
        
    
