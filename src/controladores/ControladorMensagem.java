package controladores;
// @author 104936

import javax.swing.JOptionPane;

 
public class ControladorMensagem {
    
    // m�todo para exibir uma mensagem de confirma��o e retornar 0 se confirmou
    public static int confirmacaoMensagem(String msg){
        return JOptionPane.showConfirmDialog(null, msg);
    }
    
    // m�todo para exibir uma mensagem ao usu�rio
    public static void exibeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
