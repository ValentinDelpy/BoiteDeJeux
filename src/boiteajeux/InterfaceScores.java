/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiteajeux;

import static boiteajeux.Serialisation.lecture;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author bcurt
 */
public class InterfaceScores extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceScores
     */
    protected static Connecte joueur;

    public InterfaceScores(Connecte joueur) {
        this.joueur = joueur;
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel4.setVisible(false);
        if (joueur.getPseudo() == "invite") {
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            jLabel3.setVisible(false);
            victoiresBatailleNavaleLabel.setVisible(false);
            nbPartiesBatailleNavaleLabel.setVisible(false);
            victoiresPenduLabel.setVisible(false);
            nbPartiesPenduLabel.setVisible(false);
            joueur.setNbPartiesBatailleNavale(0);
            joueur.setNbVictoiresBatailleNavale(0);
            joueur.setNbPartiesPendu(0);
            joueur.setNbVictoiresPendu(0);
        }
        scoreBatailleNavale();
        scorePendu();
        scoreTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        retourButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        victoiresBatailleNavaleLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nbPartiesBatailleNavaleLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        nbPartiesPenduLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        victoiresPenduLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vos scores:");

        retourButton.setText("retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Bataille navale:");

        jLabel3.setText("Nombre de parties jouées : ");

        victoiresBatailleNavaleLabel.setText("jLabel4");

        jLabel5.setText("Nombre de parties gagnées : ");

        jLabel6.setText("jLabel6");

        jLabel7.setText("Joueur ayant le meilleur ratio:");

        nbPartiesBatailleNavaleLabel.setText("jLabel8");

        jLabel9.setText("Nombre de parties jouées par tout le monde:");

        jLabel10.setText("Total");

        jLabel11.setText("Joueur ayant le plus de parties:");

        jLabel12.setText("Pendu");

        jLabel13.setText("jLabel13");

        jLabel14.setText("Total");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("Nombre de parties gagnées par tout le monde:");

        nbPartiesPenduLabel.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jLabel22.setText("jLabel22");

        jLabel24.setText("jLabel24");

        jLabel23.setText("jLabel23");

        victoiresPenduLabel.setText("jLabel25");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 31, 61));
        jLabel4.setText("Vos scores ne sont pas enregistrés car vous n'êtes pas connecté");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(298, 298, 298)
                        .addComponent(retourButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(145, 145, 145)
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel15)
                                                        .addGap(60, 60, 60))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(148, 148, 148)
                                                                .addComponent(nbPartiesBatailleNavaleLabel))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(147, 147, 147)
                                                                .addComponent(victoiresBatailleNavaleLabel)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(nbPartiesPenduLabel)
                                                                .addGap(59, 59, 59))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(169, 169, 169)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(victoiresPenduLabel)
                                                                    .addComponent(jLabel12))
                                                                .addGap(0, 63, Short.MAX_VALUE))))))
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel14))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel20)
                                                        .addGap(168, 168, 168))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(71, 71, 71)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel21))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addGap(60, 60, 60))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel19)
                                                        .addGap(62, 62, 62))))
                                            .addComponent(jSeparator5)
                                            .addComponent(jSeparator4))
                                        .addGap(97, 97, 97)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(274, 274, 274)))))
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(retourButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(victoiresBatailleNavaleLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(victoiresPenduLabel)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbPartiesBatailleNavaleLabel)
                            .addComponent(jLabel3)
                            .addComponent(nbPartiesPenduLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel23))
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel6)
                            .addComponent(jLabel24))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        new InterfaceJeu(joueur).setVisible(true);
        dispose();
    }//GEN-LAST:event_retourButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceScores(joueur).setVisible(true);
            }
        });
    }

    //récupère tous les scores correspondants à la bataille navale et les affiche
    public void scoreBatailleNavale() {

        victoiresBatailleNavaleLabel.setText(joueur.getNbVictoiresBatailleNavale() + "");
        nbPartiesBatailleNavaleLabel.setText(joueur.getNbPartiesBatailleNavale() + "");

        ArrayList<Connecte> liste = new ArrayList<Connecte>();
        liste = lecture();

        Connecte joueurMeilleurRatio = liste.get(0);
        Connecte joueurPlusDeParties = liste.get(0);
        float ratio1 = 0;
        float ratio2 = 0;
        int nbPartiesTotalBatailleNavale = 0;
        int nbVictoiresTotalBatailleNavale = 0;
        for (Connecte c : liste) {
            nbPartiesTotalBatailleNavale += c.getNbPartiesBatailleNavale();
            nbVictoiresTotalBatailleNavale += c.getNbVictoiresBatailleNavale();
            if (joueurMeilleurRatio.nbVictoiresBatailleNavale == 0) {
                ratio1 = 0;
            } else {
                ratio1 = joueurMeilleurRatio.nbVictoiresBatailleNavale / joueurMeilleurRatio.nbVictoiresBatailleNavale;
            }
            if (c.nbVictoiresBatailleNavale == 0) {
                ratio2 = 0;
            } else {
                ratio2 = c.nbVictoiresBatailleNavale / c.nbVictoiresBatailleNavale;

            }
            if (ratio2 >= ratio1) {
                joueurMeilleurRatio = c;
            }
            if (c.getNbPartiesBatailleNavale() >= joueurPlusDeParties.getNbPartiesBatailleNavale()) {
                joueurPlusDeParties = c;
            }
        }
        jLabel13.setText(joueurMeilleurRatio.getPseudo());
        jLabel16.setText(joueurPlusDeParties.getPseudo());

        jLabel21.setText(nbPartiesTotalBatailleNavale + "");
        jLabel6.setText(nbVictoiresTotalBatailleNavale + "");

    }

    //récupère tous les scores correspondants au pendu et les affiche
    public void scorePendu() {

        victoiresPenduLabel.setText(joueur.getNbVictoiresPendu() + "");
        nbPartiesPenduLabel.setText(joueur.getNbPartiesPendu() + "");

        ArrayList<Connecte> liste = new ArrayList<Connecte>();
        liste = lecture();

        Connecte joueurMeilleurRatio = liste.get(0);
        Connecte joueurPlusDeParties = liste.get(0);
        float ratio1 = 0;
        float ratio2 = 0;
        int nbPartiesTotalPendu = 0;
        int nbVictoiresTotalPendu = 0;
        for (Connecte c : liste) {
            nbPartiesTotalPendu += c.getNbPartiesPendu();
            nbVictoiresTotalPendu += c.getNbVictoiresPendu();
            if (joueurMeilleurRatio.nbVictoiresPendu == 0) {
                ratio1 = 0;
            }
            else{
                ratio1 = joueurMeilleurRatio.nbVictoiresPendu / joueurMeilleurRatio.nbVictoiresPendu;
            }
            if (c.nbVictoiresPendu == 0) {
                ratio2 = 0;
            } else {
                ratio2 = c.nbVictoiresPendu / c.nbVictoiresPendu;
            }
            if (ratio2 >= ratio1) {
                joueurMeilleurRatio = c;
            }
            if (c.getNbPartiesPendu() >= joueurPlusDeParties.getNbPartiesPendu()) {
                joueurPlusDeParties = c;
            }
        }
        jLabel15.setText(joueurMeilleurRatio.getPseudo());
        jLabel19.setText(joueurPlusDeParties.getPseudo());

        jLabel22.setText(nbPartiesTotalPendu + "");
        jLabel24.setText(nbVictoiresTotalPendu + "");

    }

    //récupère et calcule les scores correspondants à la combinaison des deux jeux et les affiche
    public void scoreTotal() {

        ArrayList<Connecte> liste = new ArrayList<Connecte>();
        liste = lecture();

        Connecte joueurMeilleurRatio = liste.get(0);
        Connecte joueurPlusDeParties = liste.get(0);
        float ratio1 = 0;
        float ratio2 = 0;
        float ratioPendu1 = 0;
        float ratioPendu2 = 0;
        float ratioBataille1 = 0;
        float ratioBataille2 = 0;
        int nbPartiesTotalPendu = 0;
        int nbVictoiresTotalPendu = 0;
        int nbPartiesTotalBatailleNavale = 0;
        int nbVictoiresTotalBatailleNavale = 0;

        for (Connecte c : liste) {
            if (joueurMeilleurRatio.nbVictoiresPendu == 0) {
                ratioPendu1 = 0;
            }
            else{
                ratioPendu1 = joueurMeilleurRatio.nbVictoiresPendu / joueurMeilleurRatio.nbVictoiresPendu;
            }

            if (c.nbVictoiresPendu == 0) {
                ratioPendu2 = 0;
            } else {
                ratioPendu2 = c.nbVictoiresPendu / c.nbVictoiresPendu;
                
            }
            if (joueurMeilleurRatio.nbVictoiresBatailleNavale == 0) {
                ratioBataille1 = 0;
            } else {
                ratioBataille1 = joueurMeilleurRatio.nbVictoiresBatailleNavale / joueurMeilleurRatio.nbVictoiresBatailleNavale;
            }

            if (c.nbVictoiresBatailleNavale == 0) {
                ratioBataille2 = 0;
            } else {
                ratioBataille2 = c.nbVictoiresBatailleNavale / c.nbVictoiresBatailleNavale;

            }
            ratio1 = (ratioPendu1 + ratioBataille1) / 2;
            ratio2 = (ratioPendu2 + ratioBataille2) / 2;
            if (ratio2 >= ratio1) {
                joueurMeilleurRatio = c;
            }

            if (c.getNbPartiesPendu() + c.getNbPartiesBatailleNavale() >= joueurPlusDeParties.getNbPartiesPendu() + joueurPlusDeParties.getNbPartiesBatailleNavale()) {
                joueurPlusDeParties = c;
            }
        }
        jLabel23.setText(joueurMeilleurRatio.getPseudo());
        jLabel20.setText(joueurPlusDeParties.getPseudo());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nbPartiesBatailleNavaleLabel;
    private javax.swing.JLabel nbPartiesPenduLabel;
    private javax.swing.JButton retourButton;
    private javax.swing.JLabel victoiresBatailleNavaleLabel;
    private javax.swing.JLabel victoiresPenduLabel;
    // End of variables declaration//GEN-END:variables
}