/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.awt.Font;
          
/**
 *
 * @author Gabriel Ramos
 */
public class GUI extends javax.swing.JFrame {
       int next = 0;   

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
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
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Ramos\\Desktop\\New folder (16)\\pcs-unirio\\PCS\\src\\5.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
    if (next == 6){
        jTextPane1.setText("  Nobody but a real princess could be as sensitive as that.\n" +
"\n" +
"     So the prince took her for his wife, for now he knew that he had a real princess; and the pea was put in the museum, where it may still be seen, if no one has stolen it.\n" +
"\n" +
"     There, that is a true story.");
                
                
        next++;
    }
        
        
        
    if (next == 5){
        jTextPane1.setText("  On this the princess had to lie all night. In the morning she was asked how she had slept.\n" +
"\n" +
"     \"Oh, very badly!\" said she. \"I have scarcely closed my eyes all night. Heaven only knows what was in the bed, but I was lying on something hard, so that I am black and blue all over my body. It's horrible!\"\n" +
"\n" +
"     Now they knew that she was a real princess because she had felt the pea right through the twenty mattresses and the twenty eider-down beds.");
        next++;
    }
        
        
        
        
    if (next == 4){
        jTextPane1.setText("  It was a princess standing out there in front of the gate. But, good gracious! what a sight the rain and the wind had made her look. The water ran down from her hair and clothes; it ran down into the toes of her shoes and out again at the heels. And yet she said that she was a real princess.\n" +
"\n" +
"     Well, we'll soon find that out, thought the old queen. But she said nothing, went into the bed-room, took all the bedding off the bedstead, and laid a pea on the bottom; then she took twenty mattresses and laid them on the pea, and then twenty eider-down beds on top of the mattresses.");
        next++;
    }
        
        
     if (next == 3){
        jTextPane1.setText("Once upon a time there was a prince who wanted to marry a princess; but she would have to be a real princess. He travelled all over the world to find one, but nowhere could he get what he wanted. There were princesses enough, but it was difficult to find out whether they were real ones. There was always something about them that was not as it should be. So he came home again and was sad, for he would have liked very much to have a real princess.\n" +
                "\n" +"One evening a terrible storm came on; there was thunder and lightning, and the rain poured down in torrents. Suddenly a knocking was heard at the city gate, and the old king went to open it.");
        next++;
    }
        
        
    if (next == 2){
        jTextField2.setText("");
        jTextPane1.setText("Escolha um conto e entre com seu número a baixo e aperte next :"+"\n"
                + " 1 = The Princess and the Pea");
        next++;
    }
        
    if (next == 1){
        jTextField2.setText("");
        jTextPane1.setText("Escolha uma dificuldade e entre com seu número a baixo e aperte next :"+"\n"
                + "1 = fácil"+"\n"
                + "2 = médio"+"\n"
                + "3 = difícil");
        next++;
    }
        
    if (next == 0){
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    jTextPane1.setFont(font1);
    jTextPane1.setText("Entre seu nome a baixo e depois aperte next(que quer dizer proximo)");
    next++;
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

}




