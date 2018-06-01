package controladores;
// @author 104936

import javax.swing.JOptionPane;

 
public class ControladorMensagem {
    
    // método para exibir uma mensagem de confirmação e retornar 0 se confirmou
    public static int confirmacaoMensagem(String msg){
        return JOptionPane.showConfirmDialog(null, msg);
    }
    
    // método para exibir uma mensagem ao usuário
    public static void exibeMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
