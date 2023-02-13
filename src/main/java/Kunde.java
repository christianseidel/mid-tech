public class Kunde {

    private int kundennummer;
    private String nachname;
    private String vorname;
    private String strasse;
    private int postleitzahl;
    private String Ort;

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return kundennummer;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }
    public void setOrt(String ort) {
        Ort = ort;
    }
    public String getOrt() {
        return Ort;
    }
}
