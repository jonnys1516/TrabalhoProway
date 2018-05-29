package controladores;
// @author 104936

import javax.swing.JOptionPane;

 
public class ControladorMensagem {

    public static int confirmacaoMensagem(String msg){
        return JOptionPane.showConfirmDialog(null, msg);
    }
    
    public static void exibeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
