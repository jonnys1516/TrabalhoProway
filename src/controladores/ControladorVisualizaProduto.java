package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import javax.swing.table.DefaultTableModel;

 
public class ControladorVisualizaProduto {

    public static void atualizaLista(DefaultTableModel modeloTabela){
        for(Produto produto : Listas.estoqueProdutos){
            String horaProduto = produto.getDataCadastrada().getHour() + ":" + produto.getDataCadastrada().getMinute();
            modeloTabela.addRow(new Object[]{horaProduto, produto.getNomeProduto(), produto.getPrecoProduto(), produto.getQuantidadeProduto()});
        }
    }
    
}
