package controladores;
// @author 104936

import beans.funcionario.Funcionario;
import beans.listas.Listas;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class ControladorCadastraFuncionario {
    
    // m�todo para verificar se o login j� existe
    private static boolean existeLoginFuncionario(String login){
        boolean ret = false;
        for(Funcionario f : Listas.funcionariosSistema){
            if(f.getLoginFuncionario().equals(login)){
                ret = true;
                break;
            }
        }
        return ret;
    }
    
    // m�todo para verificar se o nome do funcion�rio j� existe
    private static boolean existeNomeFuncionario(String funcionario){
        boolean ret = false;
        for(Funcionario f : Listas.funcionariosSistema){
            if(f.getNomeFuncionario().equals(funcionario)){
                ret = true;
                break;
            }
        }
        return ret;
    }
    
    // m�todo para verificar se um campo est� vazio
    private static boolean campoVazio(JTextField text){
        return text.getText().trim().equals("");
    }
    private static boolean senhaVazia(JPasswordField pwd){
        return new String(pwd.getPassword()).equals("");
    }
    
    
    // m�todo para cadastrar o funcion�rio
    public static void cadastraFuncionario(JTextField campoNome, String idade, JTextField campoUsuario, JPasswordField campoSenha){
        if(campoVazio(campoNome)){
            ControladorMensagem.exibeMensagem("O nome do funcion�rio n�o pode ser vazio. \nPor favor, informe novamente.");
            campoNome.requestFocus();
        }else if(campoVazio(campoUsuario)){
            ControladorMensagem.exibeMensagem("O campo de usu�rio n�o pode ser vazio. \nPor favor, informe novamente.");
            campoUsuario.requestFocus();
        }else if(senhaVazia(campoSenha)){
            ControladorMensagem.exibeMensagem("O campo de senha n�o pode ser vazio. \nPor favor, informe novamente.");
            campoSenha.requestFocus();
        }else if(existeNomeFuncionario(campoNome.getText().trim())){
            ControladorMensagem.exibeMensagem("J� existe um funcion�rio com esse nome. \nPor favor, informe novamente.");
            campoNome.requestFocus();
        }else if(existeLoginFuncionario(campoUsuario.getText().trim())){
            ControladorMensagem.exibeMensagem("J� existe um funcion�rio com esse login. \nPor favor, informe novamente.");
            campoUsuario.requestFocus();
        }else{
            ControladorMensagem.exibeMensagem("Funcion�rio cadastrado com sucesso.");
            
            Funcionario f = new Funcionario(campoUsuario.getText().trim(), new String(campoSenha.getPassword()).trim(), campoNome.getText().trim(), Integer.parseInt(idade));
            Listas.funcionariosSistema.add(f);
            
            campoNome.setText("");
            campoUsuario.setText("");
            campoSenha.setText("");
        }
    }
    
}
