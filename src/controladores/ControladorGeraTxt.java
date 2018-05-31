package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import java.io.File;
import java.io.PrintWriter;

public class ControladorGeraTxt {

    static final String SEPARADOR_ARQUIVO = System.getProperty("file.separator");
    static final String DIRETORIO_ARQUIVO = System.getProperty("user.home") + SEPARADOR_ARQUIVO + "Estoque.txt";

    // método para verificar se o arquivo existe
    public static boolean existeArquivo() {
        return new File(DIRETORIO_ARQUIVO).exists();
    }

    // método para remover o arquivo
    public static void removeArquivo() {
        if (existeArquivo()) {
            try {
                File arquivo = new File(DIRETORIO_ARQUIVO);
                arquivo.delete();
            } catch (Exception e) {
                ControladorMensagem.exibeMensagem("Erro ao remover arquivo. Contate o suporte.");
            }
        }

    }

    // método para criar o arquivo
    public static File criaArquivo() {
        try {
            File arquivo = new File(DIRETORIO_ARQUIVO);
            arquivo.createNewFile();
            return arquivo;
        } catch (Exception e) {
            e.printStackTrace();
            ControladorMensagem.exibeMensagem("Erro ao criar arquivo. Contate o suporte.");
        }
        return null;
    }

    // método para escrever relatório no arquivo
    public static boolean escreveArquivo(File arquivo) {
        try {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println(String.format("%-25s%-25s%-25s%-25s", "Data", "Produto", "Preço", "Quantidade"));
            for (Produto iterador : Listas.estoqueProdutos) {
                String data = iterador.getDataCadastrada().getDayOfMonth() + "/" + iterador.getDataCadastrada().getMonth().getValue() + "/" + iterador.getDataCadastrada().getYear() + " " + iterador.getDataCadastrada().getHour() + ":" + iterador.getDataCadastrada().getMinute();
                pw.println(String.format("%-25s%-25s%-25s%-25s", data, iterador.getNomeProduto(), "R$" + iterador.getPrecoProduto(), iterador.getQuantidadeProduto()));
            }
            pw.flush();
            pw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // método para gerar o txt
    public static void geraTxt() {
        removeArquivo();
        File arquivo = criaArquivo();
        if (escreveArquivo(arquivo)) {
            ControladorMensagem.exibeMensagem("Relatório criado com sucesso em: \n" + DIRETORIO_ARQUIVO);
        }
    }

}
