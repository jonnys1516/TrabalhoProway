package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import java.io.File;
import java.io.PrintWriter;

public class ControladorGeraTxt {
    // variaveis que definem onde o arquivo � guardado
    // file.separator � o separador de diret�rio, sistemas UNIX usam /, outros usam \
    static final String SEPARADOR_ARQUIVO = System.getProperty("file.separator");
    // user.home � a pasta do usu�rio ex: C:\Users\Nicolas
    static final String DIRETORIO_ARQUIVO = System.getProperty("user.home") + SEPARADOR_ARQUIVO + "Estoque.txt";

    // m�todo para verificar se o arquivo existe
    public static boolean existeArquivo() {
        return new File(DIRETORIO_ARQUIVO).exists();
    }

    // m�todo para remover o arquivo
    public static void removeArquivo() {
        if (existeArquivo()) {
            try {
                File arquivo = new File(DIRETORIO_ARQUIVO);
                arquivo.delete();
            } catch (Exception e) {
                ControladorMensagem.exibeMensagem("Ocorreu um erro ao manipular o arquivo. Contate o suporte.\nERRO: Erro ao remover arquivo.");
            }
        }

    }

    // m�todo para criar o arquivo
    public static File criaArquivo() {
        try {
            File arquivo = new File(DIRETORIO_ARQUIVO);
            arquivo.createNewFile();
            return arquivo;
        } catch (Exception e) {
            e.printStackTrace();
            ControladorMensagem.exibeMensagem("Ocorreu um erro ao manipular o arquivo. Contate o suporte.\nERRO: Erro ao criar aruivo.");
        }
        return null;
    }

    // m�todo para escrever relat�rio no arquivo
    public static boolean escreveArquivo(File arquivo) {
        try {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println(String.format("%-20s%-20s%-20s%-20s", "Data", "Produto", "Pre�o", "Quantidade"));
            for (Produto iterador : Listas.estoqueProdutos) {
                String data = iterador.getDataCadastrada().getDayOfMonth() + "/" + iterador.getDataCadastrada().getMonth().getValue() + "/" + iterador.getDataCadastrada().getYear() + " " + iterador.getDataCadastrada().getHour() + ":" + iterador.getDataCadastrada().getMinute();
                pw.println(String.format("%-20s%-20s%-20s%-20s", data, iterador.getNomeProduto(), "R$" + iterador.getPrecoProduto(), iterador.getQuantidadeProduto()));
            }
            pw.flush();
            pw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // m�todo para gerar o txt
    public static void geraTxt() {
        removeArquivo();
        File arquivo = criaArquivo();
        if (escreveArquivo(arquivo)) {
            ControladorMensagem.exibeMensagem("Relat�rio criado com sucesso em: \n" + DIRETORIO_ARQUIVO);
        }
    }

}
