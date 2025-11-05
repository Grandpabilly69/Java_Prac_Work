package Question2;
//St10442155
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import Question2.MovieTickets;

public class Tickets extends javax.swing.JFrame {

    public Tickets() {
        initComponents();
        
    }

    MovieTickets mt = new MovieTickets();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMovieSelcetion = new javax.swing.JComboBox<>();
        edtTickets = new javax.swing.JTextField();
        edtPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReport = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniProcess = new javax.swing.JMenuItem();
        mniClear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MOVIE:");

        jLabel2.setText("NUMBER OF TICKETS:");
        jLabel2.setToolTipText("");

        jLabel3.setText("TICKET PRICE:");

        jLabel4.setText("TICKET REPORT:");

        cmbMovieSelcetion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Napoleon", "Oppenheimer", "Damsel", "hiu" }));
        cmbMovieSelcetion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMovieSelcetionActionPerformed(evt);
            }
        });

        edtTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTicketsActionPerformed(evt);
            }
        });

        txtReport.setEditable(false);
        txtReport.setColumns(20);
        txtReport.setRows(5);
        jScrollPane1.setViewportView(txtReport);

        jMenu1.setText("File");

        mniExit.setText("Exit");
        mniExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniExitMouseClicked(evt);
            }
        });
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mniProcess.setText("Process");
        mniProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProcessActionPerformed(evt);
            }
        });
        jMenu2.add(mniProcess);

        mniClear.setText("Clear");
        mniClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClearActionPerformed(evt);
            }
        });
        jMenu2.add(mniClear);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(edtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtTickets)
                                    .addComponent(cmbMovieSelcetion, 0, 238, Short.MAX_VALUE))))
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMovieSelcetion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Sorry Mr Sam I accedentally added these and don't know how to get rid of them😭😭
    
    private void edtTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTicketsActionPerformed

    private void mniExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mniExitMouseClicked

    private void cmbMovieSelcetionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMovieSelcetionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMovieSelcetionActionPerformed

    
    //terminates programme
    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProcessActionPerformed
        
        //Stores values into variables
        String movie = (String)cmbMovieSelcetion.getSelectedItem();
        

        double price = Double.parseDouble(edtPrice.getText());
        
        int numTickets = Integer.parseInt(edtTickets.getText());
        
        //instantiates object using variables
        MovieTicketData mtd = new MovieTicketData(movie, numTickets, price);
        
        
        //if the data check works the if statement will run else it will not execute anyting besides a message
        if(mt.ValidateData(mtd)){
            //i create a string to make it easier to add to text area and file
            String heading = "Movie Ticket Report\n";
            String sout = "**************************************************************"; 
            
            sout += "\nMovie Name:\t\t" + movie;
            
            sout += "\nMovie Ticket price:\tR" + price;
            
            sout += "\nNumber OF Tickets:\t"+ numTickets;
            
            
            sout += "\nToatl Ticket Price:\tR" +mt.CalculateTotalTicketPrice(numTickets, price);
            
            sout += "\n************************************************************";
        
            //adds to text area
            txtReport.append(heading + sout);
            
            //adds to file and tries creating file so it exists
            createFile();
            writeFile(sout);
        }else{
            JOptionPane.showMessageDialog(null, "Please make sure inputs are valid");
        }
        
    }//GEN-LAST:event_mniProcessActionPerformed

    //resets components
    private void mniClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClearActionPerformed
        cmbMovieSelcetion.setSelectedIndex(0);
        edtPrice.setText("");
        edtTickets.setText("");
        txtReport.setText("");
    }//GEN-LAST:event_mniClearActionPerformed

    //creates file with correct name and displays message if completed or not
    public void createFile(){
        try {
            File f = new File("report.txt");
            
            f.createNewFile();
            
            JOptionPane.showMessageDialog(null, "File created");
        } catch (HeadlessException | IOException e) {
            
            JOptionPane.showMessageDialog(null, "File already exists");
        }
    }
    
    
    //writes to file using the input 
    //displays a message id it is done successfully or not
    public void writeFile(String input){
       
        try {
            
            FileWriter fw = new FileWriter("report.txt");
            
            fw.write(input);
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Successfully saved");
            
        } catch (HeadlessException | IOException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMovieSelcetion;
    private javax.swing.JTextField edtPrice;
    private javax.swing.JTextField edtTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniClear;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniProcess;
    private javax.swing.JTextArea txtReport;
    // End of variables declaration//GEN-END:variables
}
