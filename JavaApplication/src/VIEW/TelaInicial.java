package VIEW;

import javax.swing.JOptionPane;
import java.awt.Color;
import Jogo.Pokemon;
import Jogo.Score;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Raul
 */
public class TelaInicial extends javax.swing.JFrame {
    private Pokemon pokemon;
    private String nome="";
    
    public Pokemon getPokemon() {
    return this.pokemon;
    }
    public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
    }
    
     public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;  
    }
    /**
     * Creates new form A3demo
     */
    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        javax.swing.Timer timer = new javax.swing.Timer(500, new java.awt.event.ActionListener() {
        private boolean isRed = false;

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            jLabel1.setForeground(isRed ? Color.BLACK : Color.RED);
            isRed = !isRed;
        }
    });
    timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btn_bulb = new javax.swing.JButton();
        btn_char = new javax.swing.JButton();
        btn_squirt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_confirm = new javax.swing.JButton();
        btn_ranking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokemon RPG A3");
        setMinimumSize(new java.awt.Dimension(542, 458));
        setResizable(false);
        setSize(new java.awt.Dimension(542, 458));
        getContentPane().setLayout(null);

        jTextField1.setText("Digite seu nome de treinador");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 220, 330, 40);

        btn_bulb.setForeground(new java.awt.Color(60, 63, 65));
        btn_bulb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png"))); // NOI18N
        btn_bulb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_bulb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bulbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bulbMouseExited(evt);
            }
        });
        btn_bulb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bulbActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bulb);
        btn_bulb.setBounds(40, 300, 120, 110);

        btn_char.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png"))); // NOI18N
        btn_char.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_char.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_charMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_charMouseExited(evt);
            }
        });
        btn_char.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charActionPerformed(evt);
            }
        });
        getContentPane().add(btn_char);
        btn_char.setBounds(210, 300, 120, 110);

        btn_squirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png"))); // NOI18N
        btn_squirt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_squirt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_squirtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_squirtMouseExited(evt);
            }
        });
        btn_squirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_squirtActionPerformed(evt);
            }
        });
        getContentPane().add(btn_squirt);
        btn_squirt.setBounds(380, 300, 120, 110);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 270, 340, 20);

        btn_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/image (1).png"))); // NOI18N
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_confirm);
        btn_confirm.setBounds(410, 220, 80, 40);

        btn_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ranking.png"))); // NOI18N
        btn_ranking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rankingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ranking);
        btn_ranking.setBounds(430, 20, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/paisagem.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_bulbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bulbActionPerformed
        // TODO add your handling code here:
        if (nome.equals("") || nome.equals("Digite seu nome de treinador")){
            JOptionPane.showMessageDialog(null,"Você precisa digitar seu nome e confirmar ao lado","Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
        TelaBatalha a3demo2 = new TelaBatalha();

        // Cria o objeto Pokemon, seta o nome e passa para a3demo2
        Pokemon p = new Pokemon();
        p.setNomePokemon("Bulbassauro");
        a3demo2.setPokemon(p);
        a3demo2.setNome(nome);
        a3demo2.atualizarTela();
        a3demo2.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btn_bulbActionPerformed

    private void btn_charActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charActionPerformed
        // TODO add your handling code here:
        if (nome.equals("") || nome.equals("Digite seu nome de treinador")){
            JOptionPane.showMessageDialog(null,"Você precisa digitar seu nome e confirmar ao lado","Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
        TelaBatalha a3demo2 = new TelaBatalha();

        Pokemon p = new Pokemon();
        p.setNomePokemon("Charmander");
        a3demo2.setPokemon(p);
        a3demo2.setNome(nome);
        a3demo2.atualizarTela();
        a3demo2.setVisible(true);
        this.dispose();
        
        }
    }//GEN-LAST:event_btn_charActionPerformed

    private void btn_bulbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bulbMouseEntered
        // TODO add your handling code here:
     btn_bulb.setBackground(new java.awt.Color(0, 255, 102));
     btn_bulb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bulb.png")));

        
    }//GEN-LAST:event_btn_bulbMouseEntered

    private void btn_squirtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_squirtMouseEntered
        // TODO add your handling code here:

        btn_squirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Squirtl.png")));
        btn_squirt.setBackground(new java.awt.Color(51, 153, 255));// NOI18N

    }//GEN-LAST:event_btn_squirtMouseEntered

    private void btn_squirtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_squirtMouseExited
        // TODO add your handling code here:
        btn_squirt.setBackground(new java.awt.Color(255, 255, 255));
        btn_squirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png")));
    }//GEN-LAST:event_btn_squirtMouseExited

    private void btn_charMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_charMouseEntered
btn_char.setBackground(new java.awt.Color(255, 153, 51));
btn_char.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/char.png")));// TODO add your handling code here:
    }//GEN-LAST:event_btn_charMouseEntered

    private void btn_charMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_charMouseExited
        // TODO add your handling code here:
        btn_char.setBackground(new java.awt.Color(255, 255, 255));
        btn_char.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png")));
    }//GEN-LAST:event_btn_charMouseExited

    private void btn_bulbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bulbMouseExited
        // TODO add your handling code here:
        btn_bulb.setBackground(new java.awt.Color(255, 255, 255));
        btn_bulb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pkb.png")));
    }//GEN-LAST:event_btn_bulbMouseExited

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
      jTextField1.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
        
        if(jTextField1.getText()=="" || jTextField1.getText()=="Digite seu nome de treinador"){
            jLabel1.setText("");
        }
        else {
            jLabel1.setText("Escolha seu pokémon para continuar:");
            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setVisible(true);
            
            
        }
      
 
        this.nome = jTextField1.getText();
        
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_squirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_squirtActionPerformed
            // TODO add your handling code here:
            if (nome.equals("") || nome.equals("Digite seu nome de treinador")){
            JOptionPane.showMessageDialog(null,"Você precisa digitar seu nome e confirmar ao lado","Erro", JOptionPane.ERROR_MESSAGE);
        }
           
        else{
        TelaBatalha a3demo2 = new TelaBatalha();

        Pokemon p = new Pokemon();
        p.setNomePokemon("Squirtle");
        a3demo2.setPokemon(p);
        a3demo2.setNome(nome);
        a3demo2.atualizarTela();
        a3demo2.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btn_squirtActionPerformed

    private void btn_rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rankingActionPerformed
        // TODO add your handling code here:
        TelaRanking ranking = new TelaRanking();
        ranking.setVisible(true);
    }//GEN-LAST:event_btn_rankingActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    //devoloped by @raulcarm0
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bulb;
    private javax.swing.JButton btn_char;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_ranking;
    private javax.swing.JButton btn_squirt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}