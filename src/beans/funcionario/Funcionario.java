package beans.funcionario;
// @author 104936
 
public class Funcionario {
    private String loginFuncionario;
    private String senhaFuncionario;
    private String nomeFuncionario;
    private int idadeFuncionario;

    public Funcionario(String loginFuncionario, String senhaFuncionario, String nomeFuncionario, int idadeFuncionario) {
        this.loginFuncionario = loginFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.idadeFuncionario = idadeFuncionario;
    }
    
    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    
}
