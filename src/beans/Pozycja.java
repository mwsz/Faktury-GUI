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
public class Pozycja {

    private int id;
    private int id_faktury;
    private String nazwa;
    private String pkwiu;
    private String jednm;
    private double ilosc;
    private double cena_netto;
    private String vat_opis;
    private double vat;
    private double cena_brutto;
    private double wartosc_netto;
    private double wartosc_brutto;

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

    public int getId_faktury() {
        return id_faktury;
    }

    public void setId_faktury(int id_faktury) {
        this.id_faktury = id_faktury;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public String getJednm() {
        return jednm;
    }

    public void setJednm(String jednm) {
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

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public String getVat_opis() {
        return vat_opis;
    }

    public void setVat_opis(String vat_opis) {
        this.vat_opis = vat_opis;
    }

    public double getWartosc_brutto() {
        return wartosc_brutto;
    }

    public void setWartosc_brutto(double wartosc_brutto) {
        this.wartosc_brutto = wartosc_brutto;
    }

    public double getWartosc_netto() {
        return wartosc_netto;
    }

    public void setWartosc_netto(double wartosc_netto) {
        this.wartosc_netto = wartosc_netto;
    }


    public ArrayList<Pozycja> ListPozycji(int id_faktury) {

        ArrayList listapozycji = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from pozycja where faktura=" + id_faktury + ";");
            Pozycja objPozycja;

            while (table.next()) {
                objPozycja = new Pozycja();
                objPozycja.setId(table.getInt("id"));
                objPozycja.setId_faktury(table.getInt("faktura"));
                objPozycja.setNazwa(table.getString("nazwa"));
                objPozycja.setPkwiu(table.getString("pkwiu"));
                objPozycja.setJednm(table.getString("jednm"));
                objPozycja.setIlosc(table.getDouble("ilosc"));
                objPozycja.setCena_netto(table.getDouble("cena_netto"));
                objPozycja.setCena_brutto(table.getDouble("cena_brutto"));
                objPozycja.setVat(table.getDouble("vat"));
                objPozycja.setWartosc_netto(table.getDouble("wartosc_brutto"));
                objPozycja.setWartosc_brutto(table.getDouble("wartosc_brutto"));
                listapozycji.add(objPozycja);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listapozycji;
    }


    public void dodajPozycje() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into pozycja(faktura, nazwa, pkwiu, jednm, cena_netto, vat, cena_brutto, ilosc, wartosc_netto, wartosc_brutto) values("
                    + this.getId_faktury() + ", '"
                    + this.getNazwa() + "', '"
                    + this.getPkwiu() + "', '"
                    + this.getJednm() + "', "
                    + this.getCena_netto() + ", "
                    + this.getVat() + ", "
                    + this.getCena_brutto() + ", "
                    + this.getIlosc() + ", "
                    + this.getWartosc_netto() + ", "
                    + this.getWartosc_brutto() + ")";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


}
