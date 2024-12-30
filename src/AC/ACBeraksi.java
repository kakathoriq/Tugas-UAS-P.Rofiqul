/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author hp
 */
public class ACBeraksi {
     public static void main(String[] args) {
        AC acku = new AC();
        System.out.println("\nstatus Ac saat ini: Mati");
        acku.hidupkan();
        acku.matikan();
        acku.matikan();
        acku.hidupkan();
        acku.hidupkan();
        
        System.out.println("\nstatus suhu Ac saat ini: Panas");
        acku.dinginkan();
        acku.panaskan();
        acku.panaskan();
        acku.dinginkan();
        acku.dinginkan();
        
    }
}
