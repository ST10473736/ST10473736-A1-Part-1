package proga1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class signupUI extends javax.swing.JFrame {

    public signupUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameInput = new javax.swing.JFormattedTextField();
        passwdInput = new javax.swing.JFormattedTextField();
        phoneInput = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        phoneInput.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("Phone number:");

        jLabel4.setText("Account creation page");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
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

        // Grabs data from text input and declares the text to a String
        String username = usernameInput.getText();
        String password = passwdInput.getText();
        String phone = phoneInput.getText();

        // Checks whether or not username is correctly formatted
        if (!isValidUsername(username)) {
            JOptionPane.showMessageDialog(this,
                    "Username may not extend 5 characters and must include [_]",
                    "Invalid Username", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Checks whether or not username exists in text file
        if (!usernameExists(username)) {
            JOptionPane.showMessageDialog(this,
                    "That username is already taken. Please choose a different one.",
                    "Duplicate Username", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Checks whether or not password is correctly formatted
        if (!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this,
                    "Password incorrectly formatted." + "\n" + "- Must be atleast 8 characters long"
                    + "\n" + "- Contain a capital letter" + "\n"
                    + "- Contain a number" + "\n" + "- Contain a special character",
                    "Invalid Password", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Checks whether or not the phone number is correctly formatted
        if (!isValidPhone(phone)) {
            JOptionPane.showMessageDialog(this,
                    "Cell number needs international code and needs to be correctly formatted. E.g +27123456789",
                    "Invalid Phone Number",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Writes to file in format [username, password, phone number]
        writetoFile(username, password, phone);
        JOptionPane.showMessageDialog(this,
                "Account created successfully!", "Success",
                JOptionPane.INFORMATION_MESSAGE);

        // Clears fields and closes current window and returns to make window
        clearFields();

        this.dispose();
        mainUI main = new mainUI();
        main.setVisible(true);

    }//GEN-LAST:event_proceedButtonMouseClicked

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        this.dispose();
        mainUI main = new mainUI();
        main.setVisible(true);
    }//GEN-LAST:event_returnButtonMouseClicked

    // Method which does the verifying of the username
    public boolean isValidUsername(String user) {
        if (user == null) {
            return false;
        }
        if (user.length() > 5) {
            return false;
        }
        return user.contains("_");
    }

    /* 
        This method loops through the text file and then splits each part into an array. [0] represents the username,
        [1] represents the password and [2] the phone number. If any of these matches the username trying to be
        entered it will throw an error.
     */
    public boolean usernameExists(String username) {
        File file = new File("accounts.txt");
        if (!file.exists()) {
            return false;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equalsIgnoreCase(username)) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /*
        Method checks whether or not the password is valid
        Checks first if the password is greater than 8 characters
        Then if there is at least one uppercase character
        If there is at least one digit
        If there is at least one special character
     */
    public boolean isValidPassword(String pass) {
        if (pass == null) {
            return false;
        }
        // (?=.{8,}) Has to be 8 characters
        // (?=.*[A-Z]) Has to have an uppercase
        // (?=.*\d) Has to have atleast one digit
        // (?=.*[^A-Za-z0-9]) Has to have atleast one special character
        return pass.matches("(?=.{8,})(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).*");
    }

    /*
        Checks if phone number is valid
        Firstly, string needs a "+" indicating country code
        Then checks for country code which is first 1-3 characters of the string
        Then checks if string is of correct size 1-10 numbers
        Then ends string
     */
    public boolean isValidPhone(String num) {
        if (num == null) {
            return false;
        }
        // ^\+ Needs + at start
        // \d{1,3} country code is 1-3 digits of string
        // \d{1,10} 1-10 is phone num
        // $ Declares end of string
        return num.matches("^\\+\\d{1,3}\\d{1,10}$");
    }

    /*
        Method writes to a file called accounts.txt
        I'm formatting for username,password,phonenumber
     */
    public void writetoFile(String username, String password, String phone) {
        File file = new File("accounts.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(username + "," + password + "," + phone);
            bw.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error writing to accounts file:\n" + ex.getMessage(),
                    "I/O Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clearFields() {
        usernameInput.setText("");
        passwdInput.setText("");
        phoneInput.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField passwdInput;
    private javax.swing.JFormattedTextField phoneInput;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JFormattedTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
