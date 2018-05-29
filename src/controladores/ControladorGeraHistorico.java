package controladores;
// @author 104936

import beans.listas.Listas;
import javax.swing.table.DefaultTableModel;

 
public class ControladorGeraHistorico {
    
    public static void atualizaRelatorio(DefaultTableModel modelo){
        for(String iterador : Listas.historicoProdutos){
            String[] vetor = iterador.split("###");
            modelo.addRow(new Object[]{vetor[0], vetor[1]});
        }
    }
    
}
