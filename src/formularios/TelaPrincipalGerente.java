package formularios;

// @author 104936

import beans.listas.Listas;
import controladores.ControladorMensagem;


public class TelaPrincipalGerente extends javax.swing.JFrame {

    public TelaPrincipalGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadastrarFuncionario = new javax.swing.JButton();
        buttonCadastrarProduto = new javax.swing.JButton();
        buttonRemoverProduto = new javax.swing.JButton();
        buttonVisualizarEstoque = new javax.swing.JButton();
        buttonAlterarProduto = new javax.swing.JButton();
        buttonEncerrarSessao = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonVisualizarHistorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal: Gerente");
        setResizable(false);

        buttonCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/funcionario.png"))); // NOI18N
        buttonCadastrarFuncionario.setText("Cadastrar Funcionário");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });

        buttonCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/produto.png"))); // NOI18N
        buttonCadastrarProduto.setText("Cadastrar Produto");
        buttonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarProdutoActionPerformed(evt);
            }
        });

        buttonRemoverProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/remover.png"))); // NOI18N
        buttonRemoverProduto.setText("Remover Produto");
        buttonRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverProdutoActionPerformed(evt);
            }
        });

        buttonVisualizarEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVisualizarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/estoque.png"))); // NOI18N
        buttonVisualizarEstoque.setText("Visualizar Estoque");
        buttonVisualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarEstoqueActionPerformed(evt);
            }
        });

        buttonAlterarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/alterar2.png"))); // NOI18N
        buttonAlterarProduto.setText("Alterar Produto");
        buttonAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarProdutoActionPerformed(evt);
            }
        });

        buttonEncerrarSessao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEncerrarSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/encerrar.png"))); // NOI18N
        buttonEncerrarSessao.setText("Encerrar Sessão");
        buttonEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEncerrarSessaoActionPerformed(evt);
            }
        });

        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/sair.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        buttonVisualizarHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVisualizarHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/historico.png"))); // NOI18N
        buttonVisualizarHistorico.setText("Visualizar Histórico");
        buttonVisualizarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonVisualizarEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVisualizarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVisualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarEstoqueActionPerformed
        if(Listas.estoqueProdutos.isEmpty()){
            ControladorMensagem.exibeMensagem("Não há nenhum produto no estoque.");
        }else{
            this.dispose();
            TelaVisualizaProduto tela = new TelaVisualizaProduto("ACESSO_GERENTE");
            tela.setVisible(true);
        }
        
    }//GEN-LAST:event_buttonVisualizarEstoqueActionPerformed

    private void buttonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarProdutoActionPerformed
        this.dispose();
        TelaCadastraProduto tela = new TelaCadastraProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarProdutoActionPerformed

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        this.dispose();
        TelaCadastrarFuncionario tela = new TelaCadastrarFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed

    private void buttonVisualizarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarHistoricoActionPerformed
        if(Listas.historicoProdutos.isEmpty()){
            ControladorMensagem.exibeMensagem("Nenhuma informação no relatório para ser verificada.");
        }else{
            this.dispose();
            TelaHistorico tela = new TelaHistorico();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonVisualizarHistoricoActionPerformed

    private void buttonAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarProdutoActionPerformed
        if(Listas.estoqueProdutos.isEmpty()){
            ControladorMensagem.exibeMensagem("Nenhum produto no estoque para ser alterado.");
        }else{
            this.dispose();
            TelaAlteraProduto tela = new TelaAlteraProduto();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonAlterarProdutoActionPerformed

    private void buttonRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverProdutoActionPerformed
        if(Listas.estoqueProdutos.isEmpty()){
            ControladorMensagem.exibeMensagem("Nenhum produto no estoque para ser removido.");
        }else{
            this.dispose();
            TelaRemoveProduto tela = new TelaRemoveProduto();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonRemoverProdutoActionPerformed

    private void buttonEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEncerrarSessaoActionPerformed
        if(ControladorMensagem.confirmacaoMensagem("Deseja realmente encerrar a sessão?") == 0){
            this.dispose();
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonEncerrarSessaoActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        if(ControladorMensagem.confirmacaoMensagem("Deseja realmente sair do programa?") == 0){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_buttonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarProduto;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonCadastrarProduto;
    private javax.swing.JButton buttonEncerrarSessao;
    private javax.swing.JButton buttonRemoverProduto;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonVisualizarEstoque;
    private javax.swing.JButton buttonVisualizarHistorico;
    // End of variables declaration//GEN-END:variables

}
