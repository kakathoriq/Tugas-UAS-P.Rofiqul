/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AC;

/**
 *
 * @author hp
 */
public interface InterfaceAC {
    public static final int KEADAAN_HIDUP_AC=1;
    public static final int KEADAAN_MATI_AC=0;
    public static final int KEADAAN_DINGIN_AC=1;
    public static final int KEADAAN_PANAS_AC=0;

    public abstract void hidupkan();
    public abstract void matikan();
    public abstract void dinginkan();
    public abstract void panaskan();

}
