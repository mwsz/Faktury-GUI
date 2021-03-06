/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormaPlatnosciGui.java
 *
 * Created on 2011-05-29, 11:23:25
 */

package forms;

import beans.FormaPlatnosci;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariusz
 */
public class FormaPlatnosciGui extends javax.swing.JDialog {

    private int idpress;

    /** Creates new form FormaPlatnosciGui */
    public FormaPlatnosciGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListaFormPlatnosci();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldOpis = new javax.swing.JTextField();
        Nowy = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldWartosc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Zapisz = new javax.swing.JButton();
        Zamknij = new javax.swing.JButton();
        Edytuj = new javax.swing.JButton();
        Usun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma płatności");

        Nowy.setText("Nowy");
        Nowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NowyActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Ilość dni");

        jLabel1.setText("Opis");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Zapisz.setText("Zapisz");
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        Zamknij.setText("Zamknij");
        Zamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZamknijActionPerformed(evt);
            }
        });

        Edytuj.setText("Edytuj");
        Edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdytujActionPerformed(evt);
            }
        });

        Usun.setText("Usuń");
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Edytuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Zapisz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Zamknij, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nowy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldWartosc)
                            .addComponent(jTextFieldOpis, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldOpis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Nowy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Edytuj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Zapisz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Zamknij)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NowyActionPerformed
        idpress = 0;
        jTextEditable(true);
        this.jTextFieldOpis.setText(null);
        this.jTextFieldWartosc.setText(null);
        this.Nowy.setEnabled(false);
        this.Edytuj.setEnabled(false);
        this.Usun.setEnabled(false);
        this.Zapisz.setEnabled(true);
    }//GEN-LAST:event_NowyActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        this.Nowy.setEnabled(true);
        this.Edytuj.setEnabled(true);
        this.Usun.setEnabled(true);
        this.Zapisz.setEnabled(false);
        int rec = this.jTable1.getSelectedRow();
        idpress = Integer.parseInt(jTable1.getValueAt(rec, 0).toString());

        FormaPlatnosci objFormaPlatnosci = new FormaPlatnosci();
        objFormaPlatnosci.znajdzFormePlatnosci(idpress);

        this.jTextFieldOpis.setText(objFormaPlatnosci.getOpis());
        this.jTextFieldWartosc.setText(Integer.toString(objFormaPlatnosci.getIlosc_dni()));

        jTextEditable(false);
}//GEN-LAST:event_jTable1MousePressed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        FormaPlatnosci objFormaPlatnosci = new FormaPlatnosci();
        objFormaPlatnosci.setOpis(this.jTextFieldOpis.getText());
        objFormaPlatnosci.setIlosc_dni(Integer.parseInt(this.jTextFieldWartosc.getText()));
        if (idpress == 0) {
            objFormaPlatnosci.dodajFormePlatnosci();
        } else {
            objFormaPlatnosci.poprawFormePlatnosci(idpress);
        }
        ListaFormPlatnosci();
}//GEN-LAST:event_ZapiszActionPerformed

    private void ZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZamknijActionPerformed
        this.dispose();
}//GEN-LAST:event_ZamknijActionPerformed

    private void EdytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdytujActionPerformed
        jTextEditable(true);
        this.Nowy.setEnabled(false);
        this.Edytuj.setEnabled(false);
        this.Usun.setEnabled(false);
        this.Zapisz.setEnabled(true);
}//GEN-LAST:event_EdytujActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        int usun = JOptionPane.showConfirmDialog(null, "Czy na pewno usunąc wpis?");
        if (usun == 0) {
            FormaPlatnosci objFormaPlatnosci = new FormaPlatnosci();
            objFormaPlatnosci.setId(idpress);
            objFormaPlatnosci.usunFormePlatnosci();
            ListaFormPlatnosci();
        }
}//GEN-LAST:event_UsunActionPerformed

        public void ListaFormPlatnosci() {
        DefaultTableModel table = new DefaultTableModel();
        FormaPlatnosci objFormaPlatnosci = new FormaPlatnosci();
        ArrayList<FormaPlatnosci> listaFormPlatnosci = new ArrayList();
        listaFormPlatnosci = objFormaPlatnosci.ListaFormaPlatnosci();

        table.addColumn("id");
        table.addColumn("Opis");
        table.addColumn("Ilość dni");
        table.setRowCount(listaFormPlatnosci.size());
        int i = 0;
        for (FormaPlatnosci x : listaFormPlatnosci) {
            table.setValueAt(x.getId(), i, 0);
            table.setValueAt(x.getOpis(), i, 1);
            table.setValueAt(x.getIlosc_dni(), i, 2);
            i++;
        }

        this.jTable1.setModel(table);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);

        jTextEditable(false);

        this.Nowy.setEnabled(true);
        this.Edytuj.setEnabled(false);
        this.Usun.setEnabled(false);
        this.Zapisz.setEnabled(false);

        this.jTextFieldOpis.setText(null);
        this.jTextFieldWartosc.setText(null);

    }

    public void jTextEditable(boolean a) {

        if (a) {
            this.jTextFieldOpis.setEditable(true);
            this.jTextFieldWartosc.setEditable(true);
            } else {
            this.jTextFieldOpis.setEditable(false);
            this.jTextFieldWartosc.setEditable(false);
            }
    }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaPlatnosciGui dialog = new FormaPlatnosciGui(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edytuj;
    private javax.swing.JButton Nowy;
    private javax.swing.JButton Usun;
    private javax.swing.JButton Zamknij;
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldOpis;
    private javax.swing.JTextField jTextFieldWartosc;
    // End of variables declaration//GEN-END:variables

}
