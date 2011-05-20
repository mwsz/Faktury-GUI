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
public class Faktura {

    private int id;
    private String nr;
    private String data_wystawienie;
    private String data_sprzedazy;
    private String termin_platnosci;
    private String forma_platnosci;
    private int id_kontrahent;
    private ArrayList<Pozycja> lista_pozycji = new ArrayList();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_sprzedazy() {
        return data_sprzedazy;
    }

    public void setData_sprzedazy(String data_sprzedazy) {
        this.data_sprzedazy = data_sprzedazy;
    }

    public String getData_wystawienie() {
        return data_wystawienie;
    }

    public void setData_wystawienie(String data_wystawienie) {
        this.data_wystawienie = data_wystawienie;
    }

    public String getForma_platnosci() {
        return forma_platnosci;
    }

    public void setForma_platnosci(String forma_platnosci) {
        this.forma_platnosci = forma_platnosci;
    }

    public int getId_kontrahent() {
        return id_kontrahent;
    }

    public void setId_kontrahent(int id_kontrahent) {
        this.id_kontrahent = id_kontrahent;
    }

    public ArrayList<Pozycja> getLista_pozycji() {
        return lista_pozycji;
    }

    public void setLista_pozycji(ArrayList<Pozycja> lista_pozycji) {
        this.lista_pozycji = lista_pozycji;
    }

    public void dodajPozycje(Pozycja q) {
        this.lista_pozycji.add(q);
    }

    public void usunPozycje(int q) {
        this.lista_pozycji.remove(q);
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getTermin_platnosci() {
        return termin_platnosci;
    }

    public void setTermin_platnosci(String termin_platnosci) {
        this.termin_platnosci = termin_platnosci;
    }



    public ArrayList<Faktura> ListaFaktur() {

        ArrayList listaFaktur = new ArrayList();
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from faktura;");
            Faktura objFaktura;

            while (table.next()) {
                objFaktura = new Faktura();
                objFaktura.setId(table.getInt("id"));
                objFaktura.setNr(table.getString("nr"));
                objFaktura.setData_wystawienie(table.getString("data_wystawienie"));
                objFaktura.setData_sprzedazy(table.getString("data_sprzedazy"));
                objFaktura.setTermin_platnosci(table.getString("termin_platnosci"));
                objFaktura.setForma_platnosci(table.getString("forma_platnosci"));
                objFaktura.setId_kontrahent(table.getInt("kontrahent"));
                Pozycja poz = new Pozycja();
                objFaktura.setLista_pozycji(poz.ListPozycji(table.getInt("id")));
                listaFaktur.add(objFaktura);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaFaktur;
    }

    public void dodajFakture() {
        try {
            FakturyDao objFakturyDao = new FakturyDao();
            String zapytanie = "insert into faktura(nr, data_wystawienie, data_sprzedazy, kontrahent, forma_platnosci, termin_platnosci) values('"
                    + this.getNr() + "', '"
                    + this.getData_wystawienie() + "', '"
                    + this.getData_sprzedazy() + "', "
                    + this.getId_kontrahent() + ", '"
                    + this.getForma_platnosci() + "', '"
                    + this.getTermin_platnosci() + "')";
            objFakturyDao.Wykonaj(zapytanie);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }

        this.znajdzFakture(this.getNr());

        ArrayList<Pozycja> lista = new ArrayList();
        lista = this.getLista_pozycji();

        for (Pozycja x : lista) {
            x.setId_faktury(this.getId());
            x.dodajPozycje();
        }
    }

    public void znajdzFakture(String nr) {

        try {
            FakturyDao objFakturyDao = new FakturyDao();
            ResultSet table = objFakturyDao.Lista("select * from faktura where nr='" + nr + "'");

            while (table.next()) {
                this.setId(table.getInt("id"));
                this.setNr(table.getString("nr"));
                this.setData_wystawienie(table.getString("data_wystawienie"));
                this.setData_sprzedazy(table.getString("data_sprzedazy"));
                this.setId_kontrahent(table.getInt("kontrahent"));
                this.setForma_platnosci(table.getString("forma_platnosci"));
                this.setTermin_platnosci(table.getString("termin_platnosci"));
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


}
