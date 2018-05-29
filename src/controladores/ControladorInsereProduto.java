package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import java.time.LocalDateTime;
import javax.swing.JTextField;

public class ControladorInsereProduto {

    // método para verificar se já existe um produto com aquele nome
    // retorna true se sim
    private static boolean existeProduto(String produto) {
        boolean ret = false;
        for (Produto p : Listas.estoqueProdutos) {
            if (p.getNomeProduto().equals(produto)) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    // método para obter o valor inteiro de um campo
    // se o valor for -1, ocorreu um erro
    private static int valorIntQuantidade(JTextField campo) {
        int qtd = -1;
        try {
            qtd = Integer.parseInt(campo.getText().trim());
        } catch (Exception e) {
            qtd = -1;
        }
        return qtd;
    }

    // método para obter o valor double de um campo
    // se o valor for -1, ocorreu um erro
    private static double valorDoublePreco(JTextField campo) {
        double ret = -1;
        try {
            ret = Double.parseDouble(campo.getText().trim());
        } catch (Exception e) {
            ret = -1;
        }
        return ret;
    }

    // método para verificar se um campo é vazio
    private static boolean campoVazio(JTextField campo) {
        return campo.getText().trim().equals("");
    }

    // método para inserir produto
    public static void insereProduto(JTextField nome, JTextField preco, JTextField quantidade) {
        // verifica se um dos campos está incorreto
        // se estiver, bota o foco do cursor nele
        if (campoVazio(nome)) {
            ControladorMensagem.exibeMensagem("O campo produto não pode ser vazio. \nPor favor, informe novamente.");
            nome.requestFocus();
        } else if (campoVazio(preco)) {
            ControladorMensagem.exibeMensagem("O campo preço não pode ser vazio. \nPor favor, informe novamente. ");
            preco.requestFocus();
        } else if (campoVazio(quantidade)) {
            ControladorMensagem.exibeMensagem("O campo quantidade não pode ser vazio. \nPor favor, informe novamente. ");
            quantidade.requestFocus();
        } else if (valorDoublePreco(preco) == -1) {
            ControladorMensagem.exibeMensagem("O campo preço precisa ter um valor correto. \nPor favor, informe novamente.");
            preco.setText("");
            preco.requestFocus();
        } else if (valorIntQuantidade(quantidade) == -1 || valorIntQuantidade(quantidade) == 0) {
            ControladorMensagem.exibeMensagem("O campo quantidade precisa ter um valor correto, acima de zero. \nPor favor, informe novamente.");
            quantidade.setText("");
            quantidade.requestFocus();
        } else if (existeProduto(nome.getText().trim())) {
            ControladorMensagem.exibeMensagem("Já existe um produto com esse nome. \nPor favor, informe um nome diferente.");
            nome.setText("");
            nome.requestFocus();
        } else {
            ControladorMensagem.exibeMensagem("Produto inserido com sucesso.");
            LocalDateTime tempo = LocalDateTime.now();
            Produto produto = new Produto(nome.getText().trim(), valorDoublePreco(preco), valorIntQuantidade(quantidade), tempo);
            Listas.estoqueProdutos.add(produto);
            Listas.historicoProdutos.add(tempo.getDayOfMonth() + "/" + tempo.getMonth().getValue() + "/" + tempo.getYear() + " " + tempo.getHour() + ":" + tempo.getMinute() + "###Produto '" + produto.getNomeProduto() + "' adicionado, com o preço de R$" + produto.getPrecoProduto() + " e quantidade de " + produto.getQuantidadeProduto() + ".\n");
            nome.setText("");
            preco.setText("");
            quantidade.setText("");
        }

    }

}
