/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import dao.FakturyDao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mariusz
 */
public class FormaPlatnosci {

    private int id;
    private String opis;
    private int ilosc_dni;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIlosc_dni() {
        return ilosc_dni;
    }

    public void setIlosc_dni(int ilosc_dni) {
        this.ilosc_dni = ilosc_dni;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String toString() {
        return opis;
    }


    public ArrayList<FormaPlatnosci> ListaFormaPlatnosci() {

        ArrayList listaFormPlatnosci = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from forma_platnosci");
            FormaPlatnosci objFormaPlatnosci;

            while (table.next()) {
                objFormaPlatnosci = new FormaPlatnosci();
                objFormaPlatnosci.setId(table.getInt("id"));
                objFormaPlatnosci.setOpis(table.getString("opis"));
                objFormaPlatnosci.setIlosc_dni(table.getInt("ilosc_dni"));
                listaFormPlatnosci.add(objFormaPlatnosci);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaFormPlatnosci;
    }

    public void znajdzFormePlatnosci(int fid) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from forma_platnosci where id=" + fid);

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setOpis(table.getString("opis"));
                this.setIlosc_dni(table.getInt("ilosc_dni"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void dodajFormePlatnosci() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into forma_platnosci(opis, ilosc_dni) values('"
                    + this.getOpis() + "' , "
                    + this.getIlosc_dni() + ")";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void poprawFormePlatnosci(int pid) {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "update forma_platnosci set opis='"
                    + this.getOpis() + "', ilosc_dni="
                    + this.getIlosc_dni() + "where id=" + pid;
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void usunFormePlatnosci() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "delete from forma_platnosci where id =" + this.getId();
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }



}
