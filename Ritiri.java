/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multe;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author Carlo
 */
public class Ritiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        try{   
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch (Exception e){
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cauzioni().setVisible(true);
            }
        });
    }
    
}
