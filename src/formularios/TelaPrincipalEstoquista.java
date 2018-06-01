package formularios;

// @author 104936
import beans.listas.Listas;
import controladores.ControladorGeraTxt;
import controladores.ControladorMensagem;

public class TelaPrincipalEstoquista extends javax.swing.JFrame {

    public TelaPrincipalEstoquista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonRelatorioEstoque = new javax.swing.JButton();
        buttonEncerrarSessao = new javax.swing.JButton();
        buttonGerarDocumento = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal: Estoquista");
        setResizable(false);

        buttonRelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRelatorioEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/relatorio.png"))); // NOI18N
        buttonRelatorioEstoque.setText("Relatório de Estoque");
        buttonRelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioEstoqueActionPerformed(evt);
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

        buttonGerarDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonGerarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/arquivo.png"))); // NOI18N
        buttonGerarDocumento.setText("Gerar documento do Relatório");
        buttonGerarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarDocumentoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRelatorioEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGerarDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buttonRelatorioEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGerarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRelatorioEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRelatorioEstoqueActionPerformed
        if (Listas.estoqueProdutos.isEmpty()) {
            ControladorMensagem.exibeMensagem("Não há nenhum produto no estoque.");
        } else {
            this.dispose();
            TelaVisualizaProduto tela = new TelaVisualizaProduto("ACESSO_ESTOQUISTA");
            tela.setVisible(true);
        }

    }//GEN-LAST:event_buttonRelatorioEstoqueActionPerformed

    private void buttonGerarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarDocumentoActionPerformed
        if (Listas.estoqueProdutos.isEmpty()) {
            ControladorMensagem.exibeMensagem("Não há nenhum produto no estoque.");
        } else {
            ControladorGeraTxt.geraTxt();
        }
    }//GEN-LAST:event_buttonGerarDocumentoActionPerformed

    private void buttonEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEncerrarSessaoActionPerformed
        if(ControladorMensagem.confirmacaoMensagem("Deseja realmente encerrar a sessão?") == 0){
            this.dispose();
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_buttonEncerrarSessaoActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        if(ControladorMensagem.confirmacaoMensagem("Deseja realmente terminar o programa?") == 0){
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_buttonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEncerrarSessao;
    private javax.swing.JButton buttonGerarDocumento;
    private javax.swing.JButton buttonRelatorioEstoque;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
