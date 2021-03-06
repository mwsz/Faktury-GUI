/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TowarGui.java
 *
 * Created on 2011-05-08, 21:05:57
 */

package forms;

import beans.Jednostka;
import beans.StawkaVat;
import beans.Towar;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mariusz
 */
public class TowarGui extends javax.swing.JDialog {

    private int idpress;
    ArrayList<Jednostka> listaJednostek;
    ArrayList<StawkaVat> listaStawekVat;

    /** Creates new form TowarGui */
    public TowarGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListaTowarow();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCenaBrutto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Usun = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();
        Nowy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldSkrot = new javax.swing.JTextField();
        jTextFieldNazwa = new javax.swing.JTextField();
        jTextFieldPkwiu = new javax.swing.JTextField();
        jTextFieldCenaNetto = new javax.swing.JTextField();
        Edytuj = new javax.swing.JButton();
        Zamknij = new javax.swing.JButton();
        jComboBoxJednm = new javax.swing.JComboBox();
        jComboBoxVat = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Towary i usługi");

        jTextFieldCenaBrutto.setEditable(false);

        jLabel3.setText("PKWIU");

        jLabel1.setText("Skrót");

        jLabel2.setText("Nazwa");

        jLabel7.setText("Cena brutto");

        jLabel6.setText("Cena netto");

        jLabel5.setText("Vat");

        jLabel4.setText("Jednostka miary");

        Usun.setText("Usuń");
        Usun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        Zapisz.setText("Zapisz");
        Zapisz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        Nowy.setText("Nowy");
        Nowy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NowyActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextFieldSkrot.setEditable(false);

        jTextFieldNazwa.setEditable(false);

        jTextFieldPkwiu.setEditable(false);

        jTextFieldCenaNetto.setEditable(false);
        jTextFieldCenaNetto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCenaNettoFocusLost(evt);
            }
        });

        Edytuj.setText("Edytuj");
        Edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdytujActionPerformed(evt);
            }
        });

        Zamknij.setText("Zamknij");
        Zamknij.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Zamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZamknijActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxVat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxJednm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSkrot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jTextFieldNazwa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPkwiu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCenaNetto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCenaBrutto, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(Zamknij, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(Zapisz, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(Usun, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(Edytuj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(Nowy, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldSkrot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPkwiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jComboBoxJednm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jComboBoxVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCenaNetto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCenaBrutto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Nowy)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Edytuj)
                            .addGap(11, 11, 11)
                            .addComponent(Usun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Zapisz)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Zamknij))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        int usun = JOptionPane.showConfirmDialog(null, "Czy na pewno usunąc towar?");
        if (usun == 0) {
            Towar objTowar = new Towar();
            objTowar.setId(idpress);
            objTowar.usunTowar();
            ListaTowarow();
        }
        
}//GEN-LAST:event_UsunActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed

        Jednostka selJedn;
        StawkaVat selVat;
        Towar objTowar = new Towar();
        objTowar.setSkrot(this.jTextFieldSkrot.getText());
        objTowar.setNazwa(this.jTextFieldNazwa.getText());
        objTowar.setPkwiu(this.jTextFieldPkwiu.getText());

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setGroupingUsed(false);

        selJedn = (Jednostka) this.jComboBoxJednm.getSelectedItem();
        objTowar.setJednm(selJedn.getId());

        selVat = (StawkaVat) this.jComboBoxVat.getSelectedItem();
        objTowar.setVat(selVat.getWartoscvat());

        objTowar.setCena_netto(Double.parseDouble(this.jTextFieldCenaNetto.getText()));
        objTowar.setCena_brutto(Double.parseDouble(this.jTextFieldCenaBrutto.getText()));
        if (idpress == 0) {
            objTowar.dodajTowar();
        } else {
            objTowar.poprawTowar(idpress);
        }

        this.jComboBoxJednm.removeAllItems();
        this.jComboBoxVat.removeAllItems();
        ListaTowarow();
        
}//GEN-LAST:event_ZapiszActionPerformed

    private void NowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NowyActionPerformed

        idpress = 0;
        jTextEditable(true);
        this.jTextFieldSkrot.setText(null);
        this.jTextFieldNazwa.setText(null);
        this.jTextFieldPkwiu.setText(null);
        this.jComboBoxJednm.setEnabled(true);
        this.jComboBoxVat.setEnabled(true);
        this.jTextFieldCenaNetto.setText(null);
        this.jTextFieldCenaBrutto.setText(null);
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

        Towar objTowar = new Towar();
        objTowar.znajdzTowar(idpress);

        this.jTextFieldSkrot.setText(objTowar.getSkrot());
        this.jTextFieldNazwa.setText(objTowar.getNazwa());
        this.jTextFieldPkwiu.setText(objTowar.getPkwiu());
        this.jTextFieldCenaNetto.setText(Double.toString(objTowar.getCena_netto()));
        this.jTextFieldCenaBrutto.setText(Double.toString(objTowar.getCena_brutto()));

        Jednostka objJedn = new Jednostka();
        objJedn.znajdzJednostke(objTowar.getJednm());
       
        for (Jednostka z : listaJednostek) {
            if (objTowar.getJednm() == z.getId())
                this.jComboBoxJednm.setSelectedItem(z);
        }

        StawkaVat objSta = new StawkaVat();
        objSta.znajdzStawkeVat(objTowar.getVat());

        for (StawkaVat y : listaStawekVat) {
            if (objTowar.getVat() == y.getWartoscvat())
                this.jComboBoxVat.setSelectedItem(y);
        }


        jTextEditable(false);
    }//GEN-LAST:event_jTable1MousePressed

    private void EdytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdytujActionPerformed

        jTextEditable(true);
        this.Nowy.setEnabled(false);
        this.Edytuj.setEnabled(false);
        this.Usun.setEnabled(false);
        this.Zapisz.setEnabled(true);
    }//GEN-LAST:event_EdytujActionPerformed

    private void ZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZamknijActionPerformed
        this.dispose();
}//GEN-LAST:event_ZamknijActionPerformed

    private void jTextFieldCenaNettoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCenaNettoFocusLost
        StawkaVat selVat;
        selVat = (StawkaVat) this.jComboBoxVat.getSelectedItem();

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setGroupingUsed(false);

        Double brutto = Double.parseDouble(this.jTextFieldCenaNetto.getText()) * (100 + selVat.getWartoscvat())/100;

        this.jTextFieldCenaBrutto.setText(nf.format(brutto).replace(',', '.').toString());
    }//GEN-LAST:event_jTextFieldCenaNettoFocusLost

    public void ListaTowarow() {
        DefaultTableModel table = new DefaultTableModel();
        Towar objTowar = new Towar();
        ArrayList<Towar> listaTowarow = new ArrayList();
        listaTowarow = objTowar.ListaTowarow();

        table.addColumn("id");
        table.addColumn("Skrót");
        table.addColumn("Nazwa");
        table.addColumn("Cena Netto");
        table.addColumn("VAT");
        table.addColumn("Cena Brutto");
        table.setRowCount(listaTowarow.size());
        int i = 0;

        for (Towar x : listaTowarow) {
            table.setValueAt(x.getId(), i, 0);
            table.setValueAt(x.getSkrot(), i, 1);
            table.setValueAt(x.getNazwa(), i, 2);
            table.setValueAt(x.getCena_netto(), i, 3);
            table.setValueAt(x.getVat(), i, 4);
            table.setValueAt(x.getCena_brutto(), i, 5);
            i++;
        }

        this.jTable1.setModel(table);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);

        Jednostka objJednostka = new Jednostka();
        listaJednostek = objJednostka.ListaJednostek();

        for (Jednostka z : listaJednostek) {
            jComboBoxJednm.addItem(z);

        }

        StawkaVat objStawkaVat = new StawkaVat();
        listaStawekVat = objStawkaVat.ListaStawekVat();

        for (StawkaVat y : listaStawekVat) {
            jComboBoxVat.addItem(y);
        }



        jTextEditable(false);

        this.Nowy.setEnabled(true);
        this.Edytuj.setEnabled(false);
        this.Usun.setEnabled(false);
        this.Zapisz.setEnabled(false);

        this.jTextFieldSkrot.setText(null);
        this.jTextFieldNazwa.setText(null);
        this.jTextFieldPkwiu.setText(null);
       // this.jComboBoxJednm.setEnabled(false);
       // this.jComboBoxVat.setEnabled(false);
        this.jTextFieldCenaNetto.setText(null);
        this.jTextFieldCenaBrutto.setText(null);
    }


    public void jTextEditable(boolean a) {

        if (a) {
            this.jTextFieldSkrot.setEditable(true);
            this.jTextFieldNazwa.setEditable(true);
            this.jTextFieldPkwiu.setEditable(true);
            this.jComboBoxJednm.setEditable(true);
            this.jComboBoxVat.setEditable(true);
            this.jTextFieldCenaNetto.setEditable(true);
            this.jTextFieldCenaBrutto.setEditable(true);
            } else {
            this.jTextFieldSkrot.setEditable(false);
            this.jTextFieldNazwa.setEditable(false);
            this.jTextFieldPkwiu.setEditable(false);
            this.jComboBoxJednm.setEditable(false);
            this.jComboBoxVat.setEditable(false);
            this.jTextFieldCenaNetto.setEditable(false);
            this.jTextFieldCenaBrutto.setEditable(false);}
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TowarGui dialog = new TowarGui(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxJednm;
    private javax.swing.JComboBox jComboBoxVat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCenaBrutto;
    private javax.swing.JTextField jTextFieldCenaNetto;
    private javax.swing.JTextField jTextFieldNazwa;
    private javax.swing.JTextField jTextFieldPkwiu;
    private javax.swing.JTextField jTextFieldSkrot;
    // End of variables declaration//GEN-END:variables

}
