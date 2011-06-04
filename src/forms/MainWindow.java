package forms;

import beans.*;
import java.awt.Frame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 2011-04-07, 19:08:30
 */
/**
 *
 * @author Mariusz
 */
public class MainWindow extends javax.swing.JFrame {

    private Frame okno;

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFaktura = new javax.swing.JButton();
        jButtonKontrahenci = new javax.swing.JButton();
        jButtonTowary = new javax.swing.JButton();
        jButtonZestawienie = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDokumenty = new javax.swing.JMenu();
        jMenuItemFaktura = new javax.swing.JMenuItem();
        jMenuZestawienia = new javax.swing.JMenu();
        jMenuItemZestawienieSprz = new javax.swing.JMenuItem();
        jMenuUstawienia = new javax.swing.JMenu();
        jMenuItemKontrahenci = new javax.swing.JMenuItem();
        jMenuItemStawkiVat = new javax.swing.JMenuItem();
        jMenuItemJednostkiMiary = new javax.swing.JMenuItem();
        jMenuItemFormaPlatnosci = new javax.swing.JMenuItem();
        jMenuItemTowary = new javax.swing.JMenuItem();
        jMenuKoniec = new javax.swing.JMenu();
        jMenuItemOprogramie = new javax.swing.JMenuItem();
        jMenuItemZamknij = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Fakturka");

        jButtonFaktura.setText("Faktura VAT");
        jButtonFaktura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFakturaActionPerformed(evt);
            }
        });

        jButtonKontrahenci.setText("Kontrahenci");
        jButtonKontrahenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKontrahenciActionPerformed(evt);
            }
        });

        jButtonTowary.setText("Towary i usługi");
        jButtonTowary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTowaryActionPerformed(evt);
            }
        });

        jButtonZestawienie.setText("Zestawienie sprzedaży");
        jButtonZestawienie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZestawienieActionPerformed(evt);
            }
        });

        jLabel1.setText("Program powstał w ramach przedmiotu Projekt informatyczny");

        jLabel2.setText("Autorzy: Sławomir Bogutyn, Wiesław Skierka, Mariusz Wszelak, Tomasz Jarząbek");

        jLabel3.setFont(new java.awt.Font("Aharoni", 3, 36));
        jLabel3.setText("FAKTURKA");

        jLabel4.setFont(new java.awt.Font("Aharoni", 3, 36));
        jLabel4.setText("Program ");

        jMenuDokumenty.setText("Dokumenty");

        jMenuItemFaktura.setText("Faktura VAT");
        jMenuItemFaktura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFakturaActionPerformed(evt);
            }
        });
        jMenuDokumenty.add(jMenuItemFaktura);

        jMenuBar1.add(jMenuDokumenty);

        jMenuZestawienia.setText("Zestawienia");

        jMenuItemZestawienieSprz.setText("Zestawienie sprzedaży");
        jMenuItemZestawienieSprz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZestawienieSprzActionPerformed(evt);
            }
        });
        jMenuZestawienia.add(jMenuItemZestawienieSprz);

        jMenuBar1.add(jMenuZestawienia);

        jMenuUstawienia.setText("Ustawienia");

        jMenuItemKontrahenci.setText("Kontrahenci");
        jMenuItemKontrahenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKontrahenciActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemKontrahenci);

        jMenuItemStawkiVat.setText("Stawki Vat");
        jMenuItemStawkiVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStawkiVatActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemStawkiVat);

        jMenuItemJednostkiMiary.setText("Jednostki miary");
        jMenuItemJednostkiMiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJednostkiMiaryActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemJednostkiMiary);

        jMenuItemFormaPlatnosci.setText("Forma płatności");
        jMenuItemFormaPlatnosci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormaPlatnosciActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemFormaPlatnosci);

        jMenuItemTowary.setText("Towary i Usługi");
        jMenuItemTowary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTowaryActionPerformed(evt);
            }
        });
        jMenuUstawienia.add(jMenuItemTowary);

        jMenuBar1.add(jMenuUstawienia);

        jMenuKoniec.setText("Koniec");

        jMenuItemOprogramie.setText("O programie");
        jMenuKoniec.add(jMenuItemOprogramie);

        jMenuItemZamknij.setText("Zakończ program");
        jMenuItemZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemZamknijActionPerformed(evt);
            }
        });
        jMenuKoniec.add(jMenuItemZamknij);

        jMenuBar1.add(jMenuKoniec);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonFaktura, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jButtonZestawienie, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKontrahenci, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jButtonTowary, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                .addGap(152, 152, 152)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(194, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFaktura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonKontrahenci, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonZestawienie, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTowary, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKontrahenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKontrahenciActionPerformed
        KontrahentGui oknoKontrahent = new KontrahentGui(okno, true);
        oknoKontrahent.setVisible(true);
    }//GEN-LAST:event_jMenuItemKontrahenciActionPerformed

    private void jMenuItemZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZamknijActionPerformed
        int usun = JOptionPane.showConfirmDialog(null, "Czy na pewno zamknąć program?");
        if (usun == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemZamknijActionPerformed

    private void jMenuItemTowaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTowaryActionPerformed
        TowarGui oknoTowarGui = new TowarGui(okno, true);
        oknoTowarGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemTowaryActionPerformed

    private void jMenuItemStawkiVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStawkiVatActionPerformed
        StawkaVatGui oknoStawkaVatGui = new StawkaVatGui(okno, true);
        oknoStawkaVatGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemStawkiVatActionPerformed

    private void jMenuItemJednostkiMiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJednostkiMiaryActionPerformed
        JednostkaGui oknuJednostkaGui = new JednostkaGui(okno, true);
        oknuJednostkaGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemJednostkiMiaryActionPerformed

    private void jMenuItemFakturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFakturaActionPerformed
        FakturaGui oknuFakturaGui = new FakturaGui(okno, true);
        oknuFakturaGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemFakturaActionPerformed

    private void jButtonFakturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFakturaActionPerformed
        FakturaGui oknuFakturaGui = new FakturaGui(okno, true);
        oknuFakturaGui.setVisible(true);
    }//GEN-LAST:event_jButtonFakturaActionPerformed

    private void jButtonKontrahenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKontrahenciActionPerformed
        KontrahentGui oknoKontrahent = new KontrahentGui(okno, true);
        oknoKontrahent.setVisible(true);
    }//GEN-LAST:event_jButtonKontrahenciActionPerformed

    private void jButtonTowaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTowaryActionPerformed
        TowarGui oknoTowarGui = new TowarGui(okno, true);
        oknoTowarGui.setVisible(true);
    }//GEN-LAST:event_jButtonTowaryActionPerformed

    private void jMenuItemZamknijActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZamknijActionPerformed1
        System.exit(0);
    }//GEN-LAST:event_jMenuItemZamknijActionPerformed1

    private void jButtonZestawienieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZestawienieActionPerformed
        ZestawienieGui oknoZestawienieGui = new ZestawienieGui(okno, true);
        oknoZestawienieGui.setVisible(true);
    }//GEN-LAST:event_jButtonZestawienieActionPerformed

    private void jMenuItemZestawienieSprzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemZestawienieSprzActionPerformed
        ZestawienieGui oknoZestawienieGui = new ZestawienieGui(okno, true);
        oknoZestawienieGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemZestawienieSprzActionPerformed

    private void jMenuItemFormaPlatnosciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormaPlatnosciActionPerformed
        FormaPlatnosciGui oknoFormaPlatnosciGui = new FormaPlatnosciGui(okno, true);
        oknoFormaPlatnosciGui.setVisible(true);
    }//GEN-LAST:event_jMenuItemFormaPlatnosciActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFaktura;
    private javax.swing.JButton jButtonKontrahenci;
    private javax.swing.JButton jButtonTowary;
    private javax.swing.JButton jButtonZestawienie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDokumenty;
    private javax.swing.JMenuItem jMenuItemFaktura;
    private javax.swing.JMenuItem jMenuItemFormaPlatnosci;
    private javax.swing.JMenuItem jMenuItemJednostkiMiary;
    private javax.swing.JMenuItem jMenuItemKontrahenci;
    private javax.swing.JMenuItem jMenuItemOprogramie;
    private javax.swing.JMenuItem jMenuItemStawkiVat;
    private javax.swing.JMenuItem jMenuItemTowary;
    private javax.swing.JMenuItem jMenuItemZamknij;
    private javax.swing.JMenuItem jMenuItemZestawienieSprz;
    private javax.swing.JMenu jMenuKoniec;
    private javax.swing.JMenu jMenuUstawienia;
    private javax.swing.JMenu jMenuZestawienia;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
