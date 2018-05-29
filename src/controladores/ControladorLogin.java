package controladores;
// @author 104936

import beans.funcionario.Funcionario;
import beans.listas.Listas;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 
public class ControladorLogin {

    private static boolean autenticacaoFuncionario(String usuario, String senha){
        boolean ret = false;
        for(Funcionario f : Listas.funcionariosSistema){
            if(f.getLoginFuncionario().equals(usuario) && f.getSenhaFuncionario().equals(senha)){
                ret = true;
                break;
            }
        }
        return ret;
    }
    
    private static boolean autenticacaoGerente(String usuario, String senha){
        return (usuario.equals("ralf") && senha.equals("lindo"));
    }
    
    // m�todo para verificar se um campo est� vazio
    private static boolean campoVazio(JTextField text){
        return text.getText().trim().equals("");
    }
    private static boolean senhaVazia(JPasswordField pwd){
        return new String(pwd.getPassword()).equals("");
    }
    
    
    public static String retornaAutenticacao(JTextField usuario, JPasswordField senha){
        if(campoVazio(usuario)){
            ControladorMensagem.exibeMensagem("O campo de usu�rio n�o pode ser vazio. \nFalha na autentica��o.");
            usuario.requestFocus();
            return "CAMPO_ERRO";
        }else if(senhaVazia(senha)){
            ControladorMensagem.exibeMensagem("O campo de senha n�o pode ser vazio. \nFalha na autentica��o.");
            senha.requestFocus();
            return "CAMPO_ERRO";
        }else if(autenticacaoGerente(usuario.getText().trim(), new String(senha.getPassword()).trim())){
            return "GERENTE";
        }else if(autenticacaoFuncionario(usuario.getText().trim(), new String(senha.getPassword()).trim())){
            return "FUNCIONARIO";
        }else{
            return "NAO_EXISTE";
        }
        
    }
}
