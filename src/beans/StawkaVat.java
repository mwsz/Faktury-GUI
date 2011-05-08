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
public class StawkaVat {

    private int id;
    private String stawkavat;
    private int wartoscvat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStawkavat() {
        return stawkavat;
    }

    public void setStawkavat(String stawkavat) {
        this.stawkavat = stawkavat;
    }

    public int getWartoscvat() {
        return wartoscvat;
    }

    public void setWartoscvat(int wartoscvat) {
        this.wartoscvat = wartoscvat;
    }

    public String toString() {
        return stawkavat;
    }

    public ArrayList<StawkaVat> ListaStawekVat() {

        ArrayList listaStawekVat = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from stawkavat order by wartoscvat");
            StawkaVat objStawkaVat;

            while (table.next()) {
                objStawkaVat = new StawkaVat();
                objStawkaVat.setId(table.getInt("id"));
                objStawkaVat.setStawkavat(table.getString("stawkavat"));
                objStawkaVat.setWartoscvat(table.getInt("wartoscvat"));
                listaStawekVat.add(objStawkaVat);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaStawekVat;
    }

    public void znajdzStawkeVat(int fid) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from stawkavat where id=" + fid);

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setStawkavat(table.getString("stawkavat"));
                this.setWartoscvat(table.getInt("wartoscvat"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void dodajStawkeVat() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into stawkavat(stawkavat, wartoscvat) values('"
                    + this.getStawkavat() + "', "
                    + this.getWartoscvat() + ")";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void poprawStawkeVat(int pid) {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "update stawkavat set stawkavat='"
                    + this.getStawkavat() + "', wartoscvat="
                    + this.getWartoscvat() + " where id=" + pid;
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void usunStawkeVat() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "delete from stawkavat where id =" + this.getId();
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
