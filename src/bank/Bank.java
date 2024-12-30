/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author hp
 */
public class Bank {
     public int saldo;
    
    public Bank(int saldoAwal){
        saldo = saldoAwal;
    }
    
    public void SimpanUang(int Jumlah){
        saldo += Jumlah;
        System.out.println("Simpan Uang: Rp. " + Jumlah);
        System.out.println("Saldo saat ini: Rp." + saldo);
    }
    
    public void AmbilUang(int Jumlah){
        if (Jumlah <= saldo){
         saldo -= Jumlah;
         System.out.println("Ambil uang: Rp." + Jumlah);
            System.out.println("Saldo saat ini: Rp." + saldo);
        } else {
            System.out.println("Saldo Anda tidak cukup" +Jumlah);
        }
    }
}
