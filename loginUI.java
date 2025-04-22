package proga1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import proga1.mainUI;

public class loginUI extends javax.swing.JFrame {

    public loginUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameInput = new javax.swing.JFormattedTextField();
        passwdInput = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameInput.setPreferredSize(new java.awt.Dimension(80, 30));
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        passwdInput.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel4.setText("Account login page");

        returnButton.setText("Return");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        proceedButton.setText("Proceed");
        proceedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proceedButton)
                        .addGap(1, 1, 1))))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton)
                    .addComponent(proceedButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed

    }//GEN-LAST:event_usernameInputActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed

    }//GEN-LAST:event_returnButtonActionPerformed

    private void proceedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedButtonMouseClicked

        String userInput = usernameInput.getText();
        String passInput = passwdInput.getText();
        int result = authenticate(userInput, passInput);

        /*
            Runs through various checks, 1 will be the result of a correct login which will
            eventually open into Part 2 of the assignment.
        
            0 is the result of the username being found but the password is incorrect.
        
            -1 will occur if the entered username has not been found.
        
            -2 will show if there is a general I/O error.
         */
        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(
                        this,
                        "Login successful!",
                        "",
                        JOptionPane.INFORMATION_MESSAGE
                );
                dispose();
                new mainUI().setVisible(true);
                break;

            case 0:
                JOptionPane.showMessageDialog(
                        this,
                        "Incorrect password.",
                        "Login Failed",
                        JOptionPane.WARNING_MESSAGE
                );
                break;

            case -1:
                JOptionPane.showMessageDialog(
                        this,
                        "Username not found.",
                        "Login Failed",
                        JOptionPane.WARNING_MESSAGE
                );
                break;

            case -2:
                JOptionPane.showMessageDialog(
                        this,
                        "Error reading accounts file.",
                        "I/O Error",
                        JOptionPane.ERROR_MESSAGE
                );
                break;
        }
    }//GEN-LAST:event_proceedButtonMouseClicked

    public int authenticate(String userInput, String passInput) {
        File file = new File("accounts.txt");
        if (!file.exists()) {
            return -2;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue;
                }
                if (parts[0].equals(userInput)) {
                    return parts[1].equals(passInput) ? 1 : 0;
                }
            }
            return -1;
        } catch (IOException ex) {
            ex.printStackTrace();
            return -2;
        }
    }

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        this.dispose();
        mainUI main = new mainUI();
        main.setVisible(true);
    }//GEN-LAST:event_returnButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField passwdInput;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JFormattedTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
