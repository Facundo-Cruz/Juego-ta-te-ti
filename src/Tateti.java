
import java.awt.Color;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Facundo
 */
public class Tateti extends javax.swing.JFrame {

    boolean estado = true;
    String turno = "X";
    JLabel lbs[] = new JLabel[9];
    int patternsWin[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}
    };

    public Tateti() {

        initComponents();
        lbs[0] = jLabel1;
        lbs[1] = jLabel2;
        lbs[2] = jLabel3;
        lbs[3] = jLabel4;
        lbs[4] = jLabel5;
        lbs[5] = jLabel6;
        lbs[6] = jLabel7;
        lbs[7] = jLabel8;
        lbs[8] = jLabel9;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        bg_up = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pj_2 = new javax.swing.JLabel();
        pj_1 = new javax.swing.JLabel();
        btn_restart = new javax.swing.JButton();
        cont_j2 = new javax.swing.JLabel();
        cont_j1 = new javax.swing.JLabel();
        bg_down = new javax.swing.JPanel();
        square_tateti = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bg_middle = new javax.swing.JPanel();
        bg_middle_btwn_down = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_up.setBackground(new java.awt.Color(32, 32, 32));
        bg_up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(32, 32, 32));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("PLAYER 2");
        jLabel11.setOpaque(true);
        bg_up.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 100, 30));

        jLabel10.setBackground(new java.awt.Color(32, 32, 32));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("PLAYER 1");
        jLabel10.setOpaque(true);
        bg_up.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 30));

        pj_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-2-playing.png"))); // NOI18N
        bg_up.add(pj_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 26, 90, 90));

        pj_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-1-waiting.png"))); // NOI18N
        bg_up.add(pj_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 26, 90, 90));

        btn_restart.setBackground(new java.awt.Color(32, 32, 32));
        btn_restart.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        btn_restart.setForeground(new java.awt.Color(32, 32, 32));
        btn_restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_restart.png"))); // NOI18N
        btn_restart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_restart_pressed.png"))); // NOI18N
        btn_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restartActionPerformed(evt);
            }
        });
        bg_up.add(btn_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));

        cont_j2.setBackground(new java.awt.Color(32, 32, 32));
        cont_j2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cont_j2.setForeground(new java.awt.Color(235, 56, 98));
        cont_j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont_j2.setText("0");
        bg_up.add(cont_j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 117, 40, -1));

        cont_j1.setBackground(new java.awt.Color(32, 32, 32));
        cont_j1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cont_j1.setForeground(new java.awt.Color(101, 197, 136));
        cont_j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont_j1.setText("0");
        cont_j1.setOpaque(true);
        bg_up.add(cont_j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 117, 40, -1));

        background.add(bg_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 143));

        bg_down.setBackground(new java.awt.Color(26, 25, 41));
        bg_down.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        square_tateti.setBackground(new java.awt.Color(41, 54, 98));
        square_tateti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(26, 25, 41));
        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        square_tateti.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 224, 105, 105));

        jLabel2.setBackground(new java.awt.Color(26, 25, 41));
        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        square_tateti.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 224, 105, 105));

        jLabel3.setBackground(new java.awt.Color(26, 25, 41));
        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        square_tateti.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 224, 105, 105));

        jLabel4.setBackground(new java.awt.Color(26, 25, 41));
        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        square_tateti.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 105, 105));

        jLabel5.setBackground(new java.awt.Color(26, 25, 41));
        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        square_tateti.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 112, 105, 105));

        jLabel6.setBackground(new java.awt.Color(26, 25, 41));
        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        square_tateti.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 112, 105, 105));

        jLabel7.setBackground(new java.awt.Color(26, 25, 41));
        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        square_tateti.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 105, 105));

        jLabel8.setBackground(new java.awt.Color(26, 25, 41));
        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        square_tateti.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 0, 105, 105));

        jLabel9.setBackground(new java.awt.Color(26, 25, 41));
        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 75)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        square_tateti.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 0, 105, 105));

        bg_down.add(square_tateti, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 36, 329, 329));

        background.add(bg_down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 400));

        bg_middle.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bg_middleLayout = new javax.swing.GroupLayout(bg_middle);
        bg_middle.setLayout(bg_middleLayout);
        bg_middleLayout.setHorizontalGroup(
            bg_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bg_middleLayout.setVerticalGroup(
            bg_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        background.add(bg_middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, 400, 5));

        bg_middle_btwn_down.setBackground(new java.awt.Color(20, 18, 32));

        javax.swing.GroupLayout bg_middle_btwn_downLayout = new javax.swing.GroupLayout(bg_middle_btwn_down);
        bg_middle_btwn_down.setLayout(bg_middle_btwn_downLayout);
        bg_middle_btwn_downLayout.setHorizontalGroup(
            bg_middle_btwn_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bg_middle_btwn_downLayout.setVerticalGroup(
            bg_middle_btwn_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        background.add(bg_middle_btwn_down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, 400, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        presionar(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        presionar(3);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel9MousePressed

    private void btn_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restartActionPerformed
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setBackground(Color.decode("#1a1929"));
            lbs[i].setText("");
        }
        estado = true;
        presionar(1);
        lbs[1].setText("");

    }//GEN-LAST:event_btn_restartActionPerformed
    public void presionar(int index) {

        if (lbs[index].getText().equals("") && estado) {
            cambiarTurno(index);
            lbs[index].setText(turno);
            comprobarGanador();
        }

    }

    public void cambiarTurno(int index) {
        if (turno.equals("X")) {
            turno = "O";
            lbs[index].setForeground(Color.decode("#69be87"));
            pj_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-1-playing.png")));
            pj_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-2-waiting.png")));
        } else {
            turno = "X";
            lbs[index].setForeground(Color.decode("#ee3861"));
            pj_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-2-playing.png")));
            pj_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-1-waiting.png")));
        }
    }

    public void comprobarGanador() {
        for (int i = 0; i < patternsWin.length; i++) {
            if (lbs[patternsWin[i][0] - 1].getText().equals("X")
                    && lbs[patternsWin[i][1] - 1].getText().equals("X")
                    && lbs[patternsWin[i][2] - 1].getText().equals("X")) {
                lbs[patternsWin[i][0] - 1].setBackground(Color.decode("#fc547f"));
                lbs[patternsWin[i][1] - 1].setBackground(Color.decode("#fc547f"));
                lbs[patternsWin[i][2] - 1].setBackground(Color.decode("#fc547f"));
                pj_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-1-playing.png")));
                pj_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-2-waiting.png")));
                estado = false;
                int var = Integer.valueOf(cont_j2.getText()) + 1;
                cont_j2.setText(String.valueOf(var));
                break;
            }
            if (lbs[patternsWin[i][0] - 1].getText().equals("O")
                    && lbs[patternsWin[i][1] - 1].getText().equals("O")
                    && lbs[patternsWin[i][2] - 1].getText().equals("O")) {
                lbs[patternsWin[i][0] - 1].setBackground(Color.decode("#98fcb8"));
                lbs[patternsWin[i][1] - 1].setBackground(Color.decode("#98fcb8"));
                lbs[patternsWin[i][2] - 1].setBackground(Color.decode("#98fcb8"));
                pj_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-2-playing.png")));
                pj_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personaje-1-waiting.png")));
                estado = false;
                int var = Integer.valueOf(cont_j1.getText()) + 1;
                cont_j1.setText(String.valueOf(var));
                break;
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Tateti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tateti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tateti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tateti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tateti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_down;
    private javax.swing.JPanel bg_middle;
    private javax.swing.JPanel bg_middle_btwn_down;
    private javax.swing.JPanel bg_up;
    private javax.swing.JButton btn_restart;
    private javax.swing.JLabel cont_j1;
    private javax.swing.JLabel cont_j2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pj_1;
    private javax.swing.JLabel pj_2;
    private javax.swing.JPanel square_tateti;
    // End of variables declaration//GEN-END:variables
}
