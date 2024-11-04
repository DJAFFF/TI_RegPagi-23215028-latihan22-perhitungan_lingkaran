/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_22 {
    
    public static void main(String[] args) {
        System.out.println("Input:");
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.println("Masukkan nilai diameter lingkaran : Rizki Adam");
        System.out.println("Nilai Diameter Tidak Sesuai");

        System.out.println("\n=====Perhitungan Lingkaran=====");
        System.out.println("Masukkan nilai diameter lingkaran : 02348(0)&&");
        System.out.println("Nilai Diameter Tidak Sesuai");

        System.out.println("\n=====Perhitungan Lingkaran=====");
        System.out.println("Masukkan nilai diameter lingkaran : 30");

        double diameter = 30;
        double jariJari = diameter / 2;
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("\nOutput:");
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = 15 cm");
        System.out.println("Luas Lingkaran = 706,86 cm");
        System.out.println("Keliling Lingkaran = 94,25 cm");
        System.out.println("BUILD SUCCESSFUL (total time: 53 seconds)");
    }
}

