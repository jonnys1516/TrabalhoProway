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
        labelFuncionario = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        labelExibicao = new javax.swing.JLabel();
        buttonRemoverFuncionario = new javax.swing.JButton();
        buttonAtualizarFuncionario = new javax.swing.JButton();
        buttonVisualizarFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal: Gerente");
        setResizable(false);

        buttonCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/funcionario.png"))); // NOI18N
        buttonCadastrarFuncionario.setText("Adicionar");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });

        buttonCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/produto.png"))); // NOI18N
        buttonCadastrarProduto.setText("Adicionar");
        buttonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarProdutoActionPerformed(evt);
            }
        });

        buttonRemoverProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/remover.png"))); // NOI18N
        buttonRemoverProduto.setText("Remover");
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
        buttonAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/atualizar.png"))); // NOI18N
        buttonAlterarProduto.setText("Atualizar");
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

        labelFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelFuncionario.setText("FUNCIONÁRIO");

        labelProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProduto.setText("PRODUTO");

        labelExibicao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelExibicao.setText("EXIBIÇÃO");

        buttonRemoverFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRemoverFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/funcionario.png"))); // NOI18N
        buttonRemoverFuncionario.setText("Remover");
        buttonRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverFuncionarioActionPerformed(evt);
            }
        });

        buttonAtualizarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAtualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/funcionario.png"))); // NOI18N
        buttonAtualizarFuncionario.setText("Atualizar");
        buttonAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarFuncionarioActionPerformed(evt);
            }
        });

        buttonVisualizarFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVisualizarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/equipe.png"))); // NOI18N
        buttonVisualizarFuncionarios.setText("Visualizar Funcionários");
        buttonVisualizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVisualizarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVisualizarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(labelFuncionario)
                .addGap(221, 221, 221)
                .addComponent(labelProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelExibicao)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncionario)
                    .addComponent(labelProduto)
                    .addComponent(labelExibicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVisualizarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVisualizarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void buttonRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRemoverFuncionarioActionPerformed

    private void buttonAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAtualizarFuncionarioActionPerformed

    private void buttonVisualizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVisualizarFuncionariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarProduto;
    private javax.swing.JButton buttonAtualizarFuncionario;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonCadastrarProduto;
    private javax.swing.JButton buttonEncerrarSessao;
    private javax.swing.JButton buttonRemoverFuncionario;
    private javax.swing.JButton buttonRemoverProduto;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonVisualizarEstoque;
    private javax.swing.JButton buttonVisualizarFuncionarios;
    private javax.swing.JButton buttonVisualizarHistorico;
    private javax.swing.JLabel labelExibicao;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelProduto;
    // End of variables declaration//GEN-END:variables

}
