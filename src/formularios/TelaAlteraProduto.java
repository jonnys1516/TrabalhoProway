package formularios;

// @author 104936

import beans.listas.Listas;
import beans.produto.Produto;
import controladores.ControladorAlteraProduto;


public class TelaAlteraProduto extends javax.swing.JFrame {

    public TelaAlteraProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
        ControladorAlteraProduto.atualizaProdutos(comboProdutos);
        String itemSelecionado = (String) comboProdutos.getSelectedItem();
        fieldProduto.setText(itemSelecionado);
        for(Produto p : Listas.estoqueProdutos){
            if(p.getNomeProduto().equals(itemSelecionado)){
                fieldPreco.setText(p.getPrecoProduto()+"");
                fieldQuantidade.setText(p.getQuantidadeProduto()+"");
                break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNovoProduto = new javax.swing.JLabel();
        textPreco = new javax.swing.JLabel();
        textQtd = new javax.swing.JLabel();
        buttonAlterar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        fieldProduto = new javax.swing.JTextField();
        fieldPreco = new javax.swing.JTextField();
        fieldQuantidade = new javax.swing.JTextField();
        comboProdutos = new javax.swing.JComboBox<>();
        textProduto1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textNovoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNovoProduto.setText("N. Produto: ");

        textPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textPreco.setText("Preço:");

        textQtd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textQtd.setText("Qtd: ");

        buttonAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        comboProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutosActionPerformed(evt);
            }
        });

        textProduto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textProduto1.setText("Produto: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textNovoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textProduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(comboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProduto1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNovoProduto)
                    .addComponent(fieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPreco)
                    .addComponent(fieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textQtd)
                    .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
        TelaPrincipalGerente tela = new TelaPrincipalGerente();
        tela.setVisible(true);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void comboProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutosActionPerformed
        String itemSelecionado = (String) comboProdutos.getSelectedItem();
        fieldProduto.setText(itemSelecionado);
        for(Produto p : Listas.estoqueProdutos){
            if(p.getNomeProduto().equals(itemSelecionado)){
                fieldPreco.setText(p.getPrecoProduto()+"");
                fieldQuantidade.setText(p.getQuantidadeProduto()+"");
                break;
            }
        }
    }//GEN-LAST:event_comboProdutosActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        if(ControladorAlteraProduto.alteraProduto((String) comboProdutos.getSelectedItem(), fieldProduto, fieldPreco, fieldQuantidade)){
            this.dispose();
            TelaPrincipalGerente tela = new TelaPrincipalGerente();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboProdutos;
    private javax.swing.JTextField fieldPreco;
    private javax.swing.JTextField fieldProduto;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textNovoProduto;
    private javax.swing.JLabel textPreco;
    private javax.swing.JLabel textProduto1;
    private javax.swing.JLabel textQtd;
    // End of variables declaration//GEN-END:variables

}
