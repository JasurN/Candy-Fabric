/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// new things
package candy.fabric;

import javax.swing.JFrame;
import javax.swing.UIManager;



 class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { 
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
      ContainerClass containerClass= new ContainerClass();
       EntryForm entryForm = new EntryForm();
        entryForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       entryForm.pack();
    entryForm.setLocationRelativeTo(null);
    entryForm.setVisible(true);
    
} catch (Exception ex) { 
    ex.printStackTrace(); 
}
       
      
       
    }
    
}
