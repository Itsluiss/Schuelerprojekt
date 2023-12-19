public class Verwaltung {
    String vorname = "";
    String nachname = "";


    Verwaltung(String pvorname, String pnachname) {
        this.vorname = pvorname;
        this.nachname = pnachname;
    }

    public String getVorname() {

        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setVorname(String pVorname) {
        this.vorname = pVorname;
    }

    public void setNachname(String pNachname) {
        this.nachname = pNachname;
    }
}

