package com.mycompany.proyecto;

import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Imagenes {
    
    void SetImageLabel(JLabel labelName, String root){
        /*AJUSTAR IMAGEN AL JLABEL.*/
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }    
    void SetImageButton (JButton ButtonName, String root) {
        /*AJUSTAR IMAGEN AL JBUTTON.*/
        ImageIcon imagen = new ImageIcon(root);
        Icon img = new ImageIcon(imagen.getImage().getScaledInstance(ButtonName.getWidth(), ButtonName.getHeight(), Image.SCALE_DEFAULT));
        ButtonName.setIcon(img);
    } 
    
    void SetImageRadioButton (JRadioButton RadioButtonName, String root) {
        /*AJUSTAR IMAGEN AL RADIOBUTTON.*/
        ImageIcon imge = new ImageIcon(root);
        Icon imag = new ImageIcon(imge.getImage().getScaledInstance(RadioButtonName.getWidth(), RadioButtonName.getHeight(), Image.SCALE_DEFAULT));
        RadioButtonName.setIcon(imag);
    } 
        

    
    
    
   
}
