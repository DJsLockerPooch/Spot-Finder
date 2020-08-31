package spotfinder;

public class SpotFinderFrame extends javax.swing.JFrame {

    public SpotFinderFrame() {
        initComponents();
        playArea.resetGame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        distanceLabel = new javax.swing.JLabel();
        guessDisplay = new javax.swing.JTextField();
        guessLabel = new javax.swing.JLabel();
        distanceDisplay = new javax.swing.JTextField();
        newGameButton = new javax.swing.JButton();
        playArea = new spotfinder.SpotFinderPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        distanceLabel.setText("Last Guess Distance: ");
        jPanel1.add(distanceLabel);

        guessDisplay.setEditable(false);
        guessDisplay.setColumns(5);
        jPanel1.add(guessDisplay);

        guessLabel.setText("Number of Guesses: ");
        jPanel1.add(guessLabel);

        distanceDisplay.setEditable(false);
        distanceDisplay.setColumns(5);
        jPanel1.add(distanceDisplay);

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newGameButton);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        playArea.setFont(new java.awt.Font("Chalkboard", 0, 48)); // NOI18N
        playArea.setPreferredSize(new java.awt.Dimension(1000, 800));
        playArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playAreaMousePressed(evt);
            }
        });
        playArea.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(playArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        playArea.resetGame();
        playArea.repaint();
        updateControls();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void playAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playAreaMousePressed
        updateControls();
    }//GEN-LAST:event_playAreaMousePressed

    
    private void updateControls(){
        guessDisplay.setText(Integer.toString(playArea.getLastGuessDistance()));
        distanceDisplay.setText(Integer.toString(playArea.getGuessCount()));
    }
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
            java.util.logging.Logger.getLogger(SpotFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpotFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpotFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpotFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpotFinderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField distanceDisplay;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JTextField guessDisplay;
    private javax.swing.JLabel guessLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGameButton;
    private spotfinder.SpotFinderPanel playArea;
    // End of variables declaration//GEN-END:variables
}
