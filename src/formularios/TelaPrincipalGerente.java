package formularios;

// @author 104936

public class TelaPrincipalGerente extends javax.swing.JFrame {

    public TelaPrincipalGerente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadastrarFuncionario = new javax.swing.JButton();
        buttonCadastrarProduto = new javax.swing.JButton();
        buttonRemoverProduto = new javax.swing.JButton();
        buttonVisualizarHistorico = new javax.swing.JButton();
        buttonAlterarProduto = new javax.swing.JButton();
        buttonEncerrarSessao = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonVisualizarHistorico1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal: Gerente");

        buttonCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarFuncionario.setText("Cadastrar Funcionário");

        buttonCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrarProduto.setText("Cadastrar Produto");

        buttonRemoverProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRemoverProduto.setText("Remover Produto");

        buttonVisualizarHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVisualizarHistorico.setText("Visualizar Estoque");
        buttonVisualizarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarHistoricoActionPerformed(evt);
            }
        });

        buttonAlterarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAlterarProduto.setText("Alterar Produto");

        buttonEncerrarSessao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEncerrarSessao.setText("Encerrar Sessão");

        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSair.setText("Sair");

        buttonVisualizarHistorico1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVisualizarHistorico1.setText("Visualizar Histórico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVisualizarHistorico1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buttonCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonVisualizarHistorico1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void buttonVisualizarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarHistoricoActionPerformed
        this.dispose();
        TelaVisualizaProduto tela = new TelaVisualizaProduto("ACESSO_GERENTE");
        tela.setVisible(true);
    }//GEN-LAST:event_buttonVisualizarHistoricoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarProduto;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonCadastrarProduto;
    private javax.swing.JButton buttonEncerrarSessao;
    private javax.swing.JButton buttonRemoverProduto;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonVisualizarHistorico;
    private javax.swing.JButton buttonVisualizarHistorico1;
    // End of variables declaration//GEN-END:variables

}
