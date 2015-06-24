/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pcs.Pergunta;
import pcs.Quiz;
import pcs.Resposta;
import pcs.Saver;
import pcs.Usuario;
import pcs.historicoBuilder;
import pcs.PerguntaBuilder;
import pcs.RespostaBuilder;


/**
 *
 * @author Gabriel Ramos
 */
public class TheLiony extends javax.swing.JFrame {
    float nota;
    int chance=1;
      String nome2;
    String titulo1;
    private String nome1;
    
    /**
     * Creates new form TheAntQuiz
     */
    public TheLiony() {
        
        initComponents();
        this.setSize(1011, 731);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        PerguntaBuilder p = new PerguntaBuilder();
        String  x = null;
        
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta1.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel2.setText(x);
        
   
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta2.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel3.setText(x);
        
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta3.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel4.setText(x);
        

        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta4.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel5.setText(x);
        

        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta5.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel6.setText(x);
        
      jButton1.setText("Corrigir "+chance+" chances");
        
    }

    public TheLiony(String nomeUsuario, String titulo) {
        nome2 = nome1;
        titulo1 = titulo;
          initComponents();
        this.setSize(1011, 731);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        PerguntaBuilder p = new PerguntaBuilder();
        String  x = null;
        
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta1.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel2.setText(x);
        
   
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta2.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel3.setText(x);
        
        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta3.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel4.setText(x);
        

        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta4.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel5.setText(x);
        

        try { 
            x = p.getPergunta("Quiz/quizNivel3/pergunta5.txt");
        } catch (FileNotFoundException ex) {

        }
        jLabel6.setText(x);
        
      jButton1.setText("Corrigir "+chance+" chances");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Corrigir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(800, 620, 180, 70);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 70, 330, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 710, 60);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(50, 210, 330, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 290, 660, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 420, 640, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 550, 630, 80);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(50, 350, 330, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 560, 280, 70);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(50, 490, 330, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 74, 210, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 500, 210, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 350, 210, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 210, 200, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 640, 210, 40);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(50, 630, 330, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 10, 640, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/quizimg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                if (chance>0){
        try {
            String resp1, resp2, resp3, resp4, resp5, c1, c2, c3, c4, c5;
            resp1 = jTextField1.getText();
            resp2 = jTextField2.getText();
            resp3 = jTextField3.getText();
            resp4 = jTextField4.getText();
            resp5 = jTextField5.getText();
            RespostaBuilder r1 = new RespostaBuilder();
            c1 = r1.getResposta("Quiz/respostaNivel3/1.txt");
            c2 = r1.getResposta("Quiz/respostaNivel3/2.txt");
            c3 = r1.getResposta("Quiz/respostaNivel3/3.txt");
            c4 = r1.getResposta("Quiz/respostaNivel3/4.txt");
            c5 = r1.getResposta("Quiz/respostaNivel3/5.txt");
            Quiz q = new Quiz(resp1, c1, resp2, c2, resp3, c3, resp4, c4, resp5, c5);
            int nota = 0;
            nota = q.Corrigir();
            jLabel7.setText("Sua nota é : "+nota+"%");
            if (q.q1()){
            jLabel8.setText("");
            } else {
            jLabel8.setText("Você errou!"); 
            }
            
            if (q.q2()){
            jLabel9.setText("");
            } else {
            jLabel9.setText("Você errou!"); 
            }
            
            if (q.q3()){
            jLabel10.setText("");
            } else {
            jLabel10.setText("Você errou!"); 
            }
            
            if (q.q4()){
            jLabel11.setText("");
            } else {
            jLabel11.setText("Você errou!"); 
            }
            
            if (q.q5()){
            jLabel12.setText("");
            } else {
            jLabel12.setText("Você errou!"); 
            }
            
            chance--;
            if (chance==0) {
               jButton1.setText("Enviar"); 
            } else {
            jButton1.setText("Corrigir "+chance+" chances");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TheAntQuiz.class.getName()).log(Level.SEVERE, null, ex);
        } } else{
                                jLabel8.setText("");
                                jLabel10.setText("");
                                jLabel11.setText("");
                                jLabel12.setText("");
                                jLabel9.setText("");           
                    
                                
           // Historico                    
                                
                    
          System.out.println(titulo1);     
             System.out.println(nome2);
             System.out.println(nota);
             
                    
       historicoBuilder hist = null;
                    try {
                        hist = new historicoBuilder(nome2, titulo1, nota);
                        System.out.println("pegou");
                        System.out.println(hist.getData());
                    } catch (ParseException ex) {
                        Logger.getLogger(TheAntQuiz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
       Saver salvar = new Saver();
        try {
            salvar.salvarJogo(hist);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TheAntQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }
             
              
        
        // End Historico
        
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TheAntQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheAntQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheAntQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheAntQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheLiony().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
