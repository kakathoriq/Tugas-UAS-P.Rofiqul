/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMatematika;

/**
 *
 * @author hp
 */
public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih Mtk = new MatematikaCanggih();
        
        System.out.println("========= Pertambahan ========");
        Mtk.pertambahan(12.5, 28.7, 14.2);
        Mtk.pertambahan(12, 28, 14);
        Mtk.pertambahan(23, 24);
        Mtk.pertambahan(3.4, 4.9);
        
        System.out.println("\n======== Pengurangan ========");
        Mtk.pengurangan(12.5, 28.7, 14.2);
        Mtk.pengurangan(12, 28, 14);
        Mtk.pengurangan(23, 24);
        Mtk.pengurangan(3.4, 4.9);
        
        System.out.println("\n======== Perkalian ========");
        Mtk.perkalian(12.5, 28.7, 14.2);
        Mtk.perkalian(12, 28, 14);
        Mtk.perkalian(23, 24);
        Mtk.perkalian(3.4, 4.9);
        
        System.out.println("\n======== Pembagian ========");
        Mtk.pembagian(12.5, 28.7, 14.2);
        Mtk.pembagian(12, 28, 14);
        Mtk.pembagian(23, 24);
        Mtk.pembagian(3.4, 4.9);
        
        System.out.println("\n======== Modulus ========");
        Mtk.Modulus(12.5, 28.7, 14.2);
        Mtk.Modulus(12, 28, 14);
        Mtk.Modulus(23, 24);
        Mtk.Modulus(3.4, 4.9);
}
}
