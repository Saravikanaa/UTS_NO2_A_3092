/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.utsno2_21103092;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class UTSNO2_21103092 {

    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee();
        CommissionEmployee ce = new CommissionEmployee();

        ProjectPlanner pp = new ProjectPlanner();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama = br.readLine();
            System.out.print("NIP: ");
            se.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            ce.Nama = br.readLine();
            System.out.print("NIP: ");
            ce.NIP = br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan = Float.parseFloat(br.readLine());
            ce.TotalGaji();
            ce.TampilData();
            
            System.out.print("Nama: ");
            pp.Nama = br.readLine();
            System.out.print("NIP: ");
            pp.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    private static class CommissionEmployee {

        private String Nama;
        private String NIP;
        private float GajiPokok;
        private float Komisi;
        private float TotalPenjualan;

        public CommissionEmployee() {
        }

        private void TotalGaji() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void TampilData() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

    

