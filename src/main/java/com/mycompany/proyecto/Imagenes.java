package com.mycompany.proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagenes {
    
    void SetImageLabel(JLabel labelName, String root){
        /*AJUTAR IMAGEN AL JLABEL*/
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);

    }
    
    
   
}
