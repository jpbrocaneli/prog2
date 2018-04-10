/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapio;

/**
 *
 * @author a120144
 */
public class TelaCardapio extends javax.swing.JFrame {

    double total;
    Item arroz;
    Item feijao;
    Item macarrao;
    Item maionese;
    Item carnedeporco;
    Item carnedefrango;
    Item carnedeboi;
    Item peixe;
    Item farofa;
    Item refrigerante;
    Item suco;
    Item salada;

    public TelaCardapio() {
        initComponents();
        total = 0;
        arroz = new Item();
        arroz.setNome("arroz");
        arroz.setValor(5.00);

        feijao = new Item();
        feijao.setNome("feijao");
        feijao.setValor(5.00);

        macarrao = new Item();
        macarrao.setNome("macarrao");
        macarrao.setValor(5.00);

        maionese = new Item();
        maionese.setNome("maionese");
        maionese.setValor(3.50);

        carnedeporco = new Item();
        carnedeporco.setNome("carnedeporco");
        carnedeporco.setValor(3.00);

        carnedefrango = new Item();
        carnedefrango.setNome("carnedefrango");
        carnedefrango.setValor(3.00);

        carnedeboi = new Item();
        carnedeboi.setNome("carnedeboi");
        carnedeboi.setValor(3.00);

        peixe = new Item();
        peixe.setNome("peixe");
        peixe.setValor(3.00);

        refrigerante = new Item();
        refrigerante.setNome("refrigerante");
        refrigerante.setValor(3.50);

        salada = new Item();
        salada.setNome("salada");
        salada.setValor(3.00);

        suco = new Item();
        suco.setNome("suco");
        suco.setValor(4.00);

        farofa = new Item();
        farofa.setNome("farofa");
        farofa.setValor(3.00);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoarroz = new javax.swing.JButton();
        botaofeijao = new javax.swing.JButton();
        botaomacarrao = new javax.swing.JButton();
        botaomaionese = new javax.swing.JButton();
        botaofrango = new javax.swing.JButton();
        botaoboi = new javax.swing.JButton();
        botaoporco = new javax.swing.JButton();
        botaopeixe = new javax.swing.JButton();
        botaosalada = new javax.swing.JButton();
        botaofarofa = new javax.swing.JButton();
        botaorefrigerante = new javax.swing.JButton();
        botaosuco = new javax.swing.JButton();
        mostrartotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        botaoresetar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cardápio");

        botaoarroz.setText("Arroz");
        botaoarroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoarrozActionPerformed(evt);
            }
        });

        botaofeijao.setText("Feijão");
        botaofeijao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofeijaoActionPerformed(evt);
            }
        });

        botaomacarrao.setText("Macarrão");
        botaomacarrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaomacarraoActionPerformed(evt);
            }
        });

        botaomaionese.setText("Maionese");
        botaomaionese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaomaioneseActionPerformed(evt);
            }
        });

        botaofrango.setText("Carne de Frango");
        botaofrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofrangoActionPerformed(evt);
            }
        });

        botaoboi.setText("Carne de Boi");
        botaoboi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoboiActionPerformed(evt);
            }
        });

        botaoporco.setText("Carne de Porco");
        botaoporco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoporcoActionPerformed(evt);
            }
        });

        botaopeixe.setText("Peixe");
        botaopeixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaopeixeActionPerformed(evt);
            }
        });

        botaosalada.setText("Salada");
        botaosalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosaladaActionPerformed(evt);
            }
        });

        botaofarofa.setText("Farofa");
        botaofarofa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofarofaActionPerformed(evt);
            }
        });

        botaorefrigerante.setText("Refrigerante");
        botaorefrigerante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaorefrigeranteActionPerformed(evt);
            }
        });

        botaosuco.setText("Suco");
        botaosuco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosucoActionPerformed(evt);
            }
        });

        mostrartotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mostrartotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrartotalActionPerformed(evt);
            }
        });

        jLabel3.setText("R$ 5,00");

        jLabel4.setText("R$ 5,00");

        jLabel5.setText("R$ 5,00");

        jLabel6.setText("R$ 3,50");

        jLabel7.setText("R$ 3,00");

        jLabel8.setText("R$ 3,00");

        jLabel9.setText("R$ 3,00");

        jLabel10.setText("R$ 3,00");

        jLabel11.setText("R$ 3,00");

        jLabel12.setText("R$ 3,00");

        jLabel13.setText("R$ 3,50");

        jLabel14.setText("R$ 4,00");

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setText("Total em R$");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        botaoresetar.setText("Reset");
        botaoresetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoresetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaorefrigerante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoporco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaosalada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaomacarrao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoarroz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaofrango, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaofeijao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaomaionese, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoboi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaopeixe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaofarofa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaosuco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(mostrartotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoresetar)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoarroz)
                    .addComponent(botaofeijao))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaomacarrao)
                    .addComponent(botaomaionese))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaofrango)
                    .addComponent(botaoboi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoporco)
                    .addComponent(botaopeixe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaosalada)
                    .addComponent(botaofarofa))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaorefrigerante)
                    .addComponent(botaosuco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addComponent(mostrartotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoresetar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoarrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoarrozActionPerformed
        total = (total + arroz.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaoarrozActionPerformed

    private void botaoporcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoporcoActionPerformed
        total = (total + carnedeporco.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaoporcoActionPerformed

    private void botaosaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosaladaActionPerformed
        total = (total + salada.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaosaladaActionPerformed

    private void botaofeijaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofeijaoActionPerformed
        total = (total + feijao.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaofeijaoActionPerformed

    private void botaomacarraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaomacarraoActionPerformed
        total = (total + macarrao.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaomacarraoActionPerformed

    private void botaomaioneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaomaioneseActionPerformed
        total = (total + maionese.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaomaioneseActionPerformed

    private void botaorefrigeranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaorefrigeranteActionPerformed
        total = (total + refrigerante.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaorefrigeranteActionPerformed

    private void botaofrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofrangoActionPerformed
        total = (total + carnedefrango.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaofrangoActionPerformed

    private void botaoboiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoboiActionPerformed
        total = (total + carnedeboi.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaoboiActionPerformed

    private void botaopeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaopeixeActionPerformed
        total = (total + peixe.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaopeixeActionPerformed

    private void botaofarofaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofarofaActionPerformed
        total = (total + farofa.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaofarofaActionPerformed

    private void botaosucoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosucoActionPerformed
        total = (total + suco.getValor());
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_botaosucoActionPerformed

    private void mostrartotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrartotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrartotalActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        mostrartotal.setText(String.valueOf(total));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void botaoresetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoresetarActionPerformed
        total = 0;
        mostrartotal.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_botaoresetarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoarroz;
    private javax.swing.JButton botaoboi;
    private javax.swing.JButton botaofarofa;
    private javax.swing.JButton botaofeijao;
    private javax.swing.JButton botaofrango;
    private javax.swing.JButton botaomacarrao;
    private javax.swing.JButton botaomaionese;
    private javax.swing.JButton botaopeixe;
    private javax.swing.JButton botaoporco;
    private javax.swing.JButton botaorefrigerante;
    private javax.swing.JButton botaoresetar;
    private javax.swing.JButton botaosalada;
    private javax.swing.JButton botaosuco;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mostrartotal;
    // End of variables declaration//GEN-END:variables
}
