/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author hp
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank BankAbc = new Bank(100000);
        
        System.out.println("Selamat Datang diBank ABC");
        System.out.println("Saldo saat ini: Rp." + BankAbc.saldo);
        
        BankAbc.SimpanUang(500000);
        BankAbc.AmbilUang(150000);   
    }  
}
