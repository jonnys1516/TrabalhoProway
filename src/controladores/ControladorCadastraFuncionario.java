package controladores;
// @author 104936

import beans.funcionario.Funcionario;
import beans.listas.Listas;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class ControladorCadastraFuncionario {
    
    // método para verificar se o login já existe
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
    
    // método para verificar se o nome do funcionário já existe
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
    
    // método para verificar se um campo está vazio
    private static boolean campoVazio(JTextField text){
        return text.getText().trim().equals("");
    }
    private static boolean senhaVazia(JPasswordField pwd){
        return new String(pwd.getPassword()).equals("");
    }
    
    
    // método para cadastrar o funcionário
    public static void cadastraFuncionario(JTextField campoNome, String idade, JTextField campoUsuario, JPasswordField campoSenha){
        if(campoVazio(campoNome)){
            ControladorMensagem.exibeMensagem("O nome do funcionário não pode ser vazio. \nPor favor, informe novamente.");
            campoNome.requestFocus();
        }else if(campoVazio(campoUsuario)){
            ControladorMensagem.exibeMensagem("O campo de usuário não pode ser vazio. \nPor favor, informe novamente.");
            campoUsuario.requestFocus();
        }else if(senhaVazia(campoSenha)){
            ControladorMensagem.exibeMensagem("O campo de senha não pode ser vazio. \nPor favor, informe novamente.");
            campoSenha.requestFocus();
        }else if(existeNomeFuncionario(campoNome.getText().trim())){
            ControladorMensagem.exibeMensagem("Já existe um funcionário com esse nome. \nPor favor, informe novamente.");
            campoNome.requestFocus();
        }else if(existeLoginFuncionario(campoUsuario.getText().trim())){
            ControladorMensagem.exibeMensagem("Já existe um funcionário com esse login. \nPor favor, informe novamente.");
            campoUsuario.requestFocus();
        }else{
            ControladorMensagem.exibeMensagem("Funcionário cadastrado com sucesso.");
            
            Funcionario f = new Funcionario(campoUsuario.getText().trim(), new String(campoSenha.getPassword()).trim(), campoNome.getText().trim(), Integer.parseInt(idade));
            Listas.funcionariosSistema.add(f);
            
            campoNome.setText("");
            campoUsuario.setText("");
            campoSenha.setText("");
        }
    }
    
}
