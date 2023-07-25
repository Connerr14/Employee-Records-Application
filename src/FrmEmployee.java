/*
Created by Conner Recoskie.
Date: May 2nd, 2023.
This program allows users to add employee's and employee details to a list. 
The user can then remove different employees at will and/or list out all the
employees and data they have inputted. 
*/

// Importing the library needed for array lists
import java.util.ArrayList;

public class FrmEmployee extends javax.swing.JFrame {
    // Create an ArrayList to store employeeDetails objects
    ArrayList <employeeDetails> employees = new ArrayList <>();
    
    // Initialize the number of employees to 0
    int numOfEmployees = 0;
    
    // Initialize the employee ID's number to 0
    int idNumber = 0;
    
    // An inner class to represent employee details
    public class employeeDetails {
        // Fields to store employee information
        int idNumber;
        String firstName;
        String lastName;
        double annualSalary;
        String startDate;

    // A constructor to create employeeDetails objects
    public employeeDetails(String firstName, String lastName, double annualSalary,
    String startDate, int idNumber) {
        // Set the fields to the values passed as arguments
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.idNumber = idNumber;
        this.annualSalary = annualSalary;
    }
    
    // Getter methods to access the fields
    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getStartDate() {
        return startDate;
    }
}
    public FrmEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblIdNumber = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtAnnualSalary = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputWindow = new javax.swing.JTextArea();
        lblInstructions = new javax.swing.JLabel();
        lblInstructions1 = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();
        lblInstructions3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnClearInputs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTitle.setText("<html><u>Employee Records</u></html>");

        lblIdNumber.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblIdNumber.setText("ID Number:");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLastName.setText("Last Name:");

        lblSalary.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSalary.setText("Annual Salary:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblStartDate.setText("Start Date:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        txtOutputWindow.setColumns(20);
        txtOutputWindow.setRows(5);
        jScrollPane1.setViewportView(txtOutputWindow);

        lblInstructions.setText("Enter an employees credentials and then \"click\" add to");

        lblInstructions1.setText("add them to the list . Enter the employees ID # and click ");

        lblInstructions2.setText("\"remove\" to remove an employee. Click \"list\" to see all");

        lblInstructions3.setText("the data stored.");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClearInputs.setText("Clear");
        btnClearInputs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearInputsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstructions1)
                            .addComponent(lblInstructions2)
                            .addComponent(lblInstructions3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblInstructions))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSalary)
                                            .addComponent(lblStartDate))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAnnualSalary)
                                            .addComponent(txtStartDate)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIdNumber)
                                            .addComponent(lblLastName)
                                            .addComponent(lblFirstName))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtId)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClearInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdNumber)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearInputs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // This method adds an employee to the list of employees
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Clearing output window
        txtOutputWindow.setText("");
        
        // Initialize variables to hold employee information
        String firstName = "";
        String lastName = "";
        double annualSalary = 0;
        String startDate = "";
        
        // Error checking user input 
        try
        {
             // Parse user input for employee information
            idNumber = Integer.parseInt(txtId.getText());
            firstName = txtFirstName.getText();
            lastName = txtLastName.getText();
            annualSalary = Double.parseDouble(txtAnnualSalary.getText());
            startDate = txtStartDate.getText();
        }
        catch (NumberFormatException e)
        {
            // Handle invalid input
            txtOutputWindow.setText("Invalid Input");
        }
        
        // Create a new employee object with user input
        employeeDetails newEmployee = new employeeDetails(firstName, lastName,
               annualSalary, startDate, idNumber);
        
        // Adding the employee to the list
        employees.add(newEmployee);
       
        // Incrementing the numOfEmployees variable
        numOfEmployees += 1;
    }//GEN-LAST:event_btnAddActionPerformed

    // This method displays the list of employees in the output window
    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // Clearing the output window
        txtOutputWindow.setText("");
        
        // Creating a title for the list
        String title = "Employees: \n";
        
        // Appending the title to the output window
        txtOutputWindow.append(title);
        
          // Looping through the list of employees and displaying their information
        for (int i = 0; i < numOfEmployees; i++)
        {  
            employeeDetails employee = employees.get(i);
            
            // Adding employee data to a string
            String employeeData = "ID Number: " + employee.getIdNumber()
                + "\nFirst Name: " + employee.getFirstName()
                + "\nLast Name: " + employee.getLastName()
                + "\nAnnual Salary: " + employee.getAnnualSalary()
                + "\nStart Date: " + employee.getStartDate()
                + "\n\n";
            
            // Appending employee information to the output window
            txtOutputWindow.append(employeeData);
        }
    }//GEN-LAST:event_btnListActionPerformed

    // This method exits the application
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    
    // This method removes an employee from the list of employees
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // Clearing the output window
        txtOutputWindow.setText("");
        
        // Declaring variable to hold employee id number
        int removal = -1;
        
        // Error checking user input
        try 
        {   
            // Parsing user input for employee ID
            idNumber = Integer.parseInt(txtId.getText());
        }
        catch (NumberFormatException e)
        {
            // Handling invalid input
            txtOutputWindow.setText("Invalid Input");
        }
        
        // Loop through the list of employees to find the employee to be removed
        for (int i = 0; i < numOfEmployees; i++)
        {
            employeeDetails employee = employees.get(i);
            if (employee.idNumber == idNumber)
            {
                removal = i;
            }
        }
        
          // If employee is found, remove them from the list of employees
        if (removal != -1)
        {
            employees.remove(removal);
            numOfEmployees -= 1;
            txtOutputWindow.setText("Employee " + idNumber + " has been removed.");
        }
        else
        {
            // If the id inputted is not found, Output message to user
            txtOutputWindow.setText("Employee not found");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed
    // This method clears the program fields
    private void btnClearInputsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearInputsActionPerformed
        // Clearing the input fields
        txtId.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAnnualSalary.setText("");
        txtStartDate.setText("");
        
        // Clearing the output field
        txtOutputWindow.setText("");
    }//GEN-LAST:event_btnClearInputsActionPerformed


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
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearInputs;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblIdNumber;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblInstructions3;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnnualSalary;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtOutputWindow;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
