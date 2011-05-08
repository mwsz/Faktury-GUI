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
public class Jednostka {

    private Integer id;
    private String jednostka_m;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJednostka_m() {
        return jednostka_m;
    }

    public void setJednostka_m(String jednostka_m) {
        this.jednostka_m = jednostka_m;
    }

    public String toString() {
        return jednostka_m;
    }

    public ArrayList<Jednostka> ListaJednostek() {

        ArrayList listaJednostek = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from jednostka order by jednostka_m");
            Jednostka objJednostka;

            while (table.next()) {
                objJednostka = new Jednostka();
                objJednostka.setId(table.getInt("id"));
                objJednostka.setJednostka_m(table.getString("jednostka_m"));
                listaJednostek.add(objJednostka);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaJednostek;
    }

    public void znajdzJednostke(int fid) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from jednostka where id=" + fid);

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setJednostka_m(table.getString("jednostka_m"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void dodajJednostke() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into jednostka(jednostka_m) values('"
                    + this.getJednostka_m() + "')";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void poprawJednostke(int pid) {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "update jednostka set jednostka_m='"
                    + this.getJednostka_m() + "' where id=" + pid;
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void usunJednostke() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "delete from jednostka where id =" + this.getId();
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
