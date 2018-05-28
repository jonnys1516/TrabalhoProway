package formularios;

// @author 104936

public class TelaPrincipalEstoquista extends javax.swing.JFrame {

    public TelaPrincipalEstoquista() {
        initComponents();
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

        buttonRelatorioEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRelatorioEstoque.setText("Relat�rio de Estoque");
        buttonRelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioEstoqueActionPerformed(evt);
            }
        });

        buttonEncerrarSessao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEncerrarSessao.setText("Encerrar Sess�o");

        buttonGerarDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonGerarDocumento.setText("Gerar documento do Relat�rio");

        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSair.setText("Sair");

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
        this.dispose();
        TelaVisualizaProduto tela = new TelaVisualizaProduto("ACESSO_ESTOQUISTA");
        tela.setVisible(true);
    }//GEN-LAST:event_buttonRelatorioEstoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEncerrarSessao;
    private javax.swing.JButton buttonGerarDocumento;
    private javax.swing.JButton buttonRelatorioEstoque;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
