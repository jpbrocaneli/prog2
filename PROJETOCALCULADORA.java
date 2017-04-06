/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJCalculadora;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Juca
 */
public class PROJETOCALCULADORA {
 float x;
    float y;   
    float resultado;
    public PROJETOCALCULADORA(){
        x=0;
        y=0;
        resultado=0;
    }
    public void Soma(){
        resultado=x+y;
    }
    public void Subtração(){
        resultado=x-y;
    }
    public void Multiplicação(){
        resultado=x*y;
    }
    public void Divisão(){
        resultado=x/y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException e) { } 
        catch (ClassNotFoundException e) { } 
        catch (InstantiationException e) { } 
        catch (UnsupportedLookAndFeelException e) { }
        JFrame janela = new JANELAPRINCIPAL();
        janela.setVisible(true);
    }    
}

