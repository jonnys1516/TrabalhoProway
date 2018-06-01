package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import java.time.LocalDateTime;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorAlteraProduto {

    // método para atualizar o combo box com produtos
    public static void atualizaProdutos(JComboBox combo) {
        for (Produto p : Listas.estoqueProdutos) {
            combo.addItem(p.getNomeProduto());
        }
    }

    // verifica se o produto é o mesmo
    private static boolean existeProdutoExceto(String produto, String produtoAntigo) {
        boolean ret = false;
        for (Produto p : Listas.estoqueProdutos) {
            if (p.getNomeProduto().equals(produto) && !p.getNomeProduto().equals(produtoAntigo)) {
                ret = true;
                break;
            }
        }

        return ret;
    }

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

    // método para alterar o produto
    public static boolean alteraProduto(String nomeProdutoAntigo, JTextField campoNovoNome, JTextField campoNovoPreco, JTextField campoNovaQuantidade) {
        if (campoVazio(campoNovoNome)) {
            ControladorMensagem.exibeMensagem("O campo de novo nome do produto não pode ser vazio. \nPor favor, informe novamente.");
            campoNovoNome.requestFocus();
        } else if (campoVazio(campoNovoPreco)) {
            ControladorMensagem.exibeMensagem("O campo de novo preço do produto não pode ser vazio. \nPor favor, informe novamente.");
            campoNovoPreco.requestFocus();
        } else if (campoVazio(campoNovaQuantidade)) {
            ControladorMensagem.exibeMensagem("O campo de nova quantidade do produto não pode ser vazio. \nPor favor, informe novamente.");
            campoNovaQuantidade.requestFocus();
        } else if (valorDoublePreco(campoNovoPreco) == -1) {
            ControladorMensagem.exibeMensagem("O campo de novo preço precisa ter um valor correto. \nPor favor, informe novamente.");
            campoNovoPreco.requestFocus();
        } else if (valorIntQuantidade(campoNovaQuantidade) == -1) {
            ControladorMensagem.exibeMensagem("O campo de nova quantidade precisa ter um valor correto. \nPor favor, informe novamente.");
            campoNovaQuantidade.requestFocus();
        } else if (existeProdutoExceto(campoNovoNome.getText().trim(), nomeProdutoAntigo)) {
            ControladorMensagem.exibeMensagem("Você está tentando alterar o produto para um que já existe. \nPor favor, informe novamente");
            campoNovoNome.requestFocus();
        } else {
            if (ControladorMensagem.confirmacaoMensagem("Realmente deseja alterar o produto?") == 0) {
                for (Produto p : Listas.estoqueProdutos) {
                    if (p.getNomeProduto().equals(nomeProdutoAntigo)) {
                        LocalDateTime tempo = LocalDateTime.now();
                        p.setNomeProduto(campoNovoNome.getText().trim());
                        p.setPrecoProduto(valorDoublePreco(campoNovoPreco));
                        p.setQuantidadeProduto(valorIntQuantidade(campoNovaQuantidade));
                        p.setDataCadastrada(tempo);
                        Listas.historicoProdutos.add(tempo.getDayOfMonth() + "/" + tempo.getMonth().getValue() + "/" + tempo.getYear() + " " + tempo.getHour() + ":" + tempo.getMinute() + "###Produto " + nomeProdutoAntigo + " alterado para " + campoNovoNome.getText().trim() + ".\n");
                        break;
                    }
                }
                ControladorMensagem.exibeMensagem("Produto alterado com sucesso.");
                return true;
            }else{
                return false;    
            }
        }
        return false;
    }

}
