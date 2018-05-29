package controladores;
// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import java.time.LocalDateTime;
import javax.swing.JComboBox;

 
public class ControladorRemoveProduto {

    
    // método para atualizar o combo box com produtos
    public static void atualizaProdutos(JComboBox combo){
        for(Produto p : Listas.estoqueProdutos){
            combo.addItem(p.getNomeProduto());
        }
    }
    
    
    // método para remover o produto
    public static void removeProduto(String produto){
        if(ControladorMensagem.confirmacaoMensagem("Tem certeza que deseja remover o produto?") == 0){
            for(Produto iterador : Listas.estoqueProdutos){
                if(iterador.getNomeProduto().equals(produto)){
                    Listas.estoqueProdutos.remove(iterador);
                    break;
                }
            }
            ControladorMensagem.exibeMensagem("Produto removido com sucesso.");
            LocalDateTime tempo = LocalDateTime.now();
            Listas.historicoProdutos.add(tempo.getDayOfMonth()+"/"+tempo.getMonth().getValue()+"/"+tempo.getYear()+" "+tempo.getHour()+":"+tempo.getMinute()+"###Produto "+produto+" removido.");
        }
    }
    
}
