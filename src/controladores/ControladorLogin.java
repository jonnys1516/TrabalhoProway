package controladores;
// @author 104936

import beans.funcionario.Funcionario;
import beans.listas.Listas;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 
public class ControladorLogin {

    // método para verificar se é um funcionário
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
    
    
    // método para ver se as credenciais são do gerente
    private static boolean autenticacaoGerente(String usuario, String senha){
        return (usuario.equals("ralf") && senha.equals("lindo"));
    }
    
    // método para verificar se um camp - login ou senha - o está vazio
    private static boolean campoVazio(JTextField text){
        return text.getText().trim().equals("");
    }
    private static boolean senhaVazia(JPasswordField pwd){
        return new String(pwd.getPassword()).equals("");
    }
    
    // método para retornar qual o acesso
    public static String retornaAutenticacao(JTextField usuario, JPasswordField senha){
        if(campoVazio(usuario)){
            ControladorMensagem.exibeMensagem("O campo de usuário não pode ser vazio. \nFalha na autenticação.");
            usuario.requestFocus();
            return "CAMPO_ERRO";
        }else if(senhaVazia(senha)){
            ControladorMensagem.exibeMensagem("O campo de senha não pode ser vazio. \nFalha na autenticação.");
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
