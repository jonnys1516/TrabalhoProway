package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import javax.swing.table.DefaultTableModel;

 
public class ControladorVisualizaProduto {
    
    // método para atualizar a lista de produtos
    public static void atualizaLista(DefaultTableModel modeloTabela){
        for(Produto produto : Listas.estoqueProdutos){
            String horaProduto = produto.getDataCadastrada().getDayOfMonth()+"/"+produto.getDataCadastrada().getMonth().getValue()+"/"+produto.getDataCadastrada().getYear()+" - "+produto.getDataCadastrada().getHour() + ":" + produto.getDataCadastrada().getMinute();
            modeloTabela.addRow(new Object[]{horaProduto, produto.getNomeProduto(), produto.getPrecoProduto(), produto.getQuantidadeProduto()});
        }
    }
    
}
