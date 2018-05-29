package formularios;

// @author 104936

import controladores.ControladorLogin;
import controladores.ControladorMensagem;


public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        buttonAutenticar = new javax.swing.JButton();
        fieldUsuario = new javax.swing.JTextField();
        fieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUsuario.setText("Usuário:");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSenha.setText("Senha:");

        buttonAutenticar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAutenticar.setText("Autenticar");
        buttonAutenticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAutenticarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsuario)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(buttonAutenticar)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(buttonAutenticar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAutenticarActionPerformed
        String retorno = ControladorLogin.retornaAutenticacao(fieldUsuario, fieldSenha);
        switch(retorno){
            case "GERENTE":
                this.dispose();
                TelaPrincipalGerente telaGerente = new TelaPrincipalGerente();
                telaGerente.setVisible(true);
                break;
            case "FUNCIONARIO":
                this.dispose();
                TelaPrincipalEstoquista telaEstoquista = new TelaPrincipalEstoquista();
                telaEstoquista.setVisible(true);
                break;
            case "NAO_EXISTE":
                ControladorMensagem.exibeMensagem("Credenciais não pertencem a nenhum funcionário ou incorreta. Por favor, informe novamente.");
                fieldUsuario.setText("");
                fieldSenha.setText("");
                fieldUsuario.requestFocus();
                break;
        }
    }//GEN-LAST:event_buttonAutenticarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAutenticar;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

}
