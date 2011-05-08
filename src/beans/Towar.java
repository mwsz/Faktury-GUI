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
public class Towar {

    private int id;
    private String skrot;
    private String nazwa;
    private String pkwiu;
    private int jednm;
    private int vat;
    private double cena_netto;
    private double cena_brutto;

    public double getCena_brutto() {
        return cena_brutto;
    }

    public void setCena_brutto(double cena_brutto) {
        this.cena_brutto = cena_brutto;
    }

    public double getCena_netto() {
        return cena_netto;
    }

    public void setCena_netto(double cena_netto) {
        this.cena_netto = cena_netto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJednm() {
        return jednm;
    }

    public void setJednm(int jednm) {
        this.jednm = jednm;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public ArrayList<Towar> ListaTowarow() {

        ArrayList listaTowarow = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from towar order by skrot");
            Towar objTowar;

            while (table.next()) {
                objTowar = new Towar();
                objTowar.setId(table.getInt("id"));
                objTowar.setSkrot(table.getString("skrot"));
                objTowar.setNazwa(table.getString("nazwa"));
                objTowar.setPkwiu(table.getString("pkwiu"));
                objTowar.setJednm(table.getInt("jednm"));
                objTowar.setVat(table.getInt("vat"));
                objTowar.setCena_netto(table.getDouble("cena_netto"));
                objTowar.setCena_brutto(table.getDouble("cena_brutto"));
                listaTowarow.add(objTowar);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaTowarow;
    }
          
    public void znajdzTowar(int fid) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from towar where id=" + fid);

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setId(table.getInt("id"));
                this.setSkrot(table.getString("skrot"));
                this.setNazwa(table.getString("nazwa"));
                this.setPkwiu(table.getString("pkwiu"));
                this.setJednm(table.getInt("jednm"));
                this.setVat(table.getInt("vat"));
                this.setCena_netto(table.getDouble("cena_netto"));
                this.setCena_brutto(table.getDouble("cena_brutto"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void dodajTowar() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into towar(skrot, nazwa, pkwiu, jednm, vat, cena_netto, cena_brutto) values('"
                    + this.getSkrot() + "', '"
                    + this.getNazwa() + "', '"
                    + this.getPkwiu() + "', '"
                    + this.getJednm() + "', "
                    + this.getVat() + ", "
                    + this.getCena_netto() + ", "
                    + this.getCena_brutto() + ")";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void poprawTowar(int pid) {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "update towar set skrot='"
                    + this.getSkrot() + "', nazwa='"
                    + this.getNazwa() + "', pkwiu='"
                    + this.getPkwiu() + "', jednm='"
                    + this.getJednm() + "', vat="
                    + this.getVat() + ", cena_netto="
                    + this.getCena_netto() + ", cena_brutto="
                    + this.getCena_brutto() + " where id=" + pid;
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void usunTowar() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "delete from towar where id =" + this.getId();
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    



}
