/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import Jogo.Pokemon;
import Jogo.Score;

/**
 *
 * @author Raul
 */
public class TelaBatalha extends javax.swing.JFrame {
    private Pokemon pokemon;
    private String nome;
    private Score score;
    private int num1;
    private int num2;
    private int turno;
    

    
    public Score getScore(){
    return this.score;
    }
    
    
    public int getNum1(){
     return num1;
    }
    
     public void setNum1(int num1){
      this.num1 = num1;
      atualizarDado();
    }
    
     public int getNum2(){
     return num2;
    }
    
     public void setNum2(int num2){
      this.num2 = num2;
      atualizarDado();
    }
    
    
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
        atualizarEasterEgg();
        atualizarNome();
 
    }
    
    //este método apenas exibe os números tirados por ambos os jogadores
    public void atualizarDado(){
        lb_dadoYou.setText(String.valueOf(num1));
        lb_dadoEnemy.setText(String.valueOf(num2));
        
    }
    
    //este metodo atualiza o nome na label do seu jogador
    public void atualizarNome(){
        lb_you.setText(nome);
        lb_you.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_you.setForeground(new java.awt.Color(0, 0, 0));
        
    }
    
    //  este método criei para definir a imagem do pokemon de acordo com a variavel "pokemon"
    public void atualizarTela() {      
    if (pokemon == null) {
        System.out.println("Nenhum Pokémon selecionado.");
        return;
    }

    String nomePkm = pokemon.getNomePokemon();

    System.out.println("Nome do Pokémon recebido: '" + nomePkm + "'");
    
    if ("Bulbassauro".equals(nomePkm)) {
        lb_pkm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bulb.png")));
        lb_pkm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Squirtl.png")));
        lb_pkm1.setBounds(180, 320, 120, 110);
    } else if ("Charmander".equals(nomePkm)) {
        lb_pkm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/char.png")));
        lb_pkm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bulb.png")));
    } else if ("Squirtle".equals(nomePkm)) {
        lb_pkm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Squirtl.png")));
        lb_pkm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/char.png")));
    } else if ("Pikachu".equals(nomePkm)) {
        lb_pkm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pikachu-png-transparent-0.png")));
        lb_pkm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Squirtl.png")));
    } else {
        System.out.println("Pokemon desconhecido: " + nomePkm);
    }
    
    
}
    // este método tem a função de colocar a foto dos professores da Uc de programação como easteregg
    public void atualizarEasterEgg(){
        
    if ("Leandro".equals(nome) || "leandro".equals(nome)){
        lb_imgYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/leandro.jpg"))); // NOI18N
        lb_you.setBounds(70, 410, 100, 30);
    }
    else if ("Jardel".equals(nome) || "jardel".equals(nome)){
        lb_imgYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jardel.jpg"))); // NOI18N
        lb_you.setBounds(85, 410, 100, 30);
    }
    else if ("Ash".equals(nome) || "ash".equals(nome)){
        lb_imgYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/png-clipart-pokemon-pokemon-ash-character.png"))); // NOI18N
        lb_you.setBounds(85, 410, 100, 30);
        if (this.pokemon == null || !"Pikachu".equals(this.pokemon.getNomePokemon())) {
            this.pokemon = new Pokemon();
            this.pokemon.setNomePokemon("Pikachu");
            atualizarTela();
        }
    }
    else {
        lb_imgYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/you.png"))); // NOI18N
    }
}

    

    
    /**
     * Creates new form A3demo2
     */
    public TelaBatalha() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaBatalha.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
       setLocationRelativeTo(null);
       javax.swing.Timer timer = new javax.swing.Timer(500, new java.awt.event.ActionListener() {
        private boolean isRed = false;

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            lb_Turno.setForeground(isRed ? Color.BLACK : Color.RED);
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

        lb_you = new javax.swing.JLabel();
        lb_trainer = new javax.swing.JLabel();
        lb_pkm1 = new javax.swing.JLabel();
        lb_pkm2 = new javax.swing.JLabel();
        lb_imgYou = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pb_HpEnemy = new javax.swing.JProgressBar();
        pb_HpYou = new javax.swing.JProgressBar();
        lb_Turno = new javax.swing.JLabel();
        btn_attack = new javax.swing.JButton();
        lb_dadoYou = new javax.swing.JLabel();
        lb_dadoEnemy = new javax.swing.JLabel();
        lb_numTurno = new javax.swing.JLabel();
        lb_hpYou = new javax.swing.JLabel();
        lb_hpEnemy = new javax.swing.JLabel();
        btn_ranking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokemon RPG A3");
        setMinimumSize(new java.awt.Dimension(417, 556));
        setResizable(false);
        setSize(new java.awt.Dimension(417, 556));
        getContentPane().setLayout(null);
        getContentPane().add(lb_you);
        lb_you.setBounds(100, 410, 100, 30);

        lb_trainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/red.png"))); // NOI18N
        lb_trainer.setText("jLabel1");
        getContentPane().add(lb_trainer);
        lb_trainer.setBounds(60, 90, 120, 130);

        lb_pkm1.setMaximumSize(new java.awt.Dimension(540, 417));
        lb_pkm1.setMinimumSize(new java.awt.Dimension(540, 417));
        lb_pkm1.setPreferredSize(new java.awt.Dimension(540, 417));
        lb_pkm1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lb_pkm1PropertyChange(evt);
            }
        });
        getContentPane().add(lb_pkm1);
        lb_pkm1.setBounds(210, 320, 120, 110);
        getContentPane().add(lb_pkm2);
        lb_pkm2.setBounds(200, 90, 120, 110);

        lb_imgYou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/you.png"))); // NOI18N
        lb_imgYou.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lb_imgYouPropertyChange(evt);
            }
        });
        getContentPane().add(lb_imgYou);
        lb_imgYou.setBounds(60, 290, 120, 120);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("RED");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 210, 37, 16);

        pb_HpEnemy.setBackground(new java.awt.Color(255, 255, 255));
        pb_HpEnemy.setMaximum(100);
        pb_HpEnemy.setMinimum(0);
        pb_HpEnemy.setValue(100);
        if(pb_HpEnemy.getValue()<=(30)){
            pb_HpEnemy.setForeground(new java.awt.Color(136, 0, 21));
        }
        else if(pb_HpEnemy.getValue()<=(59)){
            pb_HpEnemy.setForeground(new java.awt.Color(189,117,9));
        }
        else{
            pb_HpEnemy.setForeground(new java.awt.Color(51, 204, 0));
            pb_HpEnemy.setStringPainted(true);
        }
        getContentPane().add(pb_HpEnemy);
        pb_HpEnemy.setBounds(210, 200, 100, 20);

        pb_HpYou.setBackground(new java.awt.Color(255, 255, 255));
        pb_HpYou.setStringPainted(true);
        pb_HpYou.setMaximum(100);
        pb_HpYou.setMinimum(0);
        pb_HpYou.setValue(100);
        if(pb_HpYou.getValue()<=(30)){
            pb_HpYou.setForeground(new java.awt.Color(136,0,21));
        }
        else if (pb_HpYou.getValue()<=(59)){
            pb_HpYou.setForeground(new java.awt.Color(189,117,9));
        }
        else{
            pb_HpYou.setForeground(new java.awt.Color(51,204,0));
            pb_HpYou.setStringPainted(true);
        }
        getContentPane().add(pb_HpYou);
        pb_HpYou.setBounds(210, 430, 100, 20);

        lb_Turno.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb_Turno.setForeground(new java.awt.Color(0, 0, 153));
        lb_Turno.setText("Turno:");
        getContentPane().add(lb_Turno);
        lb_Turno.setBounds(250, 50, 70, 30);

        btn_attack.setBackground(new java.awt.Color(204, 204, 0));
        btn_attack.setForeground(new java.awt.Color(204, 204, 0));
        btn_attack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/atacar1.png"))); // NOI18N
        btn_attack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_attack);
        btn_attack.setBounds(60, 470, 90, 30);

        lb_dadoYou.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_dadoYou.setText("0");
        getContentPane().add(lb_dadoYou);
        lb_dadoYou.setBounds(200, 280, 110, 50);

        lb_dadoEnemy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_dadoEnemy.setForeground(new java.awt.Color(255, 255, 255));
        lb_dadoEnemy.setText("0");
        getContentPane().add(lb_dadoEnemy);
        lb_dadoEnemy.setBounds(200, 230, 70, 30);

        lb_numTurno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_numTurno.setText("0");
        getContentPane().add(lb_numTurno);
        lb_numTurno.setBounds(320, 50, 30, 30);

        lb_hpYou.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lb_hpYou.setForeground(new java.awt.Color(0, 204, 51));
        lb_hpYou.setText("HP");
        getContentPane().add(lb_hpYou);
        lb_hpYou.setBounds(310, 430, 37, 16);

        lb_hpEnemy.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lb_hpEnemy.setForeground(new java.awt.Color(0, 204, 0));
        lb_hpEnemy.setText("HP");
        getContentPane().add(lb_hpEnemy);
        lb_hpEnemy.setBounds(310, 200, 30, 21);

        btn_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ranking.png"))); // NOI18N
        btn_ranking.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rankingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ranking);
        btn_ranking.setBounds(270, 470, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/battle-arena-pokemon-v0-eyepg8yrbxna1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 420, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_pkm1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lb_pkm1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_pkm1PropertyChange

    private void btn_attackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attackActionPerformed
Random random = new Random();
setNum1(random.nextInt(31));
setNum2(random.nextInt(31));

if (num2 > num1) {
    pb_HpYou.setValue(pb_HpYou.getValue() - (num2 - num1));
    this.turno = turno + 1;
    lb_numTurno.setText(String.valueOf(this.turno));
} else if (num1 > num2) {
    pb_HpEnemy.setValue(pb_HpEnemy.getValue() - (num1 - num2));
    this.turno = turno + 1;
    lb_numTurno.setText(String.valueOf(this.turno));
}

if (pb_HpEnemy.getValue() <= 30) {
    pb_HpEnemy.setForeground(new java.awt.Color(136, 0, 21));
} else if (pb_HpEnemy.getValue() <= 59) {
    pb_HpEnemy.setForeground(new java.awt.Color(189, 117, 9));
} else {
    pb_HpEnemy.setForeground(new java.awt.Color(51, 204, 0));
    pb_HpEnemy.setStringPainted(true);
}

if (pb_HpYou.getValue() <= 30) {
    pb_HpYou.setForeground(new java.awt.Color(136, 0, 21));
} else if (pb_HpYou.getValue() <= 59) {
    pb_HpYou.setForeground(new java.awt.Color(189, 117, 9));
} else {
    pb_HpYou.setForeground(new java.awt.Color(51, 204, 0));
    pb_HpYou.setStringPainted(true);
}

// FIM DE JOGO - VITÓRIA
if (pb_HpEnemy.getValue() == 0) {
    if (score == null) score = new Score();
    if (turno < 6) {
        score.setValor(100);
    } else {
        int turnosExtras = turno - 5;
        double valor = 100 - (turnosExtras * 2);
        valor = valor + pb_HpYou.getValue() / 10.0;
        score.setValor(valor);
    }
    JOptionPane.showMessageDialog(null, "Você venceu!"
        + "\nSeu pokémon: " + (pokemon != null ? pokemon.getNomePokemon() : "Nenhum")
        + "\nSeu HP: " + pb_HpYou.getValue()
        + "\nTurnos: " + turno
        + "\nScore: " + (score != null ? score.getValor() : 0),
        "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
    TelaInicial a3demo = new TelaInicial();
    a3demo.setVisible(true);
    this.dispose();
}
// FIM DE JOGO - DERROTA
else if (pb_HpYou.getValue() == 0) {
    if (score == null) score = new Score();
    if (turno < 6) {
        score.setValor(0);
    } else {
        double valor = turno * 2 - (pb_HpEnemy.getValue() / 10.0);
        if (valor < 0) valor = 0;
        score.setValor(valor);
    }
    JOptionPane.showMessageDialog(null, "Você perdeu!"
        + "\nRED é o Vencedor!"
        + "\nSeu pokémon: " + (pokemon != null ? pokemon.getNomePokemon() : "Nenhum")
        + "\nSeu HP: " + pb_HpYou.getValue()
        + "\nTurnos: " + turno
        + "\nScore: " + (score != null ? score.getValor() : 0),
        "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
    TelaInicial a3demo = new TelaInicial();
    a3demo.setVisible(true);
    this.dispose();
}

if (pb_HpEnemy.getValue() == 0 || pb_HpYou.getValue() == 0) {
    String nomeJogador = nome;
    double pontuacao = score != null ? score.getValor() : 0;

    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ranking.db");
         PreparedStatement stmt = conn.prepareStatement("INSERT INTO ranking (nome, pontuacao) VALUES (?, ?)")) {

        stmt.setString(1, nomeJogador);
        stmt.setDouble(2, pontuacao);
        stmt.executeUpdate();

        System.out.println("✅ Ranking salvo com sucesso!");

    } catch (Exception e) {
        System.out.println("Erro ao salvar no ranking: " + e.getMessage());
    }
}

    
    }//GEN-LAST:event_btn_attackActionPerformed

    private void lb_imgYouPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lb_imgYouPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_imgYouPropertyChange

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
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBatalha().setVisible(true);
            }
        });
    }
    //devoloped by @raulcarm0
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_attack;
    private javax.swing.JButton btn_ranking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_Turno;
    private javax.swing.JLabel lb_dadoEnemy;
    private javax.swing.JLabel lb_dadoYou;
    private javax.swing.JLabel lb_hpEnemy;
    private javax.swing.JLabel lb_hpYou;
    private javax.swing.JLabel lb_imgYou;
    private javax.swing.JLabel lb_numTurno;
    private javax.swing.JLabel lb_pkm1;
    private javax.swing.JLabel lb_pkm2;
    private javax.swing.JLabel lb_trainer;
    private javax.swing.JLabel lb_you;
    private javax.swing.JProgressBar pb_HpEnemy;
    private javax.swing.JProgressBar pb_HpYou;
    // End of variables declaration//GEN-END:variables

    void setNomePokemon(Pokemon p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
