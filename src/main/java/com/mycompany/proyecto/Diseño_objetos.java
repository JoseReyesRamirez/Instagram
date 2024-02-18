
package com.mycompany.proyecto;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JButton;
import javax.swing.UIManager;


public class Diseño_objetos {
    
    public void BordesRedondeados(int TextComponent,int Button ){
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", TextComponent);
        UIManager.put("Button.arc", Button);
    }
    
    public void trasparenciaButton(JButton boton, int x){
        if (x == 1){
            //boton.setOpaque(false);
            //QUITAMOS FONDO
            boton.setContentAreaFilled(false);
        } 
        else if (x == 2){
            //QUITAMOS BORDES
            boton.setBorderPainted(false);            
        }
        
        else if (x == 3){
            //QUITAMOS FONDO Y BORDES
            boton.setContentAreaFilled(false);
            boton.setBorderPainted(false);  
        }
        
    }
    
}




