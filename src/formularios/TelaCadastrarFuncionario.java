package formularios;

// @author 104936

public class TelaCadastrarFuncionario extends javax.swing.JFrame {

    public TelaCadastrarFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIdade1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buttonCadastrar1 = new javax.swing.JButton();
        query1 = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        query2 = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)null).getResultList();
        textNome = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        fieldNome = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        buttonCadastrar = new javax.swing.JButton();

        labelIdade1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIdade1.setText("Idade: ");

        jTextField1.setText("jTextField1");

        buttonCadastrar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrar1.setText("Cadastrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Funcionário");

        textNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNome.setText("Nome:");

        labelIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIdade.setText("Idade: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUsuario.setText("Usuário:");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSenha.setText("Senha:");

        buttonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(labelIdade)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsuario)
                                    .addComponent(labelSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoSenha)
                                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdade)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCadastrar1;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JPasswordField campoSenha;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelIdade1;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private java.util.List list1;
    private javax.persistence.Query query1;
    private javax.persistence.Query query2;
    private javax.swing.JLabel textNome;
    // End of variables declaration//GEN-END:variables

}
